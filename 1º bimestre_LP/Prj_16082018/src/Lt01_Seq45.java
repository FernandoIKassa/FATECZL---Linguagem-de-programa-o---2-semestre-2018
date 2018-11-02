/*  Nome do programa:        CalculaSequencia2
    Objetivo:                Calcular e mostrar a série:
                             1 - 2/4 + 3/9 - 4/16 + 5/25 - ... + 15/225
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 05/09/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq45 {
    public static void main(String[] args) {
        double numerador, denominador, cta, soma;
        
        numerador = 1;
        denominador = 1;
        soma = numerador/denominador;
        System.out.print(soma);
        
        for(cta = 2 ; cta <= 15 ; cta++){
            numerador++;
            if(cta % 2 == 0){
                denominador = cta * cta * (-1);
            }else{
                denominador = cta * cta;
            }
            
            soma = soma + numerador/denominador;
            if(denominador < 0){
                System.out.print(" + " + "(" + numerador/denominador + ")");
            }else{
                System.out.print(" + " + numerador/denominador);
            }
        }
        System.out.print(" = " + soma);
    }
}
