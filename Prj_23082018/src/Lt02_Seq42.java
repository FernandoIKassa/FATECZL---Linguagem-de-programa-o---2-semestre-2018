/*  Nome do programa:           CalculaSerie3
    Objetivo:                   Calcular e mostrar a série 1 + 2/3 + 3/5 + ... + 50/99
    Programador:                Fernando Issao Kassa
    Data do desenvolvimento:    16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq42 {
    static int n;
    static String serie;
    
    public static void main(String[] args) {
        n = 50;
        serie = calculaSerie(n);
        System.out.println(serie);
    }
    
    static String calculaSerie(int limite){
        String lista = "1";
        double soma, quociente, denominador;
        soma = 1;
        denominador = 3;
        for (int i = 2; i <= limite; i++) {
            lista = lista + " + " + i/denominador;
            soma = soma + i/denominador;
            denominador = denominador + 2;
        }
        lista = lista + " = " + soma;
        return lista;
    }
}