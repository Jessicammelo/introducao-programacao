
import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
//<br> Faça o robô andar ao redor do mundo e contar os aliens</br>
//<br> que ele encontrou no caminho. No final ele deve falar a</br>
//<br> quantidade de aliens encontrados.</br>

public class Lista2Exercicio2 extends Furbot {

    public static void tste(String[] args) {
        MundoVisual.iniciar("Lista2Exercicio2.xml");
    }

    @Override
    public void inteligencia() throws Exception {
        int quantAlien = 0;
        while (!ehFim(DIREITA)) {
            andarDireita();
            if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                quantAlien = quantAlien + 1;
            }
        }
        while (!ehFim(ABAIXO)) {
            andarAbaixo();
            if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                quantAlien = quantAlien + 1;
            }
        }
        while (!ehFim(ESQUERDA)) {
            andarEsquerda();
            if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                quantAlien = quantAlien + 1;
            }
        }
        while (!ehFim(ACIMA)) {
            andarAcima();
            if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                quantAlien = quantAlien + 1;
            }
        }
        diga("cheguei");
        if (quantAlien > 1) {
            diga(" Tinha " + quantAlien + " aliens");
        } else {
            diga(" Tinha " + quantAlien + " alien");
        }
    }

}
