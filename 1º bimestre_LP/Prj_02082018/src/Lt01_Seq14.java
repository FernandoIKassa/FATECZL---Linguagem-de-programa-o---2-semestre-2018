/* Objetivo:    Coleta dois ângulos de um triângulo, calcula e mostra o terceiro ângulo.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           06/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq14 {
    public static void main (String args[]){
        int anguloUm, anguloDois, anguloTres;
        anguloUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro ângulo:"));
        anguloDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo ângulo:"));
        
        anguloTres = 180 - anguloUm - anguloDois;
        
        System.out.println("O terceiro ângulo é: " + anguloTres);
    }
}
