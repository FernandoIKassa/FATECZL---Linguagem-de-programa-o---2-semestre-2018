/*
    Nome do programa:           CarregarMatriz3
    Objetivo:                   Criar uma matriz [8][8] inteiro conforme abaixo:
                                1   1   1   1   1   1   1   1
                                1   2   2   2   2   2   2   1
                                1   2   3   3   3   3   2   1
                                1   2   3   4   4   3   2   1
                                1   2   3   4   4   3   2   1
                                1   2   3   3   3   3   2   1
                                1   2   2   2   2   2   2   1
                                1   1   1   1   1   1   1   1

    Nome do progrador:          Fernando Issao Kassa
    Data do desenvolvimento:    19/09/2018

 */
public class Lt03_Mat11 {
    public static void main(String[] args) {
        int matriz[][] = new int [8][8];
        
        matriz = carregarMatriz(matriz);
        exibirMatriz(matriz);
    }
    
    static int [][] carregarMatriz(int m[][]){
        int aux;
        aux = 0;
        while (aux < 4){
            for (int i = aux; i < 8 - aux; i++) {
                for (int j = aux; j < 8 - aux; j++) {
                    m[i][j] = 1 + aux;
                }
            }
            aux++;
        }
        return m;
        
    }
    
    static void exibirMatriz(int m[][]){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println("");
        }
    }
    
}
