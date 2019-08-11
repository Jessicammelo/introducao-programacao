
import javax.swing.JOptionPane;

//Uma prova realizada com n alunos possuía 10 questões de múltipla
//escolha, cada questão com 5 possibilidades de resposta (1 a 5). Faça
//um programa para ler o gabarito da prova e depois processar as
//respostas dos n alunos. A medida em que as respostas de um aluno
//tiver sido processada, informar o nome do aluno e a sua nota.
//Encerrar o programa quando o nome do aluno = “sair”. Ao final
//informar a maior nota.
public class Exercicio20 {

    public static void tste(String[] args) {
        String sair = "";
        int[] questoes = new int[10];
        int[] gabarito = new int[10];
        int nota = 0;
        int notaMaior = 0;
        for (int i = 0; i < 10; i++) {
            gabarito[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite gabarito: "));
        }
        while (!sair.equals("sair")) {
            String nome = JOptionPane.showInputDialog(null, "digite o nome do aluno: ");
            if (nome.equals("sair")) {
                break;
            }
            for (int i = 0; i < 10; i++) {
                questoes[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a resposta: "));
            }
            for (int i = 0; i < 10; i++) {
                if (gabarito[i] == questoes[i]) {
                    nota++;
                }
            }
            JOptionPane.showMessageDialog(null, "nome do aluno: " + nome + " nota: " + nota);
            if (nota > notaMaior) {
                notaMaior = nota;
            }
        }
        JOptionPane.showMessageDialog(null, "maior nota: " + notaMaior);
    }
}
