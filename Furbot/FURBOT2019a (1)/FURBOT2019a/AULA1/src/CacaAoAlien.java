// A partir do mundo abaixo, faça o robô encontrar o Alien e
//quando encontra-lo faça-o falar: “Peguei o ET na posição (x,y). Exemplo:
//“Encontrei o ET na posição (3,2)”

import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import br.furb.furbot.Direcao;
import static br.furb.furbot.ObjetoDoMundoAdapter.ABAIXO;
import static br.furb.furbot.ObjetoDoMundoAdapter.DIREITA;
import static br.furb.furbot.ObjetoDoMundoAdapter.ESQUERDA;
import static br.furb.furbot.ObjetoDoMundoAdapter.AQUIMESMO;
import static br.furb.furbot.ObjetoDoMundoAdapter.ACIMA;

public class CacaAoAlien extends Furbot {

    @Override
    public void inteligencia() throws Exception {
        String posicao;
        while(!ehFim(ABAIXO)){
        while (!ehFim(DIREITA)) {
            andarDireita();
            if (ehObjetoDoMundoTipo("Alien", AQUIMESMO)) {
                posicao = "" + getX() + "," + getY();
                diga("Encontrei um alien " + posicao);
            }
        }
        if (!ehFim(ABAIXO)) {
            andarAbaixo();
            if (ehObjetoDoMundoTipo("Alien", AQUIMESMO)) {
                posicao = "" + getX() + "," + getY();
                diga("Encontrei um alien " + posicao);
            } else {
                ehFim(AQUIMESMO);
            }
        }
        while (!ehFim(ESQUERDA)) {
            andarEsquerda();
            if (ehObjetoDoMundoTipo("Alien", AQUIMESMO)) {
                posicao = "" + getX() + "," + getY();
                diga("Encontrei um alien " + posicao);
            }
        }
        if (!ehFim(ABAIXO)) {
            andarAbaixo();
            if (ehObjetoDoMundoTipo("Alien", AQUIMESMO)) {
                posicao = "" + getX() + "," + getY();
                diga("Encontrei um alien " + posicao);
            } else {
                ehFim(AQUIMESMO);
            }
        }
        }
        if (ehVazio(DIREITA)) {
            while(!ehFim(DIREITA)){
                andarDireita();
            }
            
        }else if(ehVazio(ESQUERDA)){
            while(!ehFim(ESQUERDA)){
                andarEsquerda();
            }
        }

        diga("cheguei ao fim do algoritmo... e estou vivo!!!");
    }

    public static void tste(String[] args) {
        MundoVisual.iniciar("CacaAoAlien.xml");
    }
}
