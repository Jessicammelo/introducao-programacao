
//Faça o Furbot andar em zigue zague pelo mundo e, encontrando
//números pelo caminho, conte quantos são PARES e quantos são
//IMPARES
import br.furb.furbot.Furbot;
import br.furb.furbot.Direcao;
import br.furb.furbot.MundoVisual;
import static br.furb.furbot.ObjetoDoMundoAdapter.ABAIXO;
import static br.furb.furbot.ObjetoDoMundoAdapter.DIREITA;
import static br.furb.furbot.ObjetoDoMundoAdapter.ESQUERDA;
import static br.furb.furbot.ObjetoDoMundoAdapter.AQUIMESMO;
import static br.furb.furbot.ObjetoDoMundoAdapter.ACIMA;


public class FurbotAndaZiqueZaque extends Furbot {
    public void inteligencia() throws Exception {
        int contaNumerosEncontrados = 0;
        int numeroPar = 0;
        int numeroImpar = 0;
        while(!ehFim(DIREITA)){
        while(!ehFim(DIREITA)){
            andarDireita();
            if (ehObjetoDoMundoTipo("Numero",AQUIMESMO)) {
                
                if(contaNumerosEncontrados / 2 ==0){
                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                    numeroPar ++;
                }else{
                    numeroImpar++;
                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                }
            
        }
          
        }
        if(ehFim(DIREITA)){
              andarAbaixo();
              if (ehObjetoDoMundoTipo("Numero",AQUIMESMO)) {
                  if(contaNumerosEncontrados / 2 ==0){
                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                    numeroPar ++;
                }else{
                    numeroImpar++;
                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                }
           
          }  
        
    }
        while(!ehFim(ESQUERDA)){
            andarEsquerda();
               if (ehObjetoDoMundoTipo("Numero",AQUIMESMO)) {
                  
                   if(contaNumerosEncontrados / 2 ==0){
                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                    numeroPar ++;
                }else{
                    numeroImpar++;
                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                }
            }       
           
        }
        if(ehFim(ESQUERDA)){
               andarAbaixo();
               if (ehObjetoDoMundoTipo("Numero",AQUIMESMO)) {
                   
                   if(contaNumerosEncontrados / 2 ==0){
                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                    numeroPar ++;
                }else{
                    numeroImpar++;
                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                }
            
                }
            }
        }
        diga(+numeroImpar + " numeros impares");
        diga("cheguei ao fim do algoritmo... e estou vivo!!!");
        diga("Encontrei "+contaNumerosEncontrados+ " numeros no meu passeio");
        diga( +numeroPar + " numeros pares ");
    }
    
    public static void tste(String []args){ 
        MundoVisual.iniciar("FurbotZigueZague.xml");
    }
    
}


   
