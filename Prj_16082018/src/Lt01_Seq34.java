/*  Nome do programa:        CalculaTabuada
    Objetivo:                Receber um número, calcular e mostrar a sua tabuada.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 16/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq34 {
    public static void main (String args[]){
        int n, cta, resultado;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        resultado = 0;
        cta = 0;
        do{
            resultado = n * cta;
            System.out.println(n + " x " + cta + " = " + resultado);
            cta++;
        }while(cta <= 10);
    }
}
