/* Objetivo:    Coleta o raio da circunferência, calcula e mostra o comprimento da circunferência.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           05/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq11 {
    public static void main (String args[]){
        double raio, comprimentoCircunf;
        
        raio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do raio:"));
        
        comprimentoCircunf = raio * Math.PI * 2;
        
        System.out.println("O comprimento da circunferência de raio " + raio + " é: " + comprimentoCircunf);
    }
}
