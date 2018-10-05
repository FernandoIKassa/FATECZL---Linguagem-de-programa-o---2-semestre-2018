/*  Nome do programa:        CalculaQuadrados
    Objetivo:                Calcular e mostrar o quadrado dos números entre 10 e 150.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 12/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq31 {
    static int n;
    static String lista;
    
    public static void main(String args [ ] )  {
        n = 10;
        
        lista = calculaQuadrados (n);
        System.out.println(lista);
   }

    static String calculaQuadrados (int x) {
        String soma;
        soma = "";
        for (int cta = x ; cta <= 150 ; cta++ ){
            soma = soma + " " + (cta * cta);
        }
        return soma;
    }
}