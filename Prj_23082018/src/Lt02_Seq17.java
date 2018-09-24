/* Objetivo:        Coletar o tempo de percurso de uma viagem e a velocidade média.
                    Calcular a quantidade de litros gastos com um automóvel que faz 12km/l.
                    
    Programador:    Fernando Issao Kassa
    Data:           23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq17 {
    static double
        litros,
        percurso,
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo gasto:")),
        velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média:"));
    
    public static void main(String args[]){
        CalculaLitros();
        System.out.println("Litros gasto: " + litros);
    }
    
    //--------------- MÉTODOS -------------------
    static void CalculaLitros(){
        percurso = tempo * velocidade;
        litros = percurso/12;
    }
}
