/*  Nome do programa        : CalculaSerie
    Objetivo                : Receber um número inteiro, calcular e mostrar a série:
                              1 + 1/2 + 1/3 + ... + 1/N
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 16/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq33 {
    public static void main (String args[]){
        double n, cta;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        
        for (cta = n ; cta >= 1; cta--){
            System.out.println(1/cta);
        }
    }
}
