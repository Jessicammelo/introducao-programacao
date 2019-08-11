
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class prova02 extends Exception {

    public static void tste(String[] args) throws IOException {
        int equipeA = 0;
        int equipeB = 0;
        String pontoDigitado = "";
        while (!pontoDigitado.equals("f")) {
            pontoDigitado = JOptionPane.showInputDialog(null, "Entre com (A) da Equipe A ou (B) da Equipe B ou (F) para sair");
            switch (pontoDigitado.charAt(0)) {
                case 'A':
                    System.out.println("Você apertou A!");
                    equipeA += Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o valor do ponto"));
                    break;
                case 'B':
                    System.out.println("Você apertou b!");
                    equipeB += Integer.parseInt(JOptionPane.showInputDialog(null,"Entre com o valor do ponto"));
                    break;
                case 'F':
                    System.out.println("Você apertou F e chegou ao fim!");
                    break;
            }
        }
        System.out.println("Pontuação da equipe A" + equipeA);
        System.out.println("Pontuação da equipe B" + equipeB);
        System.out.println(equipeA > equipeB ? "a" : "b");
    }
}
