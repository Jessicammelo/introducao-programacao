
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

//Um programa recebe três valores, calcula a expressão d=b2-
//4.a.c. e verifica se há raízes imaginárias. Em não havendo,
//calcula as expressões: x1 = (-b + ⎷d)/2.a e x2 = (-b - ⎷d)/2.a.
//Ao final, apresenta as raízes encontradas.
//Encerrar o programa quando o valor da variável a for zero. 
public class Exercicio4 {

    public static void tste(String[] args) {
        //a = 1, b = 12 e c = – 13
        double enquanto = -1d;
        double x1 = 0;
        double x2 = 0;
        String exibir = "";
        while (enquanto != 0) {
            Double delta = 0d;
            double[] valor = new double[3];
            for (int i = 0; i < 3; i++) {
                valor[i] = Double.parseDouble(JOptionPane.showInputDialog(
                        "Digite 1 número maior que zero:"));
            }
            delta = (valor[1] * valor[1]) - (4 * (valor[0] * valor[2]));
            if (delta >= 0) {
                // x1 = (-b + ⎷d)/2.a
                Double raizDelta = Math.sqrt(delta);
                x1 = (-valor[1] + raizDelta) / (2 * valor[0]);
                //x2 = (-b - ⎷d)/2.a
                x2 = (-valor[1] - raizDelta) / (2 * valor[0]);
                exibir += "Raizes encontradas x1: " + x1 + "\nx2:" + x2;
            } else {
                JOptionPane.showMessageDialog(null, "raís imaginária:");
            }
            enquanto = Double.parseDouble(JOptionPane.showInputDialog(
                    "digite zero pra parar:"));
        }
        if (!exibir.equals("")) {
            JOptionPane.showMessageDialog(null, exibir);
        }
    }
}
