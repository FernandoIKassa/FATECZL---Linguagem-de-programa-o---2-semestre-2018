/*  Nome do programa        : CalculaQuadrado
    Objetivo                : Calcular e mostrar o quadrado dos números entre 10 e 150.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 16/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq31 {
    public static void main (String args[]){
        int n, resultado;
        n = 10;
        do{
            resultado = (int) Math.pow(n, 2);
            n++;
            System.out.println(resultado);
        }while(n < 150);
    }
}
