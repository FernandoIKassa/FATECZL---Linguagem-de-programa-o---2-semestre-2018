/*  Nome do programa:        CalculaPotencia
    Objetivo:                Receber a base e o expoente. Calcular e mostrar o resultado.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 05/09/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq44 {
    public static void main (String args[]){
        int base, exp, cta, resultado;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));
        resultado = base;
        cta = 1;
        do{
            resultado = resultado * base;
            cta++;
        }while(cta < exp);
        
        System.out.println(resultado);
    }
    
}
