/*
    Nome do programa:           CarregarMatriz2
    Objetivo:                   Criar uma matriz [8][8] onde o programa irá carregar segundo:
                                casa    1   2   3   4   ... 
                                valor   1   2   4   8   ...(exibir soma dos valores)
    Nome do progrador:          Fernando Issao Kassa
    Data do desenvolvimento:    19/09/2018

 */
public class Lt03_Mat10 {
    public static void main(String[] args) {
        int matriz[][] = new int [8][8];
        matriz = carregarMatriz(matriz);
        exibirMatrizSoma(matriz);
    }
    
    static int [][] carregarMatriz (int mt [][]){
        int exp = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                mt[i][j] = (int)(Math.pow(2, exp));
                exp++;
            }
        }
        return mt;
    }
    
    static void exibirMatrizSoma(int mt[][]){
        long soma = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println("M[" + i + "][" + j +  "]" + " = " + mt[i][j]);
                soma += mt[i][j];
            }
        }
        System.out.println(soma);
    }
}