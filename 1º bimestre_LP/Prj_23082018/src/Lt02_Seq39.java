/*  Nome do programa:       CalcularGraosXadrez
    Objetivo:               Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
                            Casa:   1 2 3 4 ... 64
                            Qte:    1 2 4 8 ... N
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq39 {
    static int casa;
    static String lista;
    
    public static void main(String[] args) {
        casa = 64;
        
        lista = calculaGraos(casa);
        System.out.println(1 + lista);
    }
    
    static String calculaGraos(int limite){
        long qtdGraos, soma;
        String serie;
        
        qtdGraos = 1;
        soma = 1;
        serie = "";
        for (int i = 1; i <= limite; i++) {
            qtdGraos = qtdGraos * 2;
            soma = soma + qtdGraos;
            serie = serie + " " + qtdGraos;   
        }
        serie = serie + " = " + soma;
        return serie;
    }
}
