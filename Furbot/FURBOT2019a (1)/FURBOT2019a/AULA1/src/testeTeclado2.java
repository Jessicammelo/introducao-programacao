
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class testeTeclado2 {
    public static void tste (String[] args) throws Exception{
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Digite sua idade! ");
        String resposta = in.readLine();    
        int idade = Integer.parseInt(resposta);
        System.out.println("Vc tem "+ idade+ " anos agora!");
        
        int ano;
        ano = 2019 - idade;
        System.out.println("Vc provavelmente nasceu no ano de: " + ano);
        
    }
}
