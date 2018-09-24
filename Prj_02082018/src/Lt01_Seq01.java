/* Objetivo:    Segundo programa em Java
                Coleta lado, calcula área e mostra resultado
                   
    Programador:    Fernando Issao Kassa
    Data:           02/08/2018
*/

import javax.swing.JOptionPane;
public class Lt01_Seq01{
    public static void main(String args[]){
        int Lado, Area;
        Lado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em Lado"));
        Area = (Lado * Lado);
        System.out.println("A área é: " + Area);
    }
}
