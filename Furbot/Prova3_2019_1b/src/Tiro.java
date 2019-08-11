import javax.swing.ImageIcon;

import br.furb.furbot.Direcao;
import br.furb.furbot.ObjetoDoMundo;
import br.furb.furbot.ObjetoDoMundoAdapter;
import br.furb.furbot.suporte.LoadImage;

public class Tiro extends ObjetoDoMundoAdapter {

	private Direcao direcaoDesteTiro;
	private ImageIcon imagemDesteTiro;

	// metodo CONSTRUTOR da classe usado para inicializar os atributos (variaveis)
	// desta classe
	// recebe uma direcao como parametro e decide qual imagem este tiro deve
	// receber.

	public Tiro(Direcao direcao) {
		this.direcaoDesteTiro = direcao;
		try {
			switch (direcao) {
			case DIREITA: {
				this.imagemDesteTiro = LoadImage.getInstance().getIcon("tiroDIREITA.png");
				break;
			}
			case ESQUERDA: {
				this.imagemDesteTiro = LoadImage.getInstance().getIcon("tiroESQUERDA.png");
				break;
			}
			case ACIMA: {
				this.imagemDesteTiro = LoadImage.getInstance().getIcon("tiroACIMA.png");
				break;
			}
			case ABAIXO: {
				this.imagemDesteTiro = LoadImage.getInstance().getIcon("tiroABAIXO.png");
				break;
			}
			}//switch

			desbloquear();
			setTempoEspera(20);
		} catch (Exception e) {
			System.out.println("ocorreu um erro na criacao da imagem do tiro");
		}
	}

	@Override
	public ImageIcon buildImage() {
		return imagemDesteTiro; //retorna a imagem que este tiro possui
	}

	@Override
	// metodo que implementa o comportamento do tiro
	public void executar() throws Exception {

		while (!ehFim(direcaoDesteTiro)) {// enquanto o tiro consegue "andar" naquela direcao...

			ObjetoDoMundo obj = getObjeto(direcaoDesteTiro); // pega o objeto que esta na proxima celula naquela direcao
			if (obj != null) { // se existe um objeto
				if (obj.getSouDoTipo().equals("Inimigo")) { //se ele eh do tipo Inimigo
					Inimigo inimigoEncontrado = (Inimigo) obj; // entao pega o inimigo
					inimigoEncontrado.inimigoFoiDestruido(); //
					break;
				}
			}

			switch (direcaoDesteTiro) {
			case ABAIXO:
				andarAbaixo();
				break;

			case ACIMA:
				andarAcima();
				break;

			case DIREITA:
				andarDireita();
				break;

			case ESQUERDA:
				andarEsquerda();
				break;
			}
		}

		removerMe();
	}

}
