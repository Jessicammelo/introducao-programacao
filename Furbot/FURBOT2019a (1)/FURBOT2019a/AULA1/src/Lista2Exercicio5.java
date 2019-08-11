//<enunciado>Lista de Exercícios 2 - Exercício 5.
  //<br> Faça o robô andar até a célula (0,0). </br>
  //<br> Em seguida faça ele andar pelo mundo todo</br>
  //<br> e contando os aliens. Quando ele alcançar</br>
  //<br> a última célula deve falar a quantidade de aliens encontrados.<br>
//</enunciado> 
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;


public class Lista2Exercicio5 extends Furbot {

    public static void tste(String[] args) {
        MundoVisual.iniciar("Lista2Exercicio5.xml");
    }

    @Override
    public void inteligencia() throws Exception {
        int quantAlien = 0;
        while(!ehFim(ESQUERDA)){
            andarEsquerda();
        }
        while(!ehFim(ACIMA)){
            andarAcima();
        }
        diga("cheguei na linha e coluna 0,0!");
        while(!ehFim(DIREITA)){
        while(!ehFim(ABAIXO)){
            andarAbaixo();
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien + 1;
            }
        }
        if(!ehFim(DIREITA)){
            andarDireita();
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien + 1;
            }
        }
        while(!ehFim(ACIMA)){
            andarAcima();
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien + 1;
            }
        }
        if(!ehFim(DIREITA)){
            andarDireita();
            if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien + 1;
            }
        }
        }
        if(ehFim(DIREITA)){
            while(!ehFim(ABAIXO)){
                andarAbaixo();
                if(ehObjetoDoMundoTipo("alien", AQUIMESMO)){
                quantAlien = quantAlien + 1;
            }
            }
        }
        diga("cheguei!");
        if(quantAlien > 1){
            diga("Tem " + quantAlien + " aliens");
        }else{
            diga("Tem " + quantAlien + " alien");
        }
}
}
