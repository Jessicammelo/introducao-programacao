
import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;

//<enunciado>Lista de Exercícios 2 - Exercício 3.
//<br> Faça o robô andar ao redor do mundo e contar os aliens</br>
//<br> que ele encontrou no caminho. O robô deve voltar a célula </br>
//<br> de nascença para então falar a quantidade de aliens.</br>
public class Lista2Exercicio3 extends Furbot {

    public static void tste(String[] args) {
        MundoVisual.iniciar("Lista2Exercicio3.xml");
    }

    @Override
    public void inteligencia() throws Exception {
        float getX = getX();
        float getY = getY();
        String posicao;
        int quantAlien = 0;
        boolean ultimaLinha = false;
        while (!ehFim(ESQUERDA)) {
            andarEsquerda();
        }
        while (!ehFim(ACIMA)) {
            andarAcima();
        }
        if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    quantAlien = quantAlien + 1;
                }
        while (!ehFim(DIREITA)) {
            while (!ehFim(ABAIXO)) {
                andarAbaixo();
                posicao = "" + getX() + "," + getY();
                diga(posicao);
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    quantAlien = quantAlien + 1;
                }
            }
            if (!ehFim(DIREITA)) {
                andarDireita();
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    quantAlien = quantAlien + 1;
                }
            }
            while (!ehFim(ACIMA)) {
                andarAcima();
                ultimaLinha = true;
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    quantAlien = quantAlien + 1;
                }
                posicao = "" + getX() + "," + getY();
                diga(posicao);
            }
            if (!ehFim(DIREITA)) {
                andarDireita();
                ultimaLinha = false;
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    quantAlien = quantAlien + 1;
                }
            }
        }

        if (ehFim(ACIMA) && !ultimaLinha) {
            while (!ehFim(ABAIXO)) {
                andarAbaixo();
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    quantAlien = quantAlien + 1;
                }
            }
        }
        while(getX > getX()){
            andarDireita();
        }
        while(getX < getX()){
            andarEsquerda();
        }
        while(getY > getY()){
            andarAbaixo();
        }
        while(getY < getY()){
            andarAcima();
        }
        if (quantAlien > 1) {
            diga(quantAlien + " aliens");
        } else {
            diga(quantAlien + " alien");
        }

    }
}
