
import javax.swing.JOptionPane;

//Ler um conjunto de dados contendo o nome e uma nota
//referentes a 4 alunos. Se a nota for maior ou igual a 6,
//apresentar o nome do aluno e a mensagem “aprovado”,
//caso contrário apresentar o nome do aluno e a mensagem
//“reprovado”. Contar quantos alunos foram aprovados e
//quantos alunos foram reprovados. Encerrar quando a nota
//for negativa.
public class Exercicio9 {

    public static void tste(String[] args) {
        float nota;
        String aluno;
        int alunoAprov = 0;
        int alunoRep = 0;
        for (int i = 0; i < 4; i++) {
            aluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
            nota = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do aluno"));
            if (nota == -1) {
                break;
            } else if (nota >= 6) {
                JOptionPane.showMessageDialog(null, aluno + " está aprovado");
                alunoAprov++;
            } else {
                JOptionPane.showMessageDialog(null, aluno + " está reprovado");
                alunoRep++;
            }
        }
        JOptionPane.showMessageDialog(null, "quantidade de alunos aprovados: " + alunoAprov
                + "quantidade de alunos reprovados: " + alunoRep);
    }
}
