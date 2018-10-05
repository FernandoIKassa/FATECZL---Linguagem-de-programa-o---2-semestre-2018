/*  Nome do programa        : AtualizaPreco
    Objetivo                : Coletar preço atual e a média mensal de um produto.
                              Calcular e mostre o novo preço:

    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 16/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq28 {
    public static void main(String args[]){
        double precoAtual, novoPreco;
        int vendaMensal;
        
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual do produto:"));
        vendaMensal = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade vendida no mês desse mesmo produto:"));
        
        if (precoAtual < 30 && vendaMensal < 500) {
            novoPreco = precoAtual *1.1;
        } else if(precoAtual >= 30 && precoAtual < 80 && vendaMensal >= 500 && vendaMensal <1000) {
            novoPreco = precoAtual *1.15;
        } else if(precoAtual >= 80 && vendaMensal >= 1000){
            novoPreco = precoAtual *0.95;
        } else{
            novoPreco = precoAtual;
        }
        
        System.out.println("O novo do preço do produto é: " + novoPreco);
    }
}
