/* Objetivo:    Coleta quantidade de quilos de alimento, calcula e mostra a quantidade de dias que o alimento irá durar, sabendo que o consumo será de 50g/dia.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           05/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq13 {
    public static void main (String args[]){
        double quantiAlimento, diaDuracao;
        
        quantiAlimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de quilos de alimento:"));
        diaDuracao = quantiAlimento/0.05;
        
        System.out.println("A quantidade de dias que " + quantiAlimento + " quilos irá durar é de: " + diaDuracao);
    }
}
