
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//testando codigo para o orientando da Luciana
public class IdentificarCodigoJava {
    public static void tste(String[]args){
        
        List<Integer> listaNumeros;
        listaNumeros = new ArrayList<Integer>();
        int numero = 0;
        double mediaValores = 0;
        int somaValores = 0;
       
        
        //recebe valores até o usuário digitar -1
        while(numero != -1){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro ou -1 para sair: "));
            if(numero != -1){
                listaNumeros.add(numero);  
            }
       }
        
      
       
      
           int opcao = Integer.parseInt(JOptionPane.showInputDialog("digite 1 para calular somente a média, digite 2 para calcular somente a soma: " ));
            switch(opcao){
               
                 case 1 : for(int x : listaNumeros){
                             somaValores += x;            
                          } 
                         mediaValores = somaValores / listaNumeros.size();
                         JOptionPane.showMessageDialog(null, "A média é: " + mediaValores);
                         break;

                case 2 : for(int x : listaNumeros){
                             somaValores += x;            
                         }  
                         JOptionPane.showMessageDialog(null, "A soma é: " + somaValores);
                         break;
             
            }
    }
}
