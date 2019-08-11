
import javax.swing.JOptionPane;

//Um programa recebe um valor x, calcula as expressões x2 e x3. Após
//cada interação, apresente o valor de x e os valores calculados.
//Encerrar o programa quando o valor digitado for zero. 
public class Exercicio3 {

    public static void tste(String[] args) {
        String valorDigitado;
        int valor = -1;
        int valorQuadrado = -1;
        int valorCubo = -1;
        while (valor != 0) {
            valorDigitado = JOptionPane.showInputDialog(null, "Entre com um valor");
            valor = Integer.parseInt(valorDigitado);
            if (valor != 0) {
                valorQuadrado = valor * valor;
                valorCubo = valor * (valor * valor);
                JOptionPane.showMessageDialog(null, "valor digitado: " + valor
                        + "\nvalor digitado ao quadrado: " + valorQuadrado
                        + "\n valor digitado ao cubo: " + valorCubo);
            } else {
                switch (valor) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "digitou zero pra sair ");
                }
            }
        }
    }
}
