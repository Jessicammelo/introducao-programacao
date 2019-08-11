import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;

import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import br.furb.furbot.suporte.LoadImage;

public class FurbotTiroAoAlvo extends Furbot {
	// tamanho do mundo
	private static final int MAX_LINHAS = 12;
	private static final int MAX_COLUNAS = 12;
	private static final int MAX_NUMERO_INIMIGOS_SIMULATANEOS = 20; // inimigos simultaneos
	private static final int TOTAL_IMAGENS_NAVES = 12;

	private boolean naveEstaViva = true;
	// ---------------------
	// declara um array que armazena 5 imagens da nave em 4 direcoes mais a imagem da explosao
	private ImageIcon[] imagensNave;

	// ---------------------
	// direcaoFoguete eh a variavel inteira utilizada como indice para acessar
	// uma posicao especifica no array "imagensFoguetes" para selecionar
	// qual imagem de foguete vamos utilizar em funcao da direcao do tiro
	private int direcaoFoguete;

	// ---------------------
	// array que armazena os inimigos do jogo. Suporta no maximo x inimigos

	private  Inimigo[] arrayDeInimigos = new Inimigo[MAX_NUMERO_INIMIGOS_SIMULATANEOS];
	public boolean[] inimigosVivos = new boolean[MAX_NUMERO_INIMIGOS_SIMULATANEOS];

	// ---------------------
	// variavel que serve como indicador de quantos inimigos foram efetivamente
	// criados
	private int totalInimigosCriados = 0;

	// ---------------------
	// metodo CONSTRUTOR que inicializa as variaveis do jogo
	// carregando as imagens do disco e armazenando-as num array chamado
	// "imagensNave"
	public FurbotTiroAoAlvo() {
		try {
			imagensNave = new ImageIcon[5]; // cria um array de 5 posicoes

			imagensNave[0] = LoadImage.getInstance().getIcon("img_nave_esquerda.png");
			imagensNave[1] = LoadImage.getInstance().getIcon("img_nave_abaixo.png");
			imagensNave[2] = LoadImage.getInstance().getIcon("img_nave_direita.png");
			imagensNave[3] = LoadImage.getInstance().getIcon("img_nave_acima.png");
			imagensNave[4] = LoadImage.getInstance().getIcon("explosao.png");
			direcaoFoguete = 3; // indica que a primeira direcao é a imagem "ACIMA" (posicao 3 do array)

		} catch (Exception e) {
			System.out.println("ocorreu um erro na criacao das imagens dos foguetes");
		}
	}

	@Override
	// retorna uma das imagens de foguete a partir do array "imagensFoguetes"
	// a partir do indice da imagem selecionado.
	public ImageIcon buildImage() {
		if (direcaoFoguete < TOTAL_IMAGENS_NAVES) {
			System.out.println (direcaoFoguete);
			return imagensNave[direcaoFoguete];
		} else 
			//voce vai aprender sobre HERANCA no proximo semestre mas, para adiantar, 
			// o que estamos fazendo aqui é carregar a imagem padrao do furbot
			// no caso de ter algum erro no indice que é utilizado neste metodo
			return super.buildImage(); 
	}

	
	private Direcao moveANaveNaDirecao(Direcao dir) {
		if (!ehFim(dir)) {
			if (!ehVazio(dir)) {
				naveEstaViva = false; // a nave "bateu" em algum obstaculo e o jogo encerrou
			} else {
				switch (dir) {
				case ACIMA:
					andarAcima();
					break;
				case ABAIXO:
					andarAbaixo();
					break;
				case DIREITA:
					andarDireita();
					break;
				case ESQUERDA:
					andarEsquerda();
					break;
				}
			}
		}
		return dir;

	}
	@Override
	// aqui implementa a inteligencia do "furbot" agora chamado de FurbotTiroAoAlvo
	public void inteligencia() throws Exception {
		setTempoEspera(0);

		int nascAlien = 0;

		Direcao ultDirecao = DIREITA;
		while (naveEstaViva) {// enquanto a nave (furbot) está "viva", fica repetindo o loop

			// pega uma tecla do teclado
			int tecla = getUltimaTeclaPress();

			// os inimigos nascem a cada x vezes em que passa por aqui
			if (nascAlien == 10) { 
				criarNovoAlienInimigo();
				nascAlien = 0; // reinicia a contagem
			}

			nascAlien++;

			switch (tecla) {
			case TECLACIMA:
				ultDirecao = moveANaveNaDirecao(ACIMA);
				break;

			case TECLABAIXO:
				ultDirecao = moveANaveNaDirecao(ABAIXO);
				break;

			case TECLADIREITA:
				ultDirecao = moveANaveNaDirecao(DIREITA);
				break;

			case TECLAESQUERDA:
				ultDirecao = moveANaveNaDirecao(ESQUERDA);
				break;

			case TECLAESPACO:
				adicionarObjetoNoMundo(new Tiro(ultDirecao), AQUIMESMO);
			}

			if (tecla != 0) {
				direcaoFoguete = ultDirecao.ordinal();
				repintar();
			}
		} // while

		// chega aqui quando a nave foi destruida e o jogo acabou

		direcaoFoguete = 4; // seleciona a imagem de explosao
		repintar(); // repinta o mundo
		esperar(5);
		removeInimigosDoJogo();
	}

