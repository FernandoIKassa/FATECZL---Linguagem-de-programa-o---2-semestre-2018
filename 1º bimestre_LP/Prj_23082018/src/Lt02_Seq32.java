/*  Nome do programa:        CalculaFatorial
    Objetivo:                Receber um número inteiro e calcular o seu fatorial.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 14/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq32 {
    static int n, fatorial;
    
    public static void main(String args[]){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para calcular o seu fatorial:"));
        fatorial = calculaFatorial(n);
        System.out.println(fatorial);
    }
    
    static int calculaFatorial(int numInt){
        int resultado;
        resultado = numInt;
        for (int cta = numInt; cta > 1 ; cta--){
            resultado = resultado * (cta - 1);
        }
        return resultado;
    }
}
