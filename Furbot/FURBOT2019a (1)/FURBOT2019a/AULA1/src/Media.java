

import javax.swing.JOptionPane;

public class Media {

    public static void tste(String[] args) {
        float nota1, nota2, nota3;
        float media;

 //recebe os dados
 
  String notaDigitada = JOptionPane.showInputDialog(null,"Entre com a primeira nota");
 nota1 = Float.parseFloat(notaDigitada);

 notaDigitada = JOptionPane.showInputDialog(null,"Entre com a segunda nota");
 nota2 = Float.parseFloat(notaDigitada);

 notaDigitada = JOptionPane.showInputDialog(null,"Entre com a terceira nota");
 nota3 = Float.parseFloat(notaDigitada);
 
 //calcula a media
 media = (nota1 + nota2 + nota3)/ 3;

 //apresenta a saida
 System.out.println (" A media eh: " + media + " para as notas: "+nota1+" "+ nota2 +" "+nota3);
 } 
    }


