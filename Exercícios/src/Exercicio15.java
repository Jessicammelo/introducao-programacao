
import javax.swing.JOptionPane;

//Em uma empresa trabalham 4 balconistas cujos
//identificadores são, respectivamente, 1, 2, 3 e 4. A cada final
//de semana, um sistema processa os pedidos da empresa
//para fins de totalização das vendas da semana. Para isto são
//informados o identificador do balconista e o valor do
//pedido. Encerrar o programa quando o identificador do
//balconista for negativo. Ao final, apresentar, para cada
//balconista, o número de pedidos processados e o total de
//pedidos de cada um.
public class Exercicio15 {

    public static void tste(String[] args) {
        int[] pedidos = new int[5];
        float[] total = new float[5];
        float valorDoProduto = 0;

        int balconista = Integer.parseInt(JOptionPane.showInputDialog("Digite o identificador do balconista: "));
        while (balconista != -1) {
            valorDoProduto = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
            pedidos[balconista]++;
            total[balconista] += valorDoProduto;
            balconista = Integer.parseInt(JOptionPane.showInputDialog("Digite o identificador do balconista: "));
        }
        for (int i = 1; i <= 4; i++) {
            System.out.println( "balconista: " + i + "\n numero de pedidos: "
                    + pedidos[i] + " \n Total de pedidos: " + total[i]);

        }
    }
}
