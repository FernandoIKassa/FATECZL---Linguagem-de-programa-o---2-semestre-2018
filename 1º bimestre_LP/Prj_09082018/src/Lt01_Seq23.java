/*  Nome do programa        : OrdernarQuatroNumeros
    Objetivo                : Coletar 3 números em ordem crescente e um quarto aleatório.
                              Colocar os 4 números em ordem crescente.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq23 {
    public static void main (String args[]){
        double a, b, c, alea, aux;
        
        do{
            a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
            c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
            if (a <= b && b <= c && a <= c){
                
            }else{
                JOptionPane.showMessageDialog(null, "Os três números devem ser inseridos em ORDEM CRESCENTE!");
            }
        }while (a > b || b > c || a > c);
        alea = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número:"));
        
        if (alea >= a && alea <= b){
            System.out.println(a + ", " + alea + ", " + b + ", " + c);
        }else if(alea >= b && alea <= c){
            System.out.println(a + ", " + b + ", " + alea + ", " + c);
        }else{
            System.out.println(a + ", " + b + ", " + c + ", " + alea);
        }
        
    }
}
