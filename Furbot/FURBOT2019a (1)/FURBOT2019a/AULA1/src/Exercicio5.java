import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
        
public class Exercicio5 extends Furbot{
    public static void tste(String[]args){
        MundoVisual.iniciar("Exercicio5.xml");
    }
  
    public void inteligencia()throws Exception{
        //escreva aqui
        while(ehVazio(DIREITA)){
            andarDireita();
        }
        if(ehObjetoDoMundoTipo("alien", DIREITA)){
            andarAbaixo();
        }
        while(!ehFim(DIREITA)){
            andarDireita();
        }
        if(!ehFim(ACIMA)){
            andarAcima();
        }
        
        diga("cheguei vivo!");
        

    }
}
