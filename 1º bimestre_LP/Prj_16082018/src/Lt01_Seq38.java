/*  Nome do programa:        CalcularMenorMaior
    Objetivo:                Receber 100 números inteiros reais.
                             Verificar e mostrar o maior e o menor número (somente valores positivos).
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq38 {
    public static void main (String args[]){
        double n, cta, menor, maior;
        cta = 0;
        menor = 0;
        maior = 0;
        while (cta <= 100){
            n = Math.round(Math.random() * 10000);
            System.out.println(n);
            if (maior == 0 && menor == 0){
                menor = n;
                maior = n;
            }else if (n < menor){
                menor = n;
            }else if(n > maior){
                maior = n;
            }
            cta++;
        }
        System.out.println("O menor número é " + menor + " e o maior " + maior);
    }
}
