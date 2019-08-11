
import javax.swing.JOptionPane;

//Suponhamos que você precise produzir uma sequencia como esta:
//[]
//[] []
//[] [] []
//[] [] [] []
//[] [] [] [] []
//[] [] [] [] [] []
//O programa solicita o número de níveis que devem ser gerados.
//Atenção, o número máximo é 10.
public class Exercicio21 {
    public static void tste(String[]args){
        String exibir = "";
        int seguencia = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        for(int i = 0; i < seguencia; i++){
            exibir +=  "\n";
            for(int j = 0; j <= i; j++){
                exibir += "[]";
            }
        }
        JOptionPane.showMessageDialog(null,exibir);
    }
}
