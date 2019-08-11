
import javax.swing.JOptionPane;

//Ler uma série de números e imprimir apenas os números
//tais que 5 <= num < 12. Encerrar quando o número lido for
//negativo.
public class Exercicio19 {

    public static void tste(String[] args) {
        float numero = 0;
        String num = "";

        while (numero != -1) {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "digite uma nota: "));
            if (5 <= numero && numero < 12) {
                num += " O numero: " + numero + " está dentro de 5 <= num < 12" + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, num);
    }
}
