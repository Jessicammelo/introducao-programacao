import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
        
public class Exercicio3 extends Furbot{
    public static void tste(String[]args){
        MundoVisual.iniciar("Exercicio3.xml");
    }
    public void inteligencia()throws Exception{
        //escrever aqui
        while(!ehFim(DIREITA)){
            andarDireita();
        }
        while(!ehFim(ABAIXO)){
            andarAbaixo();
        }
        diga("ola cheguei");
        
    }
}
