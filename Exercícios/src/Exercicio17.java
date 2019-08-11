
import javax.swing.JOptionPane;

//Ler e imprimir 10 valores numéricos e identificar se algum deles
//contém zero na parte decimal do número. 
public class Exercicio17 {

    public static void tste(String[] args) {
        float[] num = new float[10];
        String numeros = "";

        for (int i = 0; i < 10; i++) {
            num[i] = Float.parseFloat(JOptionPane.showInputDialog(null, 
                    "digite um valor numérico(10.0): "));
        }
        for (int i = 0; i < 10; i++) {
            int numCopy = (int) num[i];
            float resultado = num[i] - numCopy;
            if (resultado == 0) {
                numeros += "numero digitado: " + num[i] + "\n";
            }
        }
        System.out.println(numeros);
    }
}
