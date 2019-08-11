
import javax.swing.JOptionPane;


public class JogoDaVelha2 {
        private char[][] tabuleiro;
    private static final int LINHAS = 3;
    private static final int COLUNAS = 3;
    
    public JogoDaVelha2() {
       tabuleiro = new char[LINHAS][COLUNAS];
       
       //preenche com espacos
       for (int i = 0; i < LINHAS;i++) {
           for (int j = 0; j < COLUNAS; j++) {
               tabuleiro [i][j] = '.';
               System.out.print(tabuleiro [i][j] );
           }
           System.out.println();
       }//for i
    }
    public boolean registraJogada(int x,int y,char jogador) {
        if (tabuleiro[x][y] != '.') {
            System.out.println("A posicao esta ocupada, escolha outra");
            return false;
        } else {
            tabuleiro[x][y] = jogador; //registra a jogada do jogador
        }
        return true;
    }
    public String toString() {
        String lin = "";
        for (int i = 0; i<LINHAS;i++) {
            lin = lin + '|';
            for (int j = 0; j< COLUNAS; j++) {
                lin = lin + tabuleiro[i][j];
            }
            lin = lin + '|' + "\n";
        }
        return lin;
    }
    
    public static void tste(String args[]) {
        //declaracao das variaveis
        JogoDaVelha2 jogodavelha = new JogoDaVelha2();
        boolean repetir = true;
        char jogador = 'x';
        
        while (repetir) {
           System.out.println(jogodavelha.toString()); //imprime o tabuleiro
           String jogada = JOptionPane.showInputDialog("Linha para "+jogador+ " (Cancele para sair)");
           if (jogada == null) {
               repetir = false;
           } else {
               int linha = Integer.parseInt(jogada);
               jogada = JOptionPane.showInputDialog("Coluna para "+jogador+ " (Cancele para sair)");
               int coluna = Integer.parseInt(jogada);
               
               if (jogodavelha.registraJogada(linha,coluna,jogador) == true) {
                  if (jogador == 'x')  {
                      jogador = 'o';
                  }  else {
                      jogador = 'x';
                  }
               }
           }
        
        }//repetir
        
        
        
    }
    
}
