
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Ler e imprimir um conjunto n notas de alunos. Identificar a
//maior nota informada. Encerrar o programa quando o a nota
//for negativa.
public class Exercicio12 {

    public static void tste(String[] args) {
        float nota = Integer.MAX_VALUE;
        float maiorNota = 0;
        List<Float> notas = new ArrayList<>();
        String numero = " ";
        while (nota != -1) {
            nota = Integer.parseInt(JOptionPane.showInputDialog(null, "digite uma nota: "));
            if (nota != -1) {
                notas.add(nota);
            }
            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }
        for (int i = 0; i < notas.size(); i++) {
            numero += notas.get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, "notas dos alunos:" + numero);
        JOptionPane.showMessageDialog(null, "maior nota: " + maiorNota);
    }
}
