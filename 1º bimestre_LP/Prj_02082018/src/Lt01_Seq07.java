/* Objetivo:    Coleta a largura, comprimento e alura de um paralelepípedo, calcula e mostra volume.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           03/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq07 {
    public static void main (String args []){
        int largura, altura, comprimento, volume;
        
        largura = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a  altura:"));
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento:"));
        
        volume = largura * altura * comprimento;
        
        System.out.println("Volume do paralelepípedo de largura " + largura + ", de altura " + altura + " e de comprimento " + comprimento + " é de: " + volume);
    }
}
