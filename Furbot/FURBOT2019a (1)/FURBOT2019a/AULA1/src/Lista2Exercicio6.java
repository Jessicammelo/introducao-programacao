
//<enunciado>Lista de Exercícios 2 - Exercício 6.
//<br> Faça o robô andar ao redor do mundo e contar os aliens</br>
//<br> que ele encontrou no caminho. O robô deve voltar a célula </br>
//<br> de nascença para então falar a quantidade de aliens</br>
//<br>encontrados: no total, nas linhas pares, nas linhas ímpares,</br>
//<br> nas colunas pares e nas colunas ímpares.</br>
//</enunciado> 
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;

public class Lista2Exercicio6 extends Furbot {

    public static void tste(String[] args) {
        MundoVisual.iniciar("Lista2Exercicio6.xml");
    }

    @Override
    public void inteligencia() throws Exception {
      
        int getX = getX();
        int getY = getY();
        int colunaPar = 0;
        int linhaPar = 0;
        int colunaImpar = 0;
        int linhaImpar = 0;
        String posicao;
        while (!ehFim(ESQUERDA)) {
            andarEsquerda();
        }
        while (!ehFim(ACIMA)) {
            andarAcima();
        }
        while (!ehFim(DIREITA)) {
            while (!ehFim(ABAIXO)) {
                andarAbaixo();
                posicao = "" + getX() + " , " + getY();
                diga(posicao);
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    
                    if (getX() % 2 == 0) {
                        colunaPar = colunaPar + 1;
                    } else {
                        colunaImpar = colunaImpar + 1;
                    }
                    if (getY() % 2 == 0) {
                        linhaPar = linhaPar + 1;
                    } else {
                        linhaImpar = linhaImpar + 1;
                    }
                }

            }

            if (!ehFim(DIREITA)) {
                andarDireita();
                posicao = "" + getX() + " , " + getY();
                diga(posicao);
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    if (getX() % 2 == 0) {
                        colunaPar = colunaPar + 1;
                    } else {
                        colunaImpar = colunaImpar + 1;
                    }
                    if (getY() % 2 == 0) {
                        linhaPar = linhaPar + 1;
                    } else {
                        linhaImpar = linhaImpar + 1;
                    }
                }
            }
            while (!ehFim(ACIMA)) {
                andarAcima();
                posicao = "" + getX() + " , " + getY();
                diga(posicao);
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    if (getX() % 2 == 0) {
                        colunaPar = colunaPar + 1;
                    } else {
                        colunaImpar = colunaImpar + 1;
                    }
                    if (getY() % 2 == 0) {
                        linhaPar = linhaPar + 1;
                    } else {
                        linhaImpar = linhaImpar + 1;
                    }
                }
            }

            if (!ehFim(DIREITA)) {
                andarDireita();
                posicao = "" + getX() + " , " + getY();
                diga(posicao);
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    if (getX() % 2 == 0) {
                        colunaPar = colunaPar +1;
                    } else {
                        colunaImpar = colunaImpar +1;
                    }
                    if (getY() % 2 == 0) {
                        linhaPar = linhaPar +1;
                    } else {
                        linhaImpar = linhaImpar +1;
                    }

                }
            }
        }
        if (ehFim(DIREITA)) {
            while (!ehFim(ABAIXO)) {
                andarAbaixo();
                posicao = "" + getX() + " , " + getY();
                diga(posicao);
                if (ehObjetoDoMundoTipo("alien", AQUIMESMO)) {
                    if (getX() % 2 == 0) {
                        colunaPar = colunaPar +1;
                    } else {
                        colunaImpar = colunaImpar +1;
                    }
                    if (getY() % 2 == 0) {
                        linhaPar = linhaPar +1;
                    } else {
                        linhaImpar = linhaImpar +1;
                    }
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
        int totalAliens = linhaPar + colunaImpar;
        if (totalAliens > 1) {
            diga("Tem " + totalAliens + " aliens no caminho!");
            diga("Nas colunas pares tem " + colunaPar + " aliens ");
            diga("Nas colunas impares tem " + colunaImpar + " aliens ");
            diga("Nas linhas pares tem " + linhaPar + " aliens ");
            diga("Nas linhas impares tem " + linhaImpar + " aliens ");

        } else {
            diga("Tem " + totalAliens + " alien no caminho!");
            diga("Nas colunas pares tem " + colunaPar + " alien ");
            diga("Nas colunas impares tem " + colunaImpar + " alien ");
            diga("Nas linhas pares tem " + linhaPar + " alien ");
            diga("Nas linhas impares tem " + linhaImpar + " alien ");
        }
    }
}
