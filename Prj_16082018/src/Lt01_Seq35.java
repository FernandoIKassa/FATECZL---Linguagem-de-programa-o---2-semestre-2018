/*  Nome do programa:        Somaimpares
    Objetivo:                Receber dois números inteiros, verifique qual o maior entre eles.
                             Calcular e mostar a soma dos números ímpares entre eles.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 16/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq35 {
    public static void main(String args[]){
        int n1, n2, menor, maior, soma, cta;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        if (n1 < n2) {
            menor = n1;
            maior = n2;
        }else{
            menor = n2;
            maior = n1;
        }
        
        cta = maior;
        soma = 0;
        while(cta >= menor){
            if(cta % 2 == 0){
                cta--;
            }else{
                soma = soma + cta;
                cta--;
            }
        }
        System.out.println("A soma dos números ímpares entre " + menor + " e " + maior + " é igual a: " + soma);
    }
}
