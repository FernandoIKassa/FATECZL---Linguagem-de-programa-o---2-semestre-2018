/*
    Nome do programa:        CalculaSerie1
    Objetivo:                Coletar um n postivo e calcular e mostrar a soma da serie:
                             n + (n - 1) + (n - 2) + ... + 1
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 30/08/2018    
 */
import javax.swing.JOptionPane;
public class exerc2_1_recursiva {
    public static void main(String[] args) {
        double n, resultado;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        resultado = calculaSerie(n);
        System.out.println(resultado);
    }
    
    static double calculaSerie(double numero){
        double x;
        
        if (numero == 1){
            return 1;
        }else{
            x = numero + calculaSerie(numero - 1);
            return x;
        }
    }
}

