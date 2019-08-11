import br.furb.furbot.Direcao;
import br.furb.furbot.Furbot;
import br.furb.furbot.MundoVisual;


public class Inteligencia2  extends Furbot {
     public static void tste(String[] args) {
        MundoVisual.iniciar("Exercicio1.xml");
    }
    
    public void inteligencia() throws Exception {
      // exemplo da pagina 11 da apostila
    	diga ("este é um exemplo de mensagem");
    	
    	//aqui estamos declarando uma "variavel" que recebera o conteudo
    	// da frase a direita do sinal de igual (=)
    	String msg = "Este é um objeto que contém a msg a ser apresentada na tela";
    	diga (msg);
    	//limparConsole();
    	
    	
    	// exemplo de getX() e getY()
    	
    	String posicao;  //declara a variavel "posicao" uma vez para que
    	                 //ela possa receber as coordenadas de posicao do
    	                 //furbot
    	while (!ehFim(DIREITA)) {
    		andarDireita();
    		posicao = "" + getX() + "," + getY();
    		diga (posicao);
    	}//fim do while
    	while (!ehFim(ABAIXO)) {
    		andarAbaixo();
    		posicao = "" + getX() + "," + getY();
    		diga (posicao);
    	}//fim do while

    	while (!ehFim(ESQUERDA)) {
    		andarEsquerda();
    		posicao = "" + getX() + "," + getY();
    		diga (posicao);
    	}//fim do while

    	while (!ehFim(ACIMA)) {
    		andarAcima();
    		posicao = "" + getX() + "," + getY();
    		diga (posicao);
    	}//fim do while
    	
    	
    	while (!ehFim(ABAIXO)) {
    	   if (!ehFim(DIREITA)) {
    		   andarDireita();
    		   posicao = "" + getX() + "," + getY();
       		   diga (posicao);
    	   }
    	   if (!ehFim(ABAIXO)) {
    		   andarAbaixo();
    		   posicao = "" + getX() + "," + getY();
       		   diga (posicao);
    	   }
    	}
    	
    	
      diga("cheguei ao fim do algoritmo... e estou vivo!!!");
    }

}

