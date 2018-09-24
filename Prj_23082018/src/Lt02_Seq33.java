/*  Nome do programa:        CalculaSerie1
    Objetivo:                Receber um número. Calcular e mostrar a serie:
                             1 + 1/2 + 1/3 + ... + 1/N
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 14/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq33 {
    static double n;
    static String serie;
    
    public static void main(String[] args) {
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um limite para a série:"));
        serie = calculaSerie(n);
        System.out.println(serie);
    }
    
    static String calculaSerie(double limite){
        String serieLocal = "1";
        double soma = 0;
        for (double cta = 2; cta <= limite ; cta++){
            serieLocal = serieLocal + " + " + String.format("%.4g", (1/cta));
            soma = soma + 1/cta;
        }
        serieLocal = serieLocal + " = " + soma;
        return serieLocal;
    }
}
