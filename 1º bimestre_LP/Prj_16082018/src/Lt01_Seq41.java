/*  Nome do programa:        MostraDados7
    Objetivo:                Mostrar todas as possibilidades de dois dados darem o resultado da soma de 7.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 05/09/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq41 {
    public static void main(String[] args) {
        int d1, d2, cta, soma;
        
        d1 = 1;
        d2 = 6;
        soma = d1 + d2;
        while (d1 < 7){
            System.out.println(d1 + " + " + d2 + " = " + soma);
            d1++;
            d2--;
            soma = d1 + d2;
        }
    }
}
