/* Objetivo:    Terceiro programa em Java
                Coleta salário, calcule o novo salário e mostra resultado
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           02/08/2018
*/

import javax.swing.JOptionPane;
public class Lt01_Seq02{
    public static void main(String args[]){
        double Salario, NovoSalario;
        Salario = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em Lado"));
        NovoSalario = (Salario * 1.15);
        System.out.println("O novo salário é: " + NovoSalario);
    }
}
