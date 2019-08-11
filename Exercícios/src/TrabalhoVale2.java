
//Um programa recebe um valor e apresenta este valor na tela.
//Encerrar o programa quando o valor digitado for zero. 
import javax.swing.JOptionPane;
//Exercício2

public class TrabalhoVale2 {

    public static void tste(String[] args) {
        String valorDigitado;
        int valor = -1;
        while (valor != 0) {
            valorDigitado = JOptionPane.showInputDialog(null, "Entre com um valor");
            valor = Integer.parseInt(valorDigitado);
            if (valor != 0) {
                JOptionPane.showMessageDialog(null, "valor digitado " + valor);
            } else {
                switch (valor) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "digitou zero pra sair ");
                }
            }
        }
    }
}
