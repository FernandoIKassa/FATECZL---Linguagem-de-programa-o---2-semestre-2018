/*  Nome do programa        : DiferençaMaiorMenor        
    Objetivo                : Coletar 2 valores inteiros, calcular e mostrar o resultado da diferença do maior pelo menor.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq18 {
    public static void main (String args[]){
        int a, b, resultado;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
        if (a < b){
            resultado = b - a;
        }else{
            resultado = a - b;
        }
        System.out.println("A diferença do maior pelo menor é: " + resultado);
    }
}
