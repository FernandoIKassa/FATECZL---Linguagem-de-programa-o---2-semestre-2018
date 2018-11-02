/*  Nome do programa:           MostraDados
    Objetivo:                   Receber todas as possibilidades de 2 dados de forma que a soma tenha resultado 7.
    Programador:                Fernando Issao Kassa
    Data do desenvolvimento:    16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq41 {
    static int n;
    static String lista;
    
    public static void main(String[] args) {
        n = 7;
        lista = mostraDados(n);
        System.out.println(lista);
    }
    
    static String mostraDados(int limite){
        String conta = "";
        int soma = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                soma = i + j;
                if (soma == 7){
                    conta = conta + i + " + " + j + " = " + soma + "\n";
                }
            }
        }
        return conta;
    }
}