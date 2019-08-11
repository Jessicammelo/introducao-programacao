
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class testeTeclado {
    public static void tste(String[] args) throws Exception{
        BufferedReader in = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Digite seu nome: ");
        
        String meuNome;
        meuNome = in.readLine();
        System.out.println(" olá " + meuNome);
        
    }
}
