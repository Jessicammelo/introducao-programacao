
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import static br.furb.furbot.ObjetoDoMundoAdapter.DIREITA;

// Aluna:Jessica Maria de Melo
public class ProvaN_1 extends Furbot {

    public static void main(String[] args) {
        MundoVisual.iniciar("ProvaN_1.xml");
    }

    public void inteligencia() throws Exception {
        String posicao;
        int getX = getX();
        int getY = getY();
        int colunaPar = 0;
        int colunaImpar = 0;
        int linhaPar = 0;
        int linhaImpar = 0;

        posicao = " " + getX() + "," + getY();
        diga("O furbot nasceu na posição: " + posicao);
        while (!ehFim(ESQUERDA)) {
            andarEsquerda();
        }
        while (!ehFim(ACIMA)) {
            andarAcima();
        }
        while (!ehFim(DIREITA)) {
            andarDireita();
            if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                posicao = " " + getX() + "," + getY();
                diga("Encontrei um alien na posição:" + posicao);
                if (getX() % 2 == 0) {
                    colunaPar++;
                } else {
                    colunaImpar++;
                }
                if (getY() % 2 == 0) {
                    linhaPar++;
                } else {
                    linhaImpar++;
                }
            }
        }
        while (!ehFim(ABAIXO)) {
            andarAbaixo();
            if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                posicao = " " + getX() + "," + getY();
                diga("Encontrei um alien na posição: " + posicao);
                if (getX() % 2 == 0) {
                    colunaPar++;
                } else {
                    colunaImpar++;
                }
                if (getY() % 2 == 0) {
                    linhaPar++;
                } else {
                    linhaImpar++;
                }
            }
        }
        while (!ehFim(ESQUERDA)) {
            andarEsquerda();
            if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                posicao = " " + getX() + "," + getY();
                diga("Encontrei um alien na posição: " + posicao);
                if (getX() % 2 == 0) {
                    colunaPar++;
                } else {
                    colunaImpar++;
                }
                if (getY() % 2 == 0) {
                    linhaPar++;
                } else {
                    linhaImpar++;
                }
            }
        }
        while (!ehFim(ACIMA)) {
            andarAcima();
            if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                posicao = " " + getX() + "," + getY();
                diga("Encontrei um alien na posição: " + posicao);
                if (getX() % 2 == 0) {
                    colunaPar++;
                } else {
                    colunaImpar++;
                }
                if (getY() % 2 == 0) {
                    linhaPar++;
                } else {
                    linhaImpar++;
                }
            }
        }
        while (getX > getX()) {
            andarDireita();
        }
        while (getX < getX()) {
            andarEsquerda();
        }
        while (getY > getY()) {
            andarAbaixo();
        }
        while (getY < getY()) {
            andarAcima();
        }
        diga("Voltei onde nasci!");
        diga(" Tinha " + colunaPar + " aliens nas colunas pares.");
        diga(" Tinha " + colunaImpar + " aliens nas colunas impares.");
        diga(" Tinha " + linhaPar + " aliens nas linhas pares.");
        diga(" Tinha " + linhaImpar + " aliens nas linhas impares.");

    }
}
