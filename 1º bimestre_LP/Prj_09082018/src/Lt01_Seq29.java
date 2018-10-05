/*  Nome do programa        : CalculaRendimento
    Objetivo                : Coletar o código do investimento (1 - poupança e 2 - renda fixa) e valor do investimento.
                              Calcular e mostrar o valor corrigido depois de 30 dias sabendo que o rendimento da poupança = 3% e da renda fixa = 5%.
                              Outros códigos deverão ser desconsiderados.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 16/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq29 {
    public static void main(String args[]){
        int codigo;
        double investimento, valorCorrigido;
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do investimento (1 - poupança ou 2 - renda fixa):"));
        if(codigo == 1 || codigo == 2){
            investimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o quanto deseja investir:"));
            if (codigo == 1){
                valorCorrigido = investimento * 1.03;
            }else{
                valorCorrigido = investimento * 1.05;
            }
            System.out.println("O valor corrigido é de: " + valorCorrigido);
        }else{
            System.out.println("CÓDIGO INVÁLIDO!");
        }
    }
}
