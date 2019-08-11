
import javax.swing.JOptionPane;

//Ler e imprimir 5 valores numéricos e identificar o maior e o
//menor valor da série. 
public class Exercicio16 {
    public static void tste(String[]args){
        int[] num = new int[5];
        int maiorNum = 0;
        int menorNum = Integer.MAX_VALUE;
        String numeros = "";
        
        for(int i =0;i<5;i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"digite um valor numérico: "));
            
        }
       for(int i=0;i<5;i++){
           if( num[i]>maiorNum){
               maiorNum = num[i];
           }
           if(num[i]<menorNum ){
               menorNum = num[i];
           }
          numeros += "numero digitado: " + num[i] + "\n";
       }
       JOptionPane.showMessageDialog(null,numeros);
       JOptionPane.showMessageDialog(null,"maior numero: " +maiorNum+ "\nmenor numero: "+ menorNum);
    }
}
