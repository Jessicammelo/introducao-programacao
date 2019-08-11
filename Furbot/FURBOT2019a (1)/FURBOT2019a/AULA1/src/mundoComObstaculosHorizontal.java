import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import br.furb.furbot.Direcao;
import static br.furb.furbot.ObjetoDoMundoAdapter.ABAIXO;
import static br.furb.furbot.ObjetoDoMundoAdapter.DIREITA;
import static br.furb.furbot.ObjetoDoMundoAdapter.ESQUERDA;
import static br.furb.furbot.ObjetoDoMundoAdapter.AQUIMESMO;
import static br.furb.furbot.ObjetoDoMundoAdapter.ACIMA;

public class mundoComObstaculosHorizontal  extends Furbot{
    
    @Override
    public void inteligencia() throws Exception {
        float getY = getY();
        String posicao;
        posicao = "" + getX() + "," + getY();
        while(!ehFim(DIREITA)){
            andarDireita();
            if(ehObjetoDoMundoTipo("alien", DIREITA)){
                if(ehObjetoDoMundoTipo("alien", ABAIXO)){
                    ehFim(AQUIMESMO);
                }else{
                 andarAbaixo();
                }
                if(ehObjetoDoMundoTipo("alien", DIREITA)){
                    if(ehFim(ABAIXO)){
                    ehFim(AQUIMESMO);
                }else{
                 andarAbaixo();
                }
                }
                
            }
        }
       
        while(getY > getY()){
            andarAbaixo();
        }
        while(getY < getY()){
            andarAcima();
        }
              
        diga("cheguei estou vivo!");
    
        
    }
     public static void tste(String []args){ 
        MundoVisual.iniciar("mundoComObstaculosHorizontal.xml");
    }
}

