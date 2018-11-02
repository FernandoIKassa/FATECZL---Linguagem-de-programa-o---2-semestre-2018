/*  Nome do programa:        CalculaSerie1
    Objetivo:                Receber um número. Calcular e mostrar os resultados da tabuada desse número.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 15/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq34 {
    static int n;
    static String tabuada;
    
    public static void main (String args[]){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para realizar a tabuada:"));
        tabuada = calculaTabuada(n);
        System.out.println(tabuada);
    }
    
    static String calculaTabuada(int numero){
        String resultado = "";
        int produto = 0;
        for (int cta = 0; cta <= 10 ; cta++){
            produto = (numero * cta);
            resultado = resultado + "\n" + numero + " x " + cta + " = " + produto;
        }
        return resultado;
    }
}
