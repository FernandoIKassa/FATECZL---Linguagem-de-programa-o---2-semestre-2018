/*  Nome do programa        : VerificaMultiplo
    Objetivo                : Coletar dois números inteiros.
                              Verificar se o maior é múltiplo do menor.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 16/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq26 {
    public static void main(String args[]){
        int primeiroNumero, segundoNumero, maior, menor;
        primeiroNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        if (primeiroNumero < segundoNumero) {
            menor = primeiroNumero;
            maior = segundoNumero;
        } else {
            maior = primeiroNumero;
            menor = segundoNumero;
        }
        
        if (maior % menor == 0) {
            System.out.println(maior + " é múltiplo de " + menor);
        } else{
            System.out.println(maior + " NÃO é múltiplo de " + menor);
        }
    }
}
