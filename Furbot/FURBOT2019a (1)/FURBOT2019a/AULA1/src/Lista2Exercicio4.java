
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
//<enunciado>Lista de Exercícios 2 - Exercício 4.
  //<br> Faça o robô andar ao redor do mundo e contar os aliens</br>
  //<br> que ele encontrou no caminho. O robô deve voltar a célula </br>
  //<br> de nascença para então falar a quantidade de aliens encontrados:</br>
  //<br> no total, na coluna 0, na linha 0, na última coluna e na ultima linha.</br>
//</enunciado>
public class Lista2Exercicio4 extends Furbot {

    public static void tste(String[] args) {
        MundoVisual.iniciar("Lista2Exercicio4.xml");
    }
    @Override
    public void inteligencia() throws Exception {
        int quantAlien = 0;
        int quantAlienColuna = 0;
        int quantAlienUltColuna = 0;
        int getX = getX();
        int getY = getY();
        String posicao;
        while(!ehFim(ESQUERDA)){
            andarEsquerda();
        }
        while(!ehFim(ACIMA)){
            andarAcima();
        }
        while(!ehFim(DIREITA)){
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien +1;
            }
        while(!ehFim(ABAIXO)){
            andarAbaixo();
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien +1;
            }
        }
         posicao = "" + getX() + "," + getY();
         if(quantAlien >1){
             diga(posicao + " tem " + quantAlien + " aliens");
         }else{
             diga(posicao + " tem " + quantAlien + " alien");
         }
         quantAlienColuna= quantAlien;
        
        if(!ehFim(DIREITA)){
            andarDireita();
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien +1;
            }
        }
        while(!ehFim(ACIMA)){
            andarAcima();
            posicao = " " + getX() + "," + getY();
        diga(posicao);
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien +1;
            }
        }
        if(!ehFim(DIREITA)){
            andarDireita();
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien +1;
            }
            if(ehFim(DIREITA)){
             //faltou somar a ultima linha!!
                while(!ehFim(ABAIXO)){
                    andarAbaixo();
                    if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien +1;
                 quantAlienUltColuna = quantAlien;
                        }
                    }
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
        quantAlien = quantAlienUltColuna;
        if(quantAlien >1){
            diga( " total de " + quantAlien + " aliens ");
            diga("total de aliens na coluna 0: " + quantAlienColuna + " aliens");
            diga("total de aliens na ultima coluna: " + quantAlienUltColuna + " aliens");
    }else{
            diga(" total de " + quantAlien + quantAlienUltColuna + " alien ");
            diga("total de alien na coluna 0:" + quantAlienColuna + " alien");
            diga("total de alien na ultima coluna: " + quantAlienUltColuna + " alien");
        }
    }
}
