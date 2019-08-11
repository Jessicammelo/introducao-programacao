
import javax.swing.JOptionPane;

public class JogoDaVelha {
private char[][] tabuleiro;
 private static final int LINHAS = 3;
 private static final int COLUNAS = 3;

 public JogoDaVelha() { //construtor da classe
 tabuleiro = new char[LINHAS][COLUNAS]; //cria um objeto array de char

 //preenche com pontos
 for (int i = 0; i < LINHAS;i++) {
 for (int j = 0; j < COLUNAS; j++) {
 tabuleiro [i][j] = '.';
 // System.out.print(tabuleiro [i][j] );
 }
 //System.out.println();
 }//for i
 }

//---------------------------------------
// aqui são inseridos os metodos
//------------------------------------------
 public static void tste(String args[]) {
 JogoDaVelha jv = new JogoDaVelha();
 //declaracao das variaveis
 JogoDaVelha jogoDaVelha = new JogoDaVelha();
 boolean repetir = true;
 char jogador = 'x';
 int linha = 0;
 int coluna =0;
 String jogada = " ";
 while (repetir) {
 System.out.println(jogoDaVelha.toString() ); //imprime o tabuleiro
 jogada = JOptionPane.showInputDialog("Linha para "+jogador+ " (Cancele para sair)");
 if (jogada == null) {
 repetir = false;
 } else {
 linha = Integer.parseInt(jogada);
 jogada = JOptionPane.showInputDialog("Coluna para "+jogador+ " (Cancele para sair)");
 coluna = Integer.parseInt(jogada);
 if (jogoDaVelha.registraJogada(linha,coluna,jogador) == true) {
 //antes de passar a vez, verifica se alguém ganhou
 if (jogoDaVelha.alguemGanhou() == true) {
 System.out.println ("O jogador "+ jogador + " eh o vencedor!!! Congratulations!!!");
 repetir = false;
 } else {
//passa a vez para o próximo jogador
 if (jogador == 'x') {//se era o jogador “x” que estava jogando
 jogador = 'o'; //muda para o jogador “o”
 } else {
jogador = 'x'; // volta para a vez para o jogador “x”
 }//else
 }
 }//if
 }//else //senão de sexta-feira!!!! > continua com o usuário atual!!!!!
 }//repetir
 }



//método com parâmetros
public boolean registraJogada(int x, int y, char jogador) {
 if (tabuleiro[x][y] != '.') { //a posição NÃO esta desocupada?
 System.out.println("A posicao esta ocupada, escolha outra");
 return false; //retorna false porque não conseguiu registrar a jogada
} else {// a posição x,y esta vazia
 tabuleiro[x][y] = jogador; //registra a jogada do jogador
 }
 return true; //retorna true indicando que registrou a jogada
 }
//metodo sem parametros
 public String toString() { //METODO ou COMPORTAMENTO
 String linha = "";
 for (int i = 0; i<LINHAS;i++) {
 linha = linha + '|';
 for (int j = 0; j< COLUNAS; j++) {
 linha = linha + tabuleiro[i][j];
 }
 linha = linha + '|' + "\n";
 }
 return linha;
 }
//metodo sem parametro
public boolean alguemGanhou () {
 //avalia a configuração do tabuleiro e retorna
 // - true se alguem ganhou ou
 // - false se ninguem fechou o jogo
 //if (….) {
 //…….
 return true;
 //} else
 //return false;
}
}
