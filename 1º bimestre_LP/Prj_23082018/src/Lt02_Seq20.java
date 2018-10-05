/*  Nome do programa        : MostraRaizes
    Objetivo                : Receba 3 coeficientes de uma equação do 2º: A, B, C
                              Mostre as raízes reais, caso existam.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq20 {
    static double
            r1,
            r2,
            delta,
            A = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente A:")),
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente B:")),
            C = Integer.parseInt(JOptionPane.showInputDialog("Digite o coeficiente C:"));
    
    public static void main (String args[]){
        CalculaRaizes();
    }
    
     //--------------- MÉTODOS -------------------
    static void CalculaRaizes(){
        delta = (double)Math.pow(B, 2) - 4*A*C;
        if (delta > 0){
            r1 = (-B + Math.sqrt(delta))/2*A;
            r2 = (-B - Math.sqrt(delta))/2*A;
            System.out.println(r1 + " e " + r2);
        }else if (delta == 0){
            r1 = r1 = (-B + Math.sqrt(delta))/2*A;
            System.out.println(r1);
        }else{
            System.out.println("NÃO há raízes!");
        }
        
    }
}
