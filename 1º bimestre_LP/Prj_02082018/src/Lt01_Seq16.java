/* Objetivo:        Coletar a quantidade horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
                    Calcular o salário bruto (horas trabalhadas x valor da hora).
                    Depois calcular o salário líquido (salário bruto - desconto) e adicionar a ele o valor de 100 reais por dependente existente.
                    Mostre o salário a receber.
                    
    Programador:    Fernando Issao Kassa
    Data:           06/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq16 {
    public static void main (String args[]){
        double horas, valorHora, percDesconto, descendentes, salarioBruto, salarioLiquido, salarioReceber;
                
        horas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de horas trabalhadas:"));
        valorHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da hora de trabalho:"));
        percDesconto = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
        descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes existentes:"));
        
        salarioBruto = horas * valorHora;
        salarioLiquido = salarioBruto * (1 - percDesconto/100);
        salarioReceber = salarioLiquido + (descendentes * 100);
        
        System.out.println("Salário bruto: " + salarioBruto);
        System.out.println("Salário líquido: " + salarioLiquido);
        System.out.println("O salário a receber será de: " + salarioReceber);
    }
}