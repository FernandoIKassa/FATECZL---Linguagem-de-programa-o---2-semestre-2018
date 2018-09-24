/* Objetivo:    Coleta coeficientes de uma equação do 2º grau, calcule as raízes e as mostre
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           03/08/2018

*/

import javax.swing.JOptionPane;
public class Lt01_Seq05 {
    public static void main (String args []){
        double A, B, C, RaizUm, RaizDois, Delta;
        A = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Informe o coeficiente C: "));
        Delta = Math.pow(B,2) - 4*A*C;
        
        RaizUm = (-B + Math.sqrt(Delta))/2*A;
        RaizDois = (-B - Math.sqrt(Delta))/2*A;
        System.out.println("Primeira raiz: " + RaizUm);
        System.out.println("Segunda raiz: " + RaizDois);
    }
}
