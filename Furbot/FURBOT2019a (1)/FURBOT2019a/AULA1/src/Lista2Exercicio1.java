
import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;

//<enunciado> Lista de Exercicios 2 - Exercicio 1.
//<br>Faça o robo andar ate a ultima coluna contando os aliens.</br>
//<br> No final deve falar a quantidade de aliens encontrados.</br>
//<br>Atencao: nao esqueça do tratamento do singular e plural.</br>
//<br> Se for mais que 1 alien, ele deve dizer aliens.</br>
public class Lista2Exercicio1 extends Furbot {

    public static void tste(String[] args) {
        MundoVisual.iniciar("Lista2Exercicio1.xml");
    }

    @Override
    public void inteligencia() throws Exception {
        int quantAlien = 0;
        while (!ehFim(DIREITA)) {
            andarDireita();
            if (ehObjetoDoMundoTipo("alien", (AQUIMESMO))) {
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
