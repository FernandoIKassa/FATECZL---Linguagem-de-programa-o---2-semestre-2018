/* Objetivo:    Coleta lado e altura do triângulo, calcule a área e mostra resultado
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           03/08/2018
*/

import javax.swing.JOptionPane;
public class Lt01_Seq03{
    public static void main(String args[]){
        int Base, Altura, Area;
        Base = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a base do triângulo:"));
        Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para a altura do triângulo:"));
        Area = (Base * Altura);
        System.out.println("A área do triângulo com base " + Base + " e altura " + Altura + " é " + Area);
    }
}
