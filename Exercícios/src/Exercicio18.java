
import javax.swing.JOptionPane;

//Em uma empresa, o código do funcionário (contendo 6 dígitos)
//traz embutido algumas informações, tais como: os 3 primeiros
//dígitos identificam o funcionário, o 4º e o 5º dígitos identificam a
//filial e o 6º dígito refere-se a um dígito de verificação de controle.
//Ler e imprimir uma série de códigos de funcionário e, para cada
//um, apresente separadamente os campos correspondentes.
//Encerrar quando o código do funcionário for negativo. 
public class Exercicio18 {

    public static void tste(String[] args) {
        char[] codigos;
        char[] funcionario = new char[3];
        char[] filial = new char[2];
        char[] verificaControle = new char[1];
        String valor = JOptionPane.showInputDialog("Digite o código do funcionário de 6 dígitos: ");
        while (!valor.equals("-1")) {
            codigos = valor.toCharArray();
            for (int i = 0; i < 6; i++) {
                if (i < 3) {
                    funcionario[i] = codigos[i];
                } else if (i < 5) {
                    filial[i - 3] = codigos[i];
                } else if (i < 6) {
                    verificaControle[i - 5] = codigos[i];
                }
            }

            System.out.println("Codigos de funcionario: " + new String(funcionario));
            System.out.println(" Codigo da filial: " + new String(filial));
            System.out.println(" Digito de verificação de controle: " + new String(verificaControle));
            valor = JOptionPane.showInputDialog("Digite o código do funcionário de 6 dígitos: ");
        }
    }
}
