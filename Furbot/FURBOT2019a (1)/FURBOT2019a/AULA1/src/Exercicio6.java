
import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;

public class Exercicio6 extends Furbot {

    public static void tste(String[] args) {
        MundoVisual.iniciar("Exercicio6.xml");
    }

    public void inteligencia() throws Exception {
        //escreva aqui
        String posicao;
        if (ehVazio(DIREITA)) {
            while (!ehFim(DIREITA)) {
                posicao = "" + getX() + "," + getY();
    		diga (posicao);
                if(ehVazio(DIREITA)){
                    andarDireita();
                }else{
                    if(ehVazio(ABAIXO)){
                    andarAbaixo();
                    }else{
                        diga("é fim aqui");
                    }
                    while(!ehFim(DIREITA)){
                        posicao = "" + getX() + "," + getY();
                        diga (posicao);
                       if(!ehVazio(DIREITA)){
                           ehFim(AQUIMESMO);
                           diga("é fim aqui mesmo");
                       }else{
                           andarDireita();
                     }
                    }  
                if(ehVazio(ACIMA)){
                    andarAcima();
                    diga("cheguei estou vivo!");
                }                  
                }               
            }
            diga("é fim aqui");
        }else{
            ehFim(AQUIMESMO);
                diga("tem alien");
                }
        }
    }



            
    

                
    

                
                
                
                        
                
                

