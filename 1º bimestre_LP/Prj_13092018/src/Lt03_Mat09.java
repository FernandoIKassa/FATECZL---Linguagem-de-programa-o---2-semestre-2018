/*
    Nome do programa:           CarregarMatriz
    Objetivo:                   Criar e carregar uma matriz [4][4] com valores aleatórios.
                                Porém, a diagonal principal (linha = coluna) terá valores da potência de 4: 1, 4, 16, 64.
    Nome do progrador:          Fernando Issao Kassa
    Data do desenvolvimento:    19/09/2018

 */
import javax.swing.JOptionPane;
public class Lt03_Mat09 {
    static int
            m[][] = new int [4][4],
            x, y,
            exp = 0;
    public static void main(String[] args) {
        carregaMatriz();
        mostraMatriz(m);
    }
    
    static void carregaMatriz(){
        for (x = 0 ; x < 4 ; x ++){
            for (y = 0 ; y < 4 ; y ++){
                if (x == y){
                    m[x][y] = (int)(Math.pow(4, exp));
                    exp++;
                }else{
                    m[x][y] = (int)(Math.random() * 100);
                }
            }
        }
    }
    
    static void mostraMatriz(int matriz[][]){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("M[" + i + "][" + j + "]" + " = " + m[i][j]);
            }
        }
    }
}
