/* Objetivo:        Coletar o tempo de percurso de uma viagem e a velocidade média.
                    Calcular a quantidade de litros gastos com um automóvel que faz 12km/l.
                    
    Programador:    Fernando Issao Kassa
    Data:           06/08/2018

*/
import javax.swing.JOptionPane;

public class Lt01_Seq17 {
    public static void main (String args[]){
        double tempoHoras, velocidadeMedia, litros;
                
        tempoHoras = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de viagem em horas:"));
        velocidadeMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média do veículo durante o percurso:"));
        
        litros = (tempoHoras * velocidadeMedia)/12;
        
        System.out.println("Quantidade de litros consumida: " + litros);
    }
}