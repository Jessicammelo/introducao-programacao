
import javax.swing.JOptionPane;

//Calcular o valor da expressão: y = 3x2 – 4x + ⎷2 para o x
//variando de -3 até 4 em acréscimo de 0,25. A cada interação
//imprimir os valores de x e y.
public class Exercicio14 {
    public static void tste(String[]args){
        double x = -3;
        double y = 0;
        
        for(int i = 0; i < 7; i++){
            x = (x +1) + (x * 0.25);
            y = ( 3 * (x * x)) - (4 * x) + Math.sqrt(2);
            System.out.println( x + "\n" + y);
        }
        
        
    }
}
