
public class Arrays01 {

    public static void tste(String[] args) {
        int [] arrayUnidimensional1 = new int[] {1,2,3,4,5};
        int [] arrayUnidimensional2 = new int[] {6,7,8,9,10};
        int [] arrayResultado1;
        
        //1) execute o codigo abaixo para realizar a SOMA dos dois arrays
        // e armazenar o resultado no array arrayResultado1
        
        arrayResultado1 = new int[arrayUnidimensional1.length];
        for (int i=0;i<arrayUnidimensional1.length;i++) {
            arrayResultado1[i] = arrayUnidimensional1[i] + arrayUnidimensional2[i];
            System.out.print (arrayResultado1[i]+"  ");
        }//for
        System.out.println();
        

        //2) CONSTRUA o codigo  para realizar a multiplicacao dos elementos dos dois arrays
        // e armazenar o resultado no array SOMADOISARRAYS
        
        
        
        // Considere os dois arrays bidimensionais abaixo
        int[][] arrayBiDimensional1 = new int[][]{ {2, 2, 2, 2, 2}, 
                                                  {3, 3, 3, 3, 3}, 
                                                  {4, 4, 4, 4, 4}, 
                                                  {5, 5, 5, 5, 5}};
        
        int[][] arrayBiDimensional2 = new int[][]{ {2, 2, 2, 2, 2}, 
                                                  {3, 3, 3, 3, 3}, 
                                                  {4, 4, 4, 4, 4}, 
                                                  {5, 5, 5, 5, 5}};
        
         //1) complete o codigo abaixo para realizar a SOMA dos dois arrays
        // e armazenar o resultado no array SOMADOISARRAYS
        
         
        arrayResultado1 = new int[arrayUnidimensional1.length];
        for (int i=0;i<arrayUnidimensional1.length;i++) {
            for (int j=0; j<4; j++) {
                arrayResultado1[i] = arrayBiDimensional1[i][j] + arrayBiDimensional2[i][j];
                System.out.print(arrayResultado1[i]+" ");
            }
            System.out.println();
        }//for
    }

}
