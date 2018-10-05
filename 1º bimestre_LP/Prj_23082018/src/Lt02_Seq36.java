/*  Nome do programa:        CalculaMostraSerie2
    Objetivo:                Receber un número N. Calcular e mostrar a série:
                             1 + 1/1! + 1/2! + ... + 1/N!
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 15/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq36 {
    static double n, fatorial;
    static String serie;
    
    
    public static void main (String args[]){
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um N para o fatorial:"));
        
        
        serie = calculaMostraSerie(n);
        System.out.println(serie);
    }
    
    static double calculaFatorial(double numero){
        double soma = numero;
        if(numero != 0){
            for (double cta = numero; cta > 1; cta--) {
                soma = soma * (cta - 1);
            }    
        }else{
            soma = 1;
        }
        return soma;
    }
    
    static String calculaMostraSerie(double numInt){
        String mostrar = "" + 1/calculaFatorial(0);
        double soma = 0;
        for (int cta = 1; cta < numInt; cta++) {
            mostrar = mostrar + " + " + String.format("%.4g",1/calculaFatorial(cta));
            soma = soma + 1/calculaFatorial(cta);
        }
        mostrar = mostrar + " = " + soma;
        return mostrar;
    }
}

