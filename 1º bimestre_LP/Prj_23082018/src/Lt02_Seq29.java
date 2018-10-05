/*  Nome do programa        : CorrigeValor
    Objetivo                : Receber um tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
                              Calcular e mostrar o valor corrigido em 30 dias, sabendo que a poupança rende 3% e a renda fixa 5%.
                              Demais opções devem ser desconsideradas.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 11/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq29 {
    static double valor, novoValor;
    static int tipo, tipoCorreto;
    
    public static void main(String[] args) {
        tipoCorreto = 0;
        while (tipoCorreto == 0){
            tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de investimento: \n 1 - poupança \n 2 - renda fixa"));
            if (tipo == 1 || tipo == 2){
                tipoCorreto = 1;
            }else{
                JOptionPane.showMessageDialog(null, "TIPO INVÁLIDO!!");
            }
        }
        
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento:"));
        
        calculaRendimento();
    }
    
    static void calculaRendimento(){
        if (tipo == 1){
            novoValor = valor * 1.03;
        }else if (tipo == 2){
            novoValor = valor * 1.05;
        }
        System.out.println("Valor atualizado: " + novoValor);
    }
}
