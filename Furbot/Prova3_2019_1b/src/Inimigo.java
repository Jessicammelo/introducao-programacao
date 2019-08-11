import javax.swing.ImageIcon;

import br.furb.furbot.Direcao;
import br.furb.furbot.ObjetoDoMundoAdapter;
import br.furb.furbot.suporte.LoadImage;

public class Inimigo extends ObjetoDoMundoAdapter {

	private Direcao direcao;
	private boolean fuiDestruido = false, estouVivo = true;
	private ImageIcon imgAtual;
	private int tempoEspera;
	private int posicaoNoArrayDeInimigos;
	private FurbotTiroAoAlvo furbot; // o inimigo precisa "conhecer" o controlador do jogo

	public Inimigo(int posicaoNoArrayDeInimigos, int tempoEspera, FurbotTiroAoAlvo furbot) {
		desbloquear();
		setTempoEspera(0); // tempo de espera padrao
		this.direcao = DIREITA;
		this.tempoEspera = tempoEspera; //estabelece o tempo de espera antes de movimentar-se
		this.imgAtual = LoadImage.getInstance().getIcon("imagens/alien_0.png"); 
		this.posicaoNoArrayDeInimigos = posicaoNoArrayDeInimigos;
	}

	@Override
	public ImageIcon buildImage() {
		return imgAtual;
	}

	@Override
	public void executar() throws Exception {
		esperar(1); // para parecer que ele nasce nas extremidades do mundo
		while (!fuiDestruido && !ehFim(direcao)) {

			ObjetoDoMundoAdapter obj = getObjeto(direcao);
			if (obj != null) {

				if (obj.getSouDoTipo().equals("Tiro")) {
					break; // se levou um tiro, entao sai
				}

				if (obj.getSouDoTipo().startsWith("Inimigo")) {
					continue; // se outro inimigo entao ignore dar um passo
				}

				FurbotTiroAoAlvo naveFurbot = (FurbotTiroAoAlvo) obj;
				naveFurbot.naveFurbotDestruida();
			}
			setTempoEspera(tempoEspera);
			switch (direcao) {
			case ACIMA:
				andarAcima();
				break;

			case ABAIXO:
				andarAbaixo();
				break;

			case ESQUERDA:
				andarEsquerda();
				break;

			case DIREITA:
				andarDireita();
				break;

			}
			setTempoEspera(0);
		}// while
		
		//----------------
		// chega aqui somente quando fuiDestruido ou ehFim(direcao))
		if (fuiDestruido) { // precisa repintar o inimigo com uma explosao
			this.imgAtual = LoadImage.getInstance().getIcon("explosao.png");
			repintar();
			esperar(1); //espera o usuario "visualizar" a explosao
		}
		//de qualquer forma, precisa retirar este inimigo que foi destruido
		if (furbot != null) {
			furbot.retirarInimigo(this); //faz com que o inimigo pare de ocupar o tabuleiro
		}

		estouVivo = false;
		removerMe();
	}

	public void inimigoFoiDestruido() {
		fuiDestruido = true;
	}

	public boolean inimigoEstaVivo() {
		return estouVivo;
	}

	public int getPosicaoNoArrayDeInimigos() {
		return posicaoNoArrayDeInimigos;
	}

}
