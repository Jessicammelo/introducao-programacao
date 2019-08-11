
import javax.swing.JOptionPane;

//Ler um conjunto de nomes de pessoas. Encerrar o programa
//quando for informado um nome de pessoa = “X”. Ao final
//informar quantos nomes foram digitados.
public class Exercicio7 {

    public static void tste(String[] args) {
        int contador = 0;
        String nome = JOptionPane.showInputDialog(null, "Digite um nome de pessoa: ");
        while (!nome.equals("x")) {
            contador++;
            nome = JOptionPane.showInputDialog(null, "Digite um nome de pessoa: ");
        }
        JOptionPane.showMessageDialog(null, contador + " nomes");
    }
}
