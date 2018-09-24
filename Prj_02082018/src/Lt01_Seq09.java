/* Objetivo:    Coleta dois valores, calcula e mostra a soma dos quadrados.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           04/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq09 {
    public static void main (String args[]){
        double valorUm, valorDois, soma;
        valorUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        valorDois = Integer.parseInt(JOptionPane.showInputDialog("Digiete o segundo valor:"));
        
        soma = Math.pow(valorUm, 2) + Math.pow(valorDois, 2);
        
        System.out.println("A soma dos quadrados dos dois números é: " + soma);
    }
}
