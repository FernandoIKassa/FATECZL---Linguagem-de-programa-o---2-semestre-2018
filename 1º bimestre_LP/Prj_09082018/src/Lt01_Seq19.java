/*  Nome do programa        : MostraMaior
    Objetivo                : Receba dois valores REAIS. Mostre o maior deles.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq19 {
    public static void main (String args[]){
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        if (a < b){
            System.out.println("O maior número é :" + b);
        }else{
            System.out.println("O maior número é :" + a);
        }
    }
}
