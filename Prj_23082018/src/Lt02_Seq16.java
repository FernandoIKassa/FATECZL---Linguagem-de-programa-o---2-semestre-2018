/* Objetivo:        Coletar a quantidade horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
                    Calcular o salário bruto (horas trabalhadas x valor da hora).
                    Depois calcular o salário líquido (salário bruto - desconto) e adicionar a ele o valor de 100 reais por dependente existente.
                    Mostre o salário a receber.
                    
    Programador:    Fernando Issao Kassa
    Data:           23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq16 {
    static double
        salarioBruto,
        salarioLiquido,
        horas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de horas trabalhadas:")),
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora de trabalho:")),
        percDesconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:")),
        descendentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de descendentes existentes:"));
    public static void main ( String args[] ){
            CalculaSalarioBruto();
            CalculaSalarioLiquido();
            System.out.println("Salário líquido: " + salarioLiquido);
      }
    
    //--------------- MÉTODOS -------------------
    static void CalculaSalarioBruto () {
        salarioBruto = horas * valorHora;
    }
    
    static void CalculaSalarioLiquido(){
        double desconto = salarioBruto * (percDesconto/100);
        salarioLiquido = salarioBruto - desconto + (descendentes * 100);
    }
}

