
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Ler e imprimir um conjunto n notas de alunos. Identificar a
//menor nota informada. Encerrar o programa quando o a nota
//for negativa.
public class Exercicio13 {

    public static void tste(String[] args) {
        float nota = Integer.MAX_VALUE;
        float menorNota = Integer.MAX_VALUE;
        List<Float> notas = new ArrayList<>();
        String numero = " ";

        while (nota != -1) {
            if (nota < menorNota) {
                menorNota = nota;
            }
            nota = Integer.parseInt(JOptionPane.showInputDialog(null, "digite uma nota: "));
            if(nota != -1){
                 notas.add(nota);
            }
        }
        for(int i = 0;i<notas.size();i++){
           numero += notas.get(i).toString()+"\n";
        }
        JOptionPane.showMessageDialog(null,"notas dos alunos:" + numero);
        JOptionPane.showMessageDialog(null, "menor nota: " + menorNota);
    }
}
