/* Objetivo:    Coleta valor x e y, troca o valores entre si e mostra x e y
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           03/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq06 {
    public static void main (String args []){
        int x, y, aux;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y:"));

        System.out.println("Valor de x antes da troca: " + x);
        System.out.println("Valor de y antes da troca: " + y);
        
        aux = x;
        x = y;
        y = aux;
        
        System.out.println("Valor de x depois da troca: " + x);
        System.out.println("Valor de y depois da troca: " + y);
      
    }
}
