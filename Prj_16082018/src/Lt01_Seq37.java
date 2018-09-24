/*  Nome do programa:        CalculaFibonacci
    Objetivo:                Receber um número inteiro.
                             Calcular e mostrar a série de fibonacci até o enésimo número.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq37 {
    public static void main(String args[]){
        int n, anterior, atual, fibo;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite até que número deseja a série de Fibonacci:"));
        atual = 1;
        anterior = 0;
        System.out.println(1);
        do{
            fibo = atual + anterior;
            anterior = atual;
            atual = fibo;
            if (fibo < n){
                System.out.println(fibo);
            }
        }while(fibo < n);
    }
}
