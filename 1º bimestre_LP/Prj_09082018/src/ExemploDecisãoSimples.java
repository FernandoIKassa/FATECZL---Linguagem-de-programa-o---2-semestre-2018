/*  Nome do programa        : ExemploDecisãoSimples        
    Objetivo                : Coletar a idade e mostre, caso menor que 18 "MENOR DE IDADE"
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class ExemploDecisãoSimples {
    public static void main (String args[]){
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A IDADE:"));
        if (idade < 18){
            JOptionPane.showMessageDialog(null,"MENOR DE IDADE " + idade);
        }
    }
}
