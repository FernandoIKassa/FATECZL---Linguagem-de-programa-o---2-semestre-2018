/*  Nome do programa:           CalculaPotencia
    Objetivo:                   Receber base e expoente. Calcula e mostrar valor da potência.
    Programador:                Fernando Issao Kassa
    Data do desenvolvimento:    16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq44 {
    static int base, exp, potencia;
    
    public static void main(String[] args) {
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));
        potencia = calculaPotencia(base, exp);
        System.out.println(potencia);
    }
    
    static int calculaPotencia(int b, int e){
        int resultado;
        resultado = 1;
        
        for (int i = 0; i < e; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }
}
