/*  Nome do programa        : Ordenar        
    Objetivo                : Coletar 2 valores inteiros e diferentes e mostrá-los em ordem crescente.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 25/08/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq22 {
    static int
        menor,
        maior,
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:")),
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
    
    public static void main(String[] args) {
        verificaMenorMaior();
    }
    
    
    static void verificaMenorMaior(){
        if (n1 < n2) {
            menor = n1;
            maior = n2;
        }else{
            menor = n2;
            maior = n1;
        }
        System.out.println("O menor número é " + menor + " e o maior, " + maior);
    }
}
