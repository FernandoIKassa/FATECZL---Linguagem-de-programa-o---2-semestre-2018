/* Objetivo:    Coletar dois catetos de um triângulo retângulo, calcular e mostrar a hipotenusa.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           06/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq15 {
    public static void main (String args[]){
        double catetoOposto, catetoAdjacente, hipotenusa;
        
        catetoOposto = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do catetoOposto"));
        catetoAdjacente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do cateto adjacente:"));
        
        hipotenusa = java.lang.Math.sqrt(Math.pow(catetoOposto,2) + Math.pow(catetoAdjacente,2));
        
        System.out.println("A hiptenusa é: " + hipotenusa);
    }
}
