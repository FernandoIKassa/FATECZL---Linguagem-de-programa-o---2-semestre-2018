/*  Nome do programa:        CalculaSerieFracao
    Objetivo:                Calcular e mostrar a serie 1 + 2/3 + 3/5 + ... + 50/99
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 05/09/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq42 {
    public static void main (String args[]){
        double numerador, denominador, cta, soma;
        numerador = 1;
        denominador = 1;
        soma = 0;
        System.out.print(numerador/denominador);
        soma = soma + numerador/denominador;
        numerador = 2;
        denominador = 3;
        
        for (cta = numerador ; numerador <= 50 ; numerador++) {
            System.out.print(" + " + numerador/denominador);
            soma = soma + numerador/denominador;
            denominador = denominador + 2;
        }
        
        System.out.println(" = " + soma);
    }
}
