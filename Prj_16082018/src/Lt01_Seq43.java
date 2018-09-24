/*  Nome do programa:        CalculaAlturaFutura
    Objetivo:                Calcular e mostrar quantos anos serão necessários par que Ana seja maior que Maria,
                             sabendo que Ana em 1,10cm e cresce 3cm ao ano e Maria tem 1,5m e cresce 2cm ao ano.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 05/09/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq43 {
    public static void main(String[] args) {
        int ana, maria, anos;
        
        anos = 0;
        ana = 110;
        maria = 150;
        
        while (ana <= maria){
            ana = ana + 3;
            maria = maria + 2;
            anos++;
        }
        
        System.out.println("Altura de Ana:" + ana);
        System.out.println("Altura de Maria:" + maria);
        System.out.println(anos);
    }
}
