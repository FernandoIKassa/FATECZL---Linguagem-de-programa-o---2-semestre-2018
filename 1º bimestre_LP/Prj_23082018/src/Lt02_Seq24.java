/*  Nome do programa        : VerificaDivisivel2e3
    Objetivo                : Coletar 1 valor. Verificar e mostrar se ele é divisível por 2 e por 3
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 10/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq24 {
    static double n;
    
    public static void main (String args[]){
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para verificar:"));
        
        verificaDivisibilidade();
    }
    
    static void verificaDivisibilidade(){
        if (n % 2 == 0 & n % 3 == 0){
            System.out.println("Número é divisível por 2 e por 3!");
        }else
            System.out.println("Número não é divisível por 2 e por 3;");
    }
}
