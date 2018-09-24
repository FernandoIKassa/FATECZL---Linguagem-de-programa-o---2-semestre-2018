/*  Nome do programa        : Ordernar4Numeros
    Objetivo                : Coletar 3 valores em ordem crescente e um quarto não necessariamente na ordem.
                              Deixar os 4 valores em ordem crescente.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 08/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq23 {
    static double 
            n1, n2, n3, n4, ordem, aux, cta;
    
    public static void main (String args[]){
        JOptionPane.showMessageDialog(null,  "Digite 3 números em ordem crescente:");
        ordem = 0;
        while (ordem == 0){
            n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número, o qual deve ser maior que o primero:"));
            n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um terceiro número, maior que o segundo:"));
            if (n1 < n2 & n2 < n3){
                ordem = 1;
            }else{
                JOptionPane.showMessageDialog(null, "Os 3 números devem estar em ordem CRESCENTE!");
            }
        }
        
        n4 = Math.round(Math.random() * 1000);
        
        
        ordenarNumeros();
        
    }
    
    static void ordenarNumeros(){
        if (n4 < n1){
            System.out.println(n4 + " " + n1 + " " + n2 + " " + n3);
        } else if (n4 > n1 & n4 < n2){
            System.out.println(n1 + " " + n4 + " " + n2 + " " + n3);
        } else if(n4 > n2 & n4 < n3){
            System.out.println(n1 + " " + n2 + " " + n4 + " " + n3);
        } else{
            System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
        }
    }
}
