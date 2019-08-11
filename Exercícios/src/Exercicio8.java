
import javax.swing.JOptionPane;

//Ler um conjunto de dados contendo o nome e uma nota
//referentes a 4 alunos. Se a nota for maior ou igual a 6,
//apresentar o nome do aluno e a mensagem “aprovado”,
//caso contrário apresentar o nome do aluno e a mensagem
//“reprovado”.
public class Exercicio8 {

    public static void tste(String[] args) {
        float nota;
        String aluno;
        for (int i = 0; i < 4; i++) {
            aluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
            nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno"));
            if (nota >= 6) {
                JOptionPane.showMessageDialog(null, aluno + " está aprovado");
            } else {
                JOptionPane.showMessageDialog(null, aluno + " está reprovado");
            }
        }
    }
}
