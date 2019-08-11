import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;

public class Exercicio1 extends Furbot{
//public static void tste (String[]args){
    //MundoVisual.iniciar("Exercicio1.xml");
//}
public void inteligencia() throws Exception{
        //escrever aq
        while(!ehFim(DIREITA)){
            andarDireita();
        }//fim do while
        diga("ola mundo cheguei");
        
    }
}

