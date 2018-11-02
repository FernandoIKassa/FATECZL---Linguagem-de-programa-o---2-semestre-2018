/*  Nome do programa        : Ordenar        
    Objetivo                : Coletar 2 valores inteiros e diferentes e mostrá-los em ordem crescente.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq22 {
    public static void main(String args[]){
        int valorUm, valorDois;
        
        do{
            valorUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
            valorDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
            if (valorUm == valorDois){
                JOptionPane.showMessageDialog(null, "Números não podem ser IGUAIS!");
            }
        }while(valorUm == valorDois);
        
        if (valorUm < valorDois){
            System.out.println(valorUm + ", " + valorDois);
        }else
            System.out.println(valorDois + ", " + valorUm);
        
    }
}
