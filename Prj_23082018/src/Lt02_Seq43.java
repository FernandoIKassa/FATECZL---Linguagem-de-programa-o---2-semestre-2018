/*  Nome do programa:           CalculaIdade
    Objetivo:                   Calcular e mostrar quantos anos serão necessários para que Ana seja maior que
                                Maria sabendo que Ana tem 1,10m e cresce 3 cm ao ano e Maria tem 1,5m e cresce 2 cm ao ano
    Programador:                Fernando Issao Kassa
    Data do desenvolvimento:    16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq43 {
    static double anaCresce, mariaCresce, tempo;
    
    public static void main(String[] args) {
        anaCresce = 0.03;
        mariaCresce = 0.02;
        tempo = calculaIdade(anaCresce, mariaCresce);
        System.out.println("Irá levar " + tempo + " anos.");
    }
    
    static int calculaIdade(double cresceA, double cresceM){
        int ano = 0;
        double anaAltura = 1.1;
        double mariaAltura = 1.5;
        while(anaAltura <= mariaAltura) {
            anaAltura = anaAltura + cresceA;
            mariaAltura = mariaAltura + cresceM;
            ano++;
        }
        return ano;
    }
}

