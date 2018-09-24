/* Objetivo:    Coleta dois valores, calcula e mostra a diferença entre o primeiro número e o segundo.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           05/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq10 {
    public static void main (String args[]){
        double valorUm, valorDois, diferenca;
        
        valorUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
        valorDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
        
        diferenca = valorUm - valorDois;
        
        System.out.println("A diferença entre o primeiro valor e o segundo é: " + diferenca);
    }
}