	// metodo que indica se algum inimigo ainda esta vivo no tabuleiro
	boolean existeAlgumInimigoVivo() {
		boolean existeAlgumInimigoVivo = false;
		for (int i = 0; i < totalInimigosCriados; i++) {
			if (inimigosVivos[i] == true) { // se encontrou algum inimigo vivo na buscao
				existeAlgumInimigoVivo = true; // retorna que encontrou
				break;
			}
		} // for
		return existeAlgumInimigoVivo;
	}

	// ---------
	// este metodo eh chamado para limpar o tabuleiro com os inimigos que ainda nao
	// foram
	// destruidos.
	// chegamos aqui porque a nave foi destruida
	private void removeInimigosDoJogo() {
		for (int i = 0; i < totalInimigosCriados; i++) {
			arrayDeInimigos[i].inimigoFoiDestruido();
		}

		// precisa esperar ate que todos os inimigos tenham sido destruidos
		while (existeAlgumInimigoVivo() == true) {
			esperar(1);
		}// while
	}



	private Direcao sortearDirecao() {
		int direcaoSorteada = Math.abs(sortear() % 4);
		switch (direcaoSorteada) {
		case 0:
			return DIREITA;
		case 1:
			return ESQUERDA;
		case 2:
			return ABAIXO;
		case 3:
			return ACIMA;
		default:
			return DIREITA;
		}
	}

	private int retornaPrimeiraPosicaoDisponivelNoArray() {
		// procura uma posicao que esteja marcada com false e indica que aquela posicao
		// esta disponivel
		
		int posicaoDisponivel = MAX_NUMERO_INIMIGOS_SIMULATANEOS + 1;
		
		for (int i = 0; i < MAX_NUMERO_INIMIGOS_SIMULATANEOS; i++) {
			if (this.inimigosVivos[i] == false) {
				posicaoDisponivel = i;
			}
		}
		return posicaoDisponivel;
	}

	/**
	 * Adicionar um inimigo no mundo.
	 */
	private void criarNovoAlienInimigo() {

		int posicao = retornaPrimeiraPosicaoDisponivelNoArray();

		if (posicao <= MAX_NUMERO_INIMIGOS_SIMULATANEOS) { // ha posicoes disponiveis no array
			Direcao dir = sortearDirecao();

			// cria um inimigo com uma direcao inicial de movimento, e com um tempo de
			// espera antes de agir de 1 segundo
			// cria um novo Inimigo

			//------------------ x-x-x 
			Inimigo inimigo = new Inimigo(posicao, 500, this); 
																

			arrayDeInimigos[posicao] = inimigo;
			inimigosVivos[posicao] = true;
			totalInimigosCriados++;

			// seleciona uma posicao x,y onde o objeto possa ser inserido no mundo
			boolean conseguiuInserirNoMundo = false;
			while (conseguiuInserirNoMundo != true) {
				int y = Math.abs(sortear() % MAX_LINHAS);
				int x = Math.abs(sortear() % MAX_COLUNAS);
				if (y < MAX_COLUNAS - 4) { // reserva a ultima linha para o furbot nascer
					if (this.getObjetoXY(x, y) == null) { // se nao tem objeto na posicao sorteada
						adicionarObjetoNoMundoXY(inimigo, x, y);
						conseguiuInserirNoMundo = true; // indica que conseguiu inserir o objeto encerrando o laco
					}
				}
			} // while
		} else {
			// nao faz nada porque todas as posicoes estao ocupadas
		}

	}

	public void retirarInimigo(Inimigo inimigo) {
		int posicaoDesteInimigo = inimigo.getPosicaoNoArrayDeInimigos();
		if (posicaoDesteInimigo < this.MAX_NUMERO_INIMIGOS_SIMULATANEOS) {
			arrayDeInimigos[posicaoDesteInimigo] = null;
			inimigosVivos[posicaoDesteInimigo] = false;
			totalInimigosCriados--; // diminui o total de inimigos no mundo
		}
	}

	public void naveFurbotDestruida() {
		naveEstaViva = false;
	}

	public static void main(String[] args) {
		MundoVisual.iniciar("FurbotTiroAoAlvo.xml");
	}

}
