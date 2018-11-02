/*  Nome do programa        : MultiploMaiorMenor
    Objetivo                : Receber dois números inteiros. Verificar e mostrar se o maior é múltiplo do menor.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 11/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq26 {
    static int n1, n2, menor, maior;
    
    public static void main(String args[]){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número:"));
        
        if (n1 < n2){
            menor = n1;
            maior = n2;
        }else{
            menor = n2;
            maior = n1;
        }
        
        verificaMultiplo();
    }
    
    static void verificaMultiplo(){
        if (maior % menor == 0){
            System.out.println(maior + " é múltiplo de " + menor);
        }else{
            System.out.println(maior + " NÃO é múltiplo de " + menor);
        }
    }
}
