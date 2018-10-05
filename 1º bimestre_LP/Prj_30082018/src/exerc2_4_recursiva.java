/*
    Nome do programa:        CalculaSerie4
    Objetivo:                Coletar um n postivo e calcular e mostrar a soma da serie:
                             n! + (n-1)! + (n-2)! + ... + 1!
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 17/09/2018    
 */
import javax.swing.JOptionPane;
public class exerc2_4_recursiva {
    public static void main(String[] args) {
        int n, resultado;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
                
        resultado = calculaSerie(n);
        System.out.println(resultado);
    }
    
    static int calculaFatorial(int numero){
        int resultado;
        resultado = numero;
        for (int i = numero; i > 1; i--) {
            resultado = resultado * (i - 1);
        }
        return resultado;
    }
    
    static int calculaSerie(int numero){
        int x;
        if (numero == 1) {
            return 1;
        }else{
            x = calculaFatorial(numero) + calculaSerie(numero - 1);
            return x;
        }
    }
}
