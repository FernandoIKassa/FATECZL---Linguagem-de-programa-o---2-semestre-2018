/*
    Nome do programa:           CarregarTabuleiroXadrez
    Objetivo:                   Criar um tabuleiro [8][8] inteiro conforme abaixo:
                                1       2       3       4       5       6      7 
                                Peão    Torre   Bispo   Cavalo  Rainha  Rei    Vazio
                                2   4   3   5   6   3   4   2
                                1   1   1   1   1   1   1   1
                                7   7   7   7   7   7   7   7
                                7   7   7   7   7   7   7   7
                                7   7   7   7   7   7   7   7
                                7   7   7   7   7   7   7   7
                                1   1   1   1   1   1   1   1
                                2   4   3   5   6   3   4   2
                                Calcular e mostrar a soma das peças do tabuleiro.
                                *Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peça

    Nome do progrador:          Fernando Issao Kassa
    Data do desenvolvimento:    19/09/2018

 */
public class Lt03_Mat12 {
    public static void main(String[] args) {
        int tabuleiro [][] = new int [8][8];
        
        tabuleiro = carregarTabuleiro(tabuleiro);
        mostrarTabuleiro(tabuleiro);
        System.out.println("");
        somaVetor(tabuleiro);
    }
    
    static int [][] carregarTabuleiro(int m[][]){
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(i >= 2 & i <= 5){
                    m[i][j] = 7;
                }else if(i == 1 || i == 6){
                    m[i][j] = 1;
                    
                }else if((i == 0 || i == 7) & (j == 0 || j == 7)){
                    m[i][j] = 2;
                }else if((i == 0 || i == 7) & (j == 1 || j == 6)){
                    m[i][j] = 4;
                }else if((i == 0 || i == 7) & (j == 2 || j == 5)){
                    m[i][j] = 3;
                }else if((i == 0 || i == 7) & j == 3){
                    m[i][j] = 5;
                }else if((i == 0 || i == 7) & j == 4){
                    m[i][j] = 6;
                }
            }
        }
        return m;
    }
    
    static void mostrarTabuleiro(int m[][]){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    static void somaVetor (int tabuleiro [][]){
        int somaVetor [] = new int [7];
        int soma = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                somaVetor[tabuleiro[i][j] - 1]++;
                
            }
        }
        for (int i = 0; i < 7; i++) {
            soma += somaVetor[i];
        }
        System.out.println("Soma das peças: " + soma);
        
    }
 }


