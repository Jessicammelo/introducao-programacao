
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;


public class mundoComObstaculosDiferentes extends Furbot{
    
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
                if(ehObjetoDoMundoTipo("alien", DIREITA)){
                    if(ehFim(ABAIXO)){
                    ehFim(AQUIMESMO);
                }else{
                 andarAbaixo();
                }
                }
                
            }
        }
        diga("cheguei estou vivo!");
    
        
    }
     public static void tste(String []args){ 
        MundoVisual.iniciar("mundoComObstaculosDiferentes.xml");
    }
}

