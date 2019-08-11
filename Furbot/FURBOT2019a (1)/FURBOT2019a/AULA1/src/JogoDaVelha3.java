/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author mattos
 */
public class JogoDaVelha3 {

    private char[][] tabuleiro;
    private static final int LINHAS = 3;
    private static final int COLUNAS = 3;

    public JogoDaVelha3() {
        tabuleiro = new char[LINHAS][COLUNAS];

        //preenche com espacos
        for (int i = 0; i < LINHAS; i++) {
            for (int j = 0; j < COLUNAS; j++) {
                tabuleiro[i][j] = '.';
                System.out.print(tabuleiro[i][j]);
            }
            System.out.println();
        }//for i
    }

    public boolean registraJogada(int x, int y, char jogador) {
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
        for (int i = 0; i < LINHAS; i++) {
            lin = lin + '|';
            for (int j = 0; j < COLUNAS; j++) {
                lin = lin + tabuleiro[i][j];
            }
            lin = lin + '|' + "\n";
        }
        return lin;
    }
    //metodo para verificar a diagonal principal
    //recebe o identificador do jogador
    public boolean verificaDiagonalPrincipal(char jogador) {
        if (tabuleiro[0][0] == jogador &&  
              tabuleiro[1][1] == jogador && 
                 tabuleiro[2][2] == jogador) 
            return true;
         else
           return false;
    }
    public boolean verificaDiagonalSecundaria(char jogador) {
        if (tabuleiro[0][2] == jogador &&  
              tabuleiro[1][1] == jogador && 
                 tabuleiro[2][0] == jogador) 
            return true;
         else
           return false;
    }
    
    public boolean verificaLinhas(char jogador) {
        for (int i = 0; i < 3; i++) {
                if (tabuleiro[i][0] == jogador && 
                     tabuleiro[i][1] == jogador && 
                     tabuleiro[i][2] == jogador) {
                    return true;
                }
            }//for
        return false;
    }
    public boolean verificaColunas(char jogador) {
         for (int j = 0; j < 3; j++) {
                if (tabuleiro[0][j] == jogador && 
                    tabuleiro[1][j] == jogador && 
                    tabuleiro[2][j] == jogador){
                    return true;
                }
            }//for
        return false;
    }
    
    public boolean alguemGanhou() {
        if (verificaDiagonalPrincipal('x') ||
            verificaDiagonalPrincipal ('o'))
            return true;
        else if (verificaDiagonalSecundaria('x') ||
                 verificaDiagonalSecundaria ('o'))
             return true;
        else if (verificaLinhas('x') || verificaLinhas('o'))
            return true;
        else if (verificaColunas('x') || verificaColunas('o')) 
            return true;
        else
          return false;
        /* ==================== primeira versao da solucao
        //verifica diagonal principal
        if ((tabuleiro[0][0] == 'x' &&  tabuleiro[1][1] == 'x' && 
             tabuleiro[2][2] == 'x')
           || (tabuleiro[0][0] == 'o' && tabuleiro[1][1] == 'o' && 
                tabuleiro[2][2] == 'o')) {
            return true;
        } else // verifica a diagonal secundaria 
        if ((tabuleiro[0][2] == 'x' && tabuleiro[1][1] == 'x' && 
             tabuleiro[2][0] == 'x')
            || (tabuleiro[0][2] == 'o' && tabuleiro[1][1] == 'o' && 
                tabuleiro[2][0] == 'o')) {
            return true;
        }
        else {
            //verifica linhas
            for (int i = 0; i < 3; i++) {
                if ((tabuleiro[i][0] == 'x' && tabuleiro[i][1] == 'x' 
                        && tabuleiro[i][2] == 'x')
                        || (tabuleiro[i][0] == 'o' && tabuleiro[i][1] == 'o' 
                        && tabuleiro[i][2] == 'o')) {
                    return true;
                }
            }//for

            //verifica colunas
            for (int j = 0; j < 3; j++) {
                if ((tabuleiro[0][j] == 'x' && tabuleiro[1][j] == 'x' 
                        && tabuleiro[2][j] == 'x')
                        || (tabuleiro[0][j] == 'o' && tabuleiro[1][j] == 'o' 
                        && tabuleiro[2][j] == 'o')) {
                    return true;
                }
            }//for
        }
        return false;
      */
    }

    public static void tste(String args[]) {
        //declaracao das variaveis
        JogoDaVelha3 jogodavelha = new JogoDaVelha3();
        boolean repetir = true;
        char jogador = 'x';

        while (repetir) {
            System.out.println(jogodavelha.toString()); //imprime o tabuleiro
            String jogada = JOptionPane.showInputDialog("Linha para " + jogador + " (Cancele para sair)");
            if (jogada == null) {
                repetir = false;
            } else {
                int linha = Integer.parseInt(jogada);
                jogada = JOptionPane.showInputDialog("Coluna para " + jogador + " (Cancele para sair)");
                int coluna = Integer.parseInt(jogada);

                if (jogodavelha.registraJogada(linha, coluna, jogador) == true) {
                    if (jogodavelha.alguemGanhou()) {
                        System.out.println(jogodavelha.toString()); //imprime o tabuleiro
                        System.out.println("O jogador " + jogador + " ganhou.");
                        repetir = false;
                    } else {
                        if (jogador == 'x') {
                            jogador = 'o';
                        } else {
                            jogador = 'x';
                        }
                    }
                }
            }

        }//repetir

    }

}
