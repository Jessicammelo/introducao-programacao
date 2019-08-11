import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
        
public class Exercicio4 extends Furbot{
    public static void tste(String[]args){
        MundoVisual.iniciar("Exercicio4.xml");
    }
    public void inteligencia()throws Exception{
        //escreva aqui
        while(!ehFim(DIREITA)){
            andarDireita();
        }
        diga("cheguei na parede!!");
        while(!ehFim(ABAIXO)){
            andarAbaixo();
        }
        diga("cheguei na parede!!");
        while(!ehFim(ESQUERDA)){
            andarEsquerda();
        }
        diga("cheguei na parede!!");
        while(!ehFim(ACIMA)){
            andarAcima();
        }
        diga("cheguei no inicio!!");
    }
    
}
