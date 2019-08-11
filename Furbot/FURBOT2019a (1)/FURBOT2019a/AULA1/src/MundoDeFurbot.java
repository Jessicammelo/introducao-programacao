
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;

public class MundoDeFurbot extends Furbot {

    public void inteligencia() throws Exception {
    //escreva o seu código aqui
    diga("versao mauro");
      andarDireita();
      andarDireita();
             
      diga("ola mundo!!!!");
      diga("cheguei ao fim do algoritmo... e estou vivo!!!");
    }

    public static void tste(String[] args) {
        MundoVisual.iniciar("MundoDeFurbot.xml"); // inicia o mundo do furbot
    }
}
