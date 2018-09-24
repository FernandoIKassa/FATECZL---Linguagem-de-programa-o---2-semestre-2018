/* Objetivo:    Coleta valor de um depósito em poupança, calcula rendimento de 1,3% após um mês e mostra valor final.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           04/08/2018

*/

import javax.swing.JOptionPane;

public class Lt01_Seq08 {
    public static void main (String args[]){
        double deposito, taxa, rendimento, valorFinal;
        
        taxa = 0.013;
        deposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do depósito:"));
        rendimento = deposito * taxa;
        valorFinal = deposito + rendimento;
        
        System.out.println("Valor em poupança após um mês aplicado: " + valorFinal);
    }
}
