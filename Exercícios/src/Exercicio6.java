
import javax.swing.JOptionPane;

//Ler um conjunto de dados (nome, nota1 e nota2) referentes a 45
//alunos. Imprimir o nome de cada aluno e a sua maior nota. Ao
//final apresentar a média das notas.
public class Exercicio6 {

    public static void tste(String[] args) {
        float media = 0;
        for (int i = 0; i < 45; i++) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(
                    null, "Digite a nota do aluno"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(
                    null, "Digite a segunda nota do aluno"));
            if (nota1 > nota2) {
                JOptionPane.showMessageDialog(null, " nome: " + nome + "\n nota: " + nota1);
                media = nota1;
            } else {
                JOptionPane.showMessageDialog(null, " nome: " + nome + "\n nota: " + nota2);
                media = nota2;
            }
        }
        JOptionPane.showMessageDialog(null, "Media = " + (media / 45));
    }
}
