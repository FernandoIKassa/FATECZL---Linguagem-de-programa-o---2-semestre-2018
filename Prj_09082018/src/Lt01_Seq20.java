/*  Nome do programa        : MostraRaizes
    Objetivo                : Receba 3 coeficientes de uma equação do 2º: A, B, C
                              Mostre as raízes reais, caso existam.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq20 {
    public static void main (String args[]){
        int A, B, C;
        double delta, raizUm, raizDois, raizUnica;
        
        A = Integer.parseInt(JOptionPane.showInputDialog(("Digite o coeficiente A:")));
        B = Integer.parseInt(JOptionPane.showInputDialog(("Digite o coeficiente B:")));
        C = Integer.parseInt(JOptionPane.showInputDialog(("Digite o coeficiente C:")));
        
        delta = Math.pow(B,2) - 4*A*C;
        
        if (delta > 0){
            raizUm = (-B + Math.sqrt(delta))/2*A;
            raizDois = (-B - Math.sqrt(delta))/2*A;
            System.out.println("Primeira raiz: " + raizUm);
            System.out.println("Segunda raiz: " + raizDois);
        }else if (delta == 0){
            raizUnica = (-B + java.lang.Math.sqrt(delta))/2*A;
            System.out.println("Única raiz: " + raizUnica);
        }else{
            System.out.println("RAÍZES INEXISTENTES");
        }
    }
}
