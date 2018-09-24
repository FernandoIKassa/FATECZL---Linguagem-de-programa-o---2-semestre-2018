/*  Nome do programa        : CalculaNovoPreco
    Objetivo                : Receber preço atual e média mensal de vendas de um produto.
                              Calcular e mostrar, sabendo que (conforme PDF).
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 11/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq28 {
    static double precoAtual, vendas, precoNovo;
    
    public static void main(String[] args) {
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto:"));
        vendas = Double.parseDouble(JOptionPane.showInputDialog("Digite o total de vendas no mês:"));
        
        calculaPrecoNovo();
    }
    
    static void calculaPrecoNovo(){
        if (vendas < 500 & precoAtual < 30){
            precoNovo = precoAtual * 1.1;
        }else if(vendas >= 500 & vendas < 1000 & precoAtual >= 30 & precoAtual < 80){
            precoNovo = precoAtual * 1.15;
        }else if (vendas >= 1000 & precoAtual >= 80){
            precoNovo = precoAtual * 0.95;
        }else{
            precoNovo = precoAtual;
        }
        System.out.print("Para um preço atual de " + precoAtual + " e vendas de " + vendas + " unidades, tem-se o NOVO PREÇO de: " + precoNovo);
    }
}
