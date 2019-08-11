
import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;
import br.furb.furbot.Numero;
import static br.furb.furbot.ObjetoDoMundoAdapter.ABAIXO;
import static br.furb.furbot.ObjetoDoMundoAdapter.DIREITA;
import static br.furb.furbot.ObjetoDoMundoAdapter.ESQUERDA;
import br.furb.furbot.Tesouro;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class FurbotZigueZagueBoolean extends Furbot {

    boolean objetosEncontrados[][];

    public void inteligencia() throws Exception {
        //declaracao de variaveis utilizadas no programa
        int contaNumerosEncontrados = 0;
        String meunome;
        Numero objetoNumero; //variavel utilizada para "pegar" um numero no mundo

        Tesouro objetoTesouro;
        int valorDoObjeto;

        boolean continuar = true;
        int contaPassos = 0;
        Direcao direcaoSorteada = ABAIXO; //inicia com uma direcao qualquer
        Random gerador = new Random();//inicia gerador de numeros aleatorios
        int numeroSorteado = 0;

        //descobre o total de colunas
        int totalDeColunas = 1;
        while (!ehFim(DIREITA)) {
            andarDireita();
            totalDeColunas++;
        }
        diga("total de colunas=" + totalDeColunas);
        //descobre o total de colunas
        int totalDeLinhas = 1;
        while (!ehFim(ABAIXO)) {
            andarAbaixo();
            totalDeLinhas++;
        }
        diga("total de linhas=" + totalDeLinhas);

        this.mudarPosicao(0, 0); //teletransporta o furbot para a posicao inicial

        objetosEncontrados = new boolean[totalDeColunas][totalDeLinhas];
        // limparConsole();

        //-----------------------------------------------------------
        //InputStreamReader teclado = new InputStreamReader(System.in);
        //BufferedReader in = new BufferedReader(teclado);
        //System.out.println("Informe seu nome: ");
        //meunome = in.readLine();
        //--------------------------------------------------------------
        direcaoSorteada = DIREITA;
        while (continuar == true) { //repete este laco ate que continua = false
            if (!ehVazio(this.AQUIMESMO)) {
                int xa = getX();
                int ya = getY();
                String xx = " " + xa + ", " + ya;
                diga(xx);
                objetosEncontrados[getX()][getY()] = true;
            }
            if (!ehFim(direcaoSorteada)) { //se nao ehFim na direcao sorteada 

                //------------resposta 
                if (ehObjetoDoMundoTipo("Numero", direcaoSorteada)) {

                    contaNumerosEncontrados = contaNumerosEncontrados + 1;
                    objetoNumero = getObjeto(direcaoSorteada);
                    valorDoObjeto = objetoNumero.getValor();
                    diga("o valor do numero eh: " + valorDoObjeto);
                } else {
                    if (ehObjetoDoMundoTipo("Tesouro", direcaoSorteada)) {
                        objetoTesouro = getObjeto(direcaoSorteada);
                        valorDoObjeto = objetoTesouro.getValor();
                        diga("o valor do tesouro eh: " + valorDoObjeto);
                    }
                }
                //-----------fim resposta prova 3

                switch (direcaoSorteada) { //anda naquela direcao
                    case DIREITA: {
                        andarDireita();
                        break;
                    }
                    case ESQUERDA: {
                        andarEsquerda();
                        break;
                    }
                    case ACIMA: {
                        andarAcima();
                        break;
                    }
                    case ABAIXO: {
                        andarAbaixo();
                        break;
                    }
                } //fim switch que mapeia a direcao

                contaPassos = contaPassos + 1;

            } else { //encontrou o fim na direcao sorteada
                if (!ehFim(ABAIXO)) {
                    //--------------------------
                    if (ehObjetoDoMundoTipo("Numero", ABAIXO)) {
                        contaNumerosEncontrados = contaNumerosEncontrados + 1;
                        objetoNumero = getObjeto(ABAIXO);
                        valorDoObjeto = objetoNumero.getValor();
                        diga("o valor do numero eh: " + valorDoObjeto);

                    } else {
                        if (ehObjetoDoMundoTipo("Tesouro", ABAIXO)) {
                            objetoTesouro = getObjeto(ABAIXO);
                            valorDoObjeto = objetoTesouro.getValor();
                            diga("o valor do tesouro eh: " + valorDoObjeto);
                        }
                    }
                    //--------------------------
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
        diga("Encontrei " + contaNumerosEncontrados + " numeros no meu passeio");
        if (contaPassos > 1) {
            diga("Realizei =" + contaPassos + " passos.");//plural
        } else {
            diga("Realizei =" + contaPassos + " passo."); //singular
        }

        for (int x = 0; x < totalDeColunas; x++) {
            for (int y = 0; y < totalDeLinhas; y++) {
                System.out.print("(" + y + "," + x + ")" + objetosEncontrados[y][x] + " ");
            }
            System.out.println();
        }
    }

    public static void tste(String[] args) {
        //MundoVisual.iniciar("MundoDeFurbot.xml"); // inicia o mundo do furbot
        MundoVisual.iniciar("FurbotZigueZagueBoolean.xml"); // inicia o mundo do furbot
    }
}
