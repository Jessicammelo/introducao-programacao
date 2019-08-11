
import javax.swing.JOptionPane;

//Ler um conjunto de dados contendo o nome de um
//funcionário e seu salário bruto. Considerando que 8% do
//salário bruto é retido para INSS, imprima para cada
//indivíduo seu nome, seu salário bruto e seu salário líquido.
//Encerrar o programa quando o salário bruto for negativo.

public class Exercicio11 {
    public static void tste(String[]args){
        float inss;
        float salario = 0;
        String nome;
        
        while(salario != -1){
        nome = JOptionPane.showInputDialog(null, " digite nome do funcionário: ");
        salario = Float.parseFloat(JOptionPane.showInputDialog(null, " digite seu salario: "));
        inss = (salario -((8.0f/100.0f)*salario));
        JOptionPane.showMessageDialog(null,nome + " \nsalário bruto: " +salario + "\nsalário líquido: " +  inss);
        salario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite -1 para parar:"));
        }
        
       
    }
}
