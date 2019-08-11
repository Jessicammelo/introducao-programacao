
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Ler e imprimir um conjunto de dados (nome e nota) referentes a
//4 alunos. Ao final apresentar a média das notas.
public class Exercicio5 {

    public static void tste(String[] args) {
        float nota1, nota2, nota3, nota4;
        String aluno1, aluno2, aluno3, aluno4;
        aluno1 = JOptionPane.showInputDialog(null, "Digite o nome do primeiro aluno");
        nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do primeiro aluno"));
        aluno2 = JOptionPane.showInputDialog(null, "Digite o nome do segundo aluno");
        nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do segundo aluno"));
        aluno3 = JOptionPane.showInputDialog(null, "Digite o nome do terceiro aluno");
        nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do terceiro aluno"));
        aluno4 = JOptionPane.showInputDialog(null, "Digite o nome do quanto aluno");
        nota4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do quarto aluno"));
        JOptionPane.showMessageDialog(null, "Primeiro aluno: " + aluno1
                + " \nnota: " + nota1
                + " \nsegundo aluno: " + aluno2
                + " \nnota: " + nota2
                + " \nTerceiro aluno: " + aluno3
                + " \nnota: " + nota3
                + " \nQuarto aluno: " + aluno4
                + " \nnota: " + nota4);
        float media = (nota1 + nota2 + nota3 + nota4) /4;
        JOptionPane.showMessageDialog(null, "media dos alunos " + media);
    }
}
