/*  Nome do programa        : CalculaFatorial
    Objetivo                : Receber um número inteiro e calcular o seu fatorial.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 16/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq32 {
    public static void main (String args[]){
        int n, resultado;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        resultado = n;
        while(n > 1){
            n--;
            resultado = resultado * n;
        }
        System.out.println(resultado);
    }
}