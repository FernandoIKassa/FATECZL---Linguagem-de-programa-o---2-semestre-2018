/*  Nome do programa        : VerificaDiv23
    Objetivo                : Coletar um número inteiro. Verificar se é divísivel por 2 e 3.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq24 {
    public static void main(String args[]){
        int a;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        if (a % 2 == 0 && a % 3 == 0){
            System.out.println("Número é divisível por 2 e por 3.");
        }else{
            System.out.println("Número é NÃO divisível por 2 e por 3.");
        }
    }
}
