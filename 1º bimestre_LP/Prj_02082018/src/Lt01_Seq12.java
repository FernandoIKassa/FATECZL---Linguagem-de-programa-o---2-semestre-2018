/* Objetivo:    Coleta o ano de nascimento e ano atual, calcula e mostra a idade atual e daqui a 17 anos.
                    Este código fonte será salvo no arquivo
                    PrimeiroPrograma.java
    Programador:    Fernando Issao Kassa
    Data:           03/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq12 {
    public static void main (String args[]){
        int anoNascimento, anoAtual, idade, idadeFutura;
        
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento:"));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual em que estamos:"));
        idade = anoAtual - anoNascimento;
        idadeFutura = idade + 17;
        
        System.out.println("Sua idade atual é: " + idade);
        System.out.println("Sua idade daqui a 17 anos: " + idadeFutura);
    }
}
