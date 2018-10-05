/*  Nome do programa:        CalculaSerieFatorial
    Objetivo:                Receber um número N.
                             Calcular e mostrar a série: 1 + 1/1! 1/2! + 1/3! + ... + 1/N!.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 16/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq36 {
    public static void main (String args[]){
        int n, cta, reset, cta2;
        double fat;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        fat = n;
        reset = n;
        cta2 = 0;
        System.out.print(1);
        for (cta = n ; cta >= 1 ; cta--){            
            while(n > 1){
                n--;
                fat = fat * n;
            }
            System.out.print(" + " + 1/fat);
            cta2--;
            fat = reset + cta2;
            n = reset + cta2;
        }
    }
}
