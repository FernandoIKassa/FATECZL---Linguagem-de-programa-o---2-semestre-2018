/*  Nome do programa        : MostraMaior
    Objetivo                : Receba dois valores REAIS. Mostre o maior deles.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq19 {
    static double
        menor,
        maior,
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:")),
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
    
    public static void main (String args[]){
        verificaMaior();
        System.out.println("O maior número: " + maior);
    }
    
    //--------------- MÉTODOS -------------------
    static void verificaMaior(){
        if (n1 < n2){
            menor = n1;
            maior = n2;
        }else{
            menor = n2;
            maior = n1;
        }
    }
}
