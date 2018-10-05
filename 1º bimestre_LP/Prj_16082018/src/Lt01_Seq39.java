/*  Nome do programa:        CalculaGraos
    Objetivo:                Calcular a quantidade grãos em um tabuleiros de xadrez:
                             casa   1   2   3   4   ... 64
                             qtd:   1   2   4   8   ... N
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq39 {
    public static void main (String args[]){
        int graos, cta;
        graos = 0;
        for (cta = 0; cta < 64 ; cta++){
            graos = (int) Math.pow(2, cta);
            System.out.println(graos);
        }
    }
}
