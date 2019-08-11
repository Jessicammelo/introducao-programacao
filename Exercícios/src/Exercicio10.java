
import javax.swing.JOptionPane;

//Ler um conjunto de dados contendo o nome e o código do
//estado civil (1- casado, 2 solteiro, 3 viúvo e 4 não
//informado). Encerrar o programa quando o código de estado
//civil for negativo. Ao final apresentar o percentual de cada
//categoria. 
public class Exercicio10 {

    public static void tste(String[] args) {
        int codigoCivil = 0;
        int casado = 0;
        int solteiro = 0;
        int viuvo = 0;
        int naoInformado = 0;
        float soma_total;
        String nome = "";
        while (codigoCivil != -1) {
            nome = JOptionPane.showInputDialog(null, " digite o nome: ");
            codigoCivil = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o codigo do estado civil:" + "\n1- casado; \n2-solteiro;"
                            + " \n3-viuvo; \n4-não Informado; \n(-1) para SAIR"));
            switch (codigoCivil) {
                case 1:
                    casado++;
                    break;
                case 2:
                    solteiro++;
                    break;
                case 3:
                    viuvo++;
                    break;
                case 4:
                default:
                    naoInformado++;
                    break;
            }
        }    
        soma_total = casado + solteiro + viuvo + naoInformado;
        JOptionPane.showMessageDialog(null, "Percentual de casado: "
                + ((soma_total * (casado / 100.0f))) + " % " + "\nPercentual de solteiro: "
                + ((soma_total * (solteiro / 100.0f))) + " % " + "\nPercentual de viuvo: "
                + ((soma_total * (viuvo / 100.0f))) + " % " + "\nPercentual de não informados: "
                + ((soma_total * (naoInformado / 100.0f))) + " % ");
    }
}
