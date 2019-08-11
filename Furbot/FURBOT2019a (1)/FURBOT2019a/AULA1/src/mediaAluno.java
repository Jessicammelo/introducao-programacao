
import javax.swing.JOptionPane;

/*
 * Fornecido um conjunto de dados referente ao nome de três alunos
com suas respectivas três notas, indique qual dos três alunos possui a
maior media.
 */
public class mediaAluno {

    public static void tste(String[] args) {
        String Aluno1, Aluno2, Aluno3;
        float mediaTotal;
        float nota1 = 0, nota2 = 0, nota3 = 0;

        Aluno1 = JOptionPane.showInputDialog(null, "Digite o nome do primeiro aluno");
        for (int i = 0; i < 3; i++) {
            nota1 += Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota"));
        }
        float media1 = nota1/3;
        Aluno2 = JOptionPane.showInputDialog(null, "Digite o nome do segundo aluno");
        for (int i = 0; i < 3; i++) {
            nota2 += Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota"));
        }
        float media2 = nota2/3;
        Aluno3 = JOptionPane.showInputDialog(null, "Digite o nome do terceiro aluno");
        for (int i = 0; i < 3; i++) {
            nota3 += Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota"));
        }
        float media3 = nota3/3;
        
         if (media1 >= media2 && media1 > media3){
             JOptionPane.showMessageDialog(null,"maior media é: "+media1);
         }else if(media2 >= media3){
              JOptionPane.showMessageDialog(null,"media maior é: "+ media2);
         }else{
             JOptionPane.showMessageDialog(null,"maior media é: " + media3);
	
         }
    }
}
