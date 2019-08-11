
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Questao1 {
    public static void tste(String[]args)throws Exception{
        BufferedReader random = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Digite os valores de entrada para Fa,Fb e Fc:");
        String respostaFa = random.readLine(); 
        String respostaFb = random.readLine(); 
        String respostaFc = random.readLine(); 
        Float fa = Float.parseFloat(respostaFa);
        Float fb = Float.parseFloat(respostaFb);
        Float fc = Float.parseFloat(respostaFc);
       
                
        if(fa< fb && fb < fc){
            System.out.println(+fa+ " fa < "+fb+ " fb < "+fc+" fc " );
        }
        else if(fa < fc ){
            System.out.println(+fa+ " fa < "+fc+" fc" );
        }
        else if(fb < fa && fa < fc) {
            System.out.println(+fa + " fa < " + fc + " fc < " + fb + " fb ");
        }
        else if (fb < fc && fc < fa) {
            System.out.println(+fb + " fb < " + fc + " fc < " + fa + " fa ");
        }
        else if (fc < fa && fa < fb) {
            System.out.println(+fc + " fc < " + fa + " fa < " + fb + " fb ");
        }
        else{
           System.out.println(+fc + " fc < " + fb + " fb < " + fa + " fa "); 
        }

    

}//fim do main

}// fim questao1
