/*
    Nome do programa:           CarregarProduto
    Objetivo:                   Criar e carregar uma matriz [4][3] inteira com quantidade de produto vendidos em 4 semananas.
                                Calcular e exibir:
                                    a. a quantidade de cada produto vendido no mês;
                                    b. a quantidade de produtos vendidos por semana;
                                    c. o total de produtos vendidos no mês.
    Nome do progrador:          Fernando Issao Kassa
    Data do desenvolvimento:    13/09/2018

 */
import javax.swing.JOptionPane;
public class Lt03_Mat08 {
    static int 
            m[][] = new int [4][3],
            x, y;
    
    public static void main(String[] args) {
        carregaMatriz();
        calculaCadaProduto();
        calculaProdutoSemana();
        calculaVendidoMes();
    }
    
    static void carregaMatriz(){
        for (x = 0; x < 4 ; x++){
            for (y = 0 ; y < 3 ; y++){
                m[x][y] = (int) Math.round(Math.random() * 100);
            }
        }
    }
    
    static void calculaCadaProduto(){
        int somaProduto = 0;
        for (y = 0; y < 3 ; y++){
            for (x = 0 ; x < 4 ; x++){
                somaProduto = somaProduto + m[x][y];
            }
            System.out.println("O produto " + (y + 1) + " vendeu " + somaProduto + " unidades");
            somaProduto = 0;
        }
    }
    
    static void calculaProdutoSemana(){
        int somaSemana = 0;
        for (x = 0 ; x < 4 ; x++){
            for (y = 0 ; y < 3 ; y++){
                somaSemana = somaSemana + m[x][y];
            }
            System.out.println("Na semana, " + (x + 1) + " foram vendidas " + somaSemana + " unidades");
            somaSemana = 0;
        }
    }
    
    static void calculaVendidoMes(){
        int somaMes = 0;
        for (x = 0 ; x < 4 ; x++){
            for (y = 0 ; y < 3 ; y++){
                somaMes = somaMes + m[x][y];
            }
        }
        System.out.println("Na mês, foram vendidas " + somaMes + " unidades");
    }
}
