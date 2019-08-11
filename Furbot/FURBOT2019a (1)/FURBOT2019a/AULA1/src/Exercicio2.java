
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;

public class Exercicio2 extends Furbot{
  public static void tste(String[]args){
      MundoVisual.iniciar("Exercicio2.xml");
  }
    public void inteligencia() throws Exception{
        //escrever aq
        while(!ehFim(ABAIXO)){
            andarAbaixo();
        }
        diga("cheguei estou vivo");
    }
}
