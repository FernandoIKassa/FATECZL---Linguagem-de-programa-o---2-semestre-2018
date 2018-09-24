/*  Nome do programa:        CalculaFibonacci
    Objetivo:                Receber um número inteiro. Calcular e mostrar a série de Fibonacci até o seu enésiomo termo.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq37 {
    static int n;
    static String serieFibonacci;
    
    public static void main(String[] args) {
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um limite para a série de Fibonacci:"));
        serieFibonacci = calculaMostraFibonacci(n);
        System.out.println(serieFibonacci);
    }
    
    static String calculaMostraFibonacci(int limite){
        int anterior, atual, resultado, soma;
        String serie = "1";
        anterior = 0;
        atual = 1;
        resultado = 0;
        soma = 1;
        for (int cta = 1; cta < limite; cta++) {
            resultado = anterior + atual;
            serie = serie + " " + resultado;
            anterior = atual;
            atual = resultado;
            soma = soma + resultado;
        }
        serie = serie + " = " + soma;
        return serie;
    }
}