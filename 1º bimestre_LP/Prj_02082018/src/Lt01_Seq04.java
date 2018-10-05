/* Objetivo:    Coleta a temperatura em graus Celsius, calcule para Fahrenheit e mostra resultado
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           03/08/2018
*/
import javax.swing.JOptionPane;
public class Lt01_Seq04 {
    public static void main (String args []){
        double Celsius, Fahrenheit;
        Celsius = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius a ser convertida:"));
        Fahrenheit = ((9 * Celsius + 160)/5);
        System.out.println("A temperatura de " + Celsius + "ºC " + "é de " + Fahrenheit + "ºF");
    }
}
