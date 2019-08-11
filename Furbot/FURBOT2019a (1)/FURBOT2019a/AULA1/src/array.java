
import javax.swing.JOptionPane;

public class array {

    public static void tste(String[] args) {
        int[][] arrayNum =new int[][]{ {2,2,2,2,2},
                                        {1,1,1,1,1}};
        

        int[][] arrayNum2 = new int[][]{ {2, 2, 2, 2, 2},
                                        {1,1,1,1,1}};
        int[] arrayResultado;
        arrayResultado = new int[arrayNum.length];
        for (int i = 0; i < arrayNum.length; i++) {
            for (int j = 0; j < 4; j++) {
                arrayResultado[i] = arrayNum[i][i] + arrayNum2[i][j];

            }
        }
         JOptionPane.showMessageDialog(null,"valor" + arrayResultado);
    }
}
