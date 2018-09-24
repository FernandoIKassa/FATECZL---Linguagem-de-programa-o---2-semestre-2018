/*  Nome do programa:           CalculaSerie4
    Objetivo:                   Calcular e mostrar a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225.
    Programador:                Fernando Issao Kassa
    Data do desenvolvimento:    16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq45 {
    static int n;
    static String lista;
    
    public static void main(String[] args) {
        n = 15;
        lista = calculaSerie(n);
        System.out.println(lista);
    }
    
    static String calculaSerie(int limite){
        double soma, denominador, base;
        String lista = "1";
        base = 2;
        soma = 1;
        denominador = 0;
        
        
        for (int i = 2; i <= limite; i++) {
            denominador = Math.pow(base, 2);
            double fracao = i/denominador;
            if (i % 2 != 0){
                lista = lista + " + " + fracao;
            }else{
                fracao = fracao * (-1);
                lista = lista + " + " + "(" + fracao + ")" ;
            }
            soma = soma + fracao;
            base++;
        }
        lista = lista + " = " + soma;
        return lista;
    }
}