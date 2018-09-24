/*  Nome do programa:        CalculaImpares
    Objetivo:                Receber dois números inteiros. Verificar qual é o maior deles.
                             Calcular e mostrar o resultado dos números ímpares entre esses valores.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 15/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq35 {
    static int n1, n2, maior, menor, resultado;
    
    public static void main(String[] args) {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número:"));
        
        if (n1 < n2) {
            menor = n1;
            maior = n2;
        }else{
            menor = n2;
            maior = n1;
        }
        
        resultado = calculaImpares(menor, maior);
        System.out.println(resultado);
    }
    
    static int calculaImpares(int me, int ma){
        int soma = 0;
        for(int cta = me ; cta <= ma ; cta++){
            if (cta % 2 != 0){
                soma = soma + cta;
                System.out.println(cta);
            }
        }
        return soma;
    }
}