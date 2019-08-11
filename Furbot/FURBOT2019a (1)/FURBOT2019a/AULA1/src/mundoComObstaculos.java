
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import br.furb.furbot.Direcao;
import static br.furb.furbot.ObjetoDoMundoAdapter.ABAIXO;
import static br.furb.furbot.ObjetoDoMundoAdapter.DIREITA;
import static br.furb.furbot.ObjetoDoMundoAdapter.ESQUERDA;
import static br.furb.furbot.ObjetoDoMundoAdapter.AQUIMESMO;
import static br.furb.furbot.ObjetoDoMundoAdapter.ACIMA;


public class mundoComObstaculos extends Furbot{
    @Override
    public void inteligencia() throws Exception {
        while(!ehFim(DIREITA)){
            andarDireita();
            if(ehObjetoDoMundoTipo("alien", DIREITA)){
                if(ehFim(ABAIXO)){
                    ehFim(AQUIMESMO);
                }else{
                 andarAbaixo();
  
                }
                
                
            }
        }
        diga("cheguei estou vivo!");
    }
     public static void tste(String []args){ 
        MundoVisual.iniciar("mundoComObstaculos.xml");
    }
}

