
import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Prova1Questao3_GABARITO extends Furbot {

    public void inteligencia() throws Exception {
        //declaracao de variaveis utilizadas no programa
        int contaNumerosEncontrados = 0;
        String meunome;
        
        boolean continuar = true;
        int contaPassos = 0;
        Direcao direcaoSorteada = ABAIXO; //inicia com uma direcao qualquer
        Random gerador = new Random();//inicia gerador de numeros aleatorios
        int numeroSorteado = 0;

        limparConsole();
        
        InputStreamReader teclado = new InputStreamReader (System.in);
        BufferedReader in = new BufferedReader (teclado);
        System.out.println ("Informe seu nome: ");
        meunome = in.readLine();
        
        
        while (continuar == true) { //repete este laco ate que continua = false
            //sorteia um numero entre 0..3
            numeroSorteado = gerador.nextInt() % 4; //pega valor aleatorio entre 0 e 3
            //decide qual a direcao a seguir a partir do numero sorteado
            switch (numeroSorteado) {
                case 3: { //se for 3, vai para a DIREITA
                    direcaoSorteada = DIREITA;
                    break; //pula para o fim do switch
                }
                case 2: { //se for 2, vai para a ESQUERDA
                    direcaoSorteada = ESQUERDA;
                    break; //pula para o fim do switch
                }
                case 1: {//se for 1, vai para a CIMA
                    direcaoSorteada = ACIMA;
                    break; //pula para o fim do switch
                }
                case 0: {//se for 1, vai para BAIXO
                    direcaoSorteada = ABAIXO;
                    break; //pula para o fim do switch
                }
            }// fim do sorteio da direcao

            if (!ehFim(direcaoSorteada)) { //se nao ehFim na direcao sorteada 
                
                //------------resposta da prova 3
                if (ehObjetoDoMundoTipo("Numero", direcaoSorteada)) {
                    contaNumerosEncontrados = contaNumerosEncontrados +1;
                }
                //-----------fim resposta prova 3
                
                switch (direcaoSorteada) { //anda naquela direcao
                    case  DIREITA: {andarDireita();break;}
                    case ESQUERDA: {andarEsquerda();break;}
                    case    ACIMA: {andarAcima();break;}
                    case   ABAIXO: {andarAbaixo();break;}
                } //fim switch que mapeia a direcao
                
                contaPassos = contaPassos + 1;
                if (contaPassos > 1) {
                    diga("contador=" + contaPassos + " passos.");//plural
                } else {
                    diga("contador=" + contaPassos + " passo."); //singular
                }
                
            } else { //encontrou o fim na direcao sorteada
                if (direcaoSorteada == DIREITA) //se ela eh DIREITA entao para de repetir
                   continuar = false;
                else { //se eh uma direcao diferente de DIREITA, continua andando aleatoriamente
                    //continua a andar
                }
            }// fim do passo de decisao de encerrar o laco de repeticao ou continuar
        }//fim do while
        
        diga("ola "+meunome+ "  !!!!");
        diga("cheguei ao fim do algoritmo... e estou vivo!!!");
        diga("Encontrei "+contaNumerosEncontrados+ " numeros no meu passeio");
    }

    public static void tste(String[] args) {
        //MundoVisual.iniciar("MundoDeFurbot.xml"); // inicia o mundo do furbot
        MundoVisual.iniciar("Prova1Questao3.xml"); // inicia o mundo do furbot
    }
}
