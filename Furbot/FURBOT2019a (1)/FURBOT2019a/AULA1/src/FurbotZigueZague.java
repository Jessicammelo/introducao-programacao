
import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import static br.furb.furbot.ObjetoDoMundoAdapter.ABAIXO;
import static br.furb.furbot.ObjetoDoMundoAdapter.DIREITA;
import static br.furb.furbot.ObjetoDoMundoAdapter.ESQUERDA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class FurbotZigueZague extends Furbot {
   
    public void inteligencia() throws Exception {
        //declaracao de variaveis utilizadas no programa
        int contaNumerosEncontrados = 0;
        //String meunome;
        
        boolean continuar = true;
        int contaPassos = 0;
        Direcao direcaoSorteada = ABAIXO; //inicia com uma direcao qualquer
        Random gerador = new Random();//inicia gerador de numeros aleatorios
        int numeroSorteado = 0;
        int valorDoObjeto = 0;
        int quantPar = 0;
        int quantImpar = 0;
        int objetoNumero = 0;
        limparConsole();
        
        //-----------------------------------------------------------
       // InputStreamReader teclado = new InputStreamReader (System.in);
        //BufferedReader in = new BufferedReader (teclado);
        //System.out.println ("Informe seu nome: ");
        //meunome = in.readLine();
        //--------------------------------------------------------------
        direcaoSorteada = DIREITA;
        while (continuar == true) { //repete este laco ate que continua = false
                if (!ehFim(direcaoSorteada)) { //se nao ehFim na direcao sorteada 
                
                //------------resposta da prova 3
                if (ehObjetoDoMundoTipo("Numero", direcaoSorteada)) {
                    contaNumerosEncontrados = contaNumerosEncontrados +1;
                   // objetoNumero = getObjeto(direcaoSorteada);
                    
                }
                //-----------fim resposta prova 3
                
                switch (direcaoSorteada) { //anda naquela direcao
                    case  DIREITA: {andarDireita();break;}
                    case ESQUERDA: {andarEsquerda();break;}
                    case    ACIMA: {andarAcima();break;}
                    case   ABAIXO: {andarAbaixo();break;}
                } //fim switch que mapeia a direcao
                
                contaPassos = contaPassos + 1;
                
            } else { //encontrou o fim na direcao sorteada
                if (!ehFim(ABAIXO)) {
                    if (ehObjetoDoMundoTipo("Numero", ABAIXO)) {
                        contaNumerosEncontrados = contaNumerosEncontrados +1;
                       // objetoNumero = getObjeto(direcaoSorteada);
                        
                     }
                    andarAbaixo();
                    contaPassos++;
                    //se vinha da esquerda para a direita
                    if (direcaoSorteada == DIREITA) {
                        direcaoSorteada = ESQUERDA; //entao vai da direita para a esquerda
                    } else {
                        direcaoSorteada = DIREITA; //senao vai da esquerda para a direita
                    }
                } else { //eh fim abaixo
                    continuar = false;
                }
            }// fim do passo de decisao de encerrar o laco de repeticao ou continuar
        }//fim do while
       

        //diga("ola "+meunome+ "  !!!!");
        diga("cheguei ao fim do algoritmo... e estou vivo!!!");
        diga("Encontrei "+contaNumerosEncontrados+ " numeros no meu passeio");
        
        if (contaPassos > 1) {
           diga("Realizei =" + contaPassos + " passos.");//plural
        } else {
           diga("Realizei =" + contaPassos + " passo."); //singular
        }
    }
    
    public static void tste(String[] args) {
        //MundoVisual.iniciar("MundoDeFurbot.xml"); // inicia o mundo do furbot
        MundoVisual.iniciar("FurbotZigueZague2.xml"); // inicia o mundo do furbot
    }

    
}

