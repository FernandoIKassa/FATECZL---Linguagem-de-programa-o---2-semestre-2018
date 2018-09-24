/*  Nome do programa        : HoraFinalInicial
    Objetivo                : Receba a hora de início e final de um jogo (HH, MM).
                              O tempo máximo de jogo é de 24 horas e pode começar e terminar noutro.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 10/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq25 {
    static double
            limite = 0,
            totalMinutos = 0,
            tempo = 0,
            horaInicial,
            minutoInicial,
            horaFinal,
            minutoFinal;
    
    public static void main(String[] args) {
        
        while (limite == 0){
            horaInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora inicial:"));
            minutoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto inicial:"));
            horaFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a hora final:"));
            minutoFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a minuto final:"));
            
            if (horaFinal < horaInicial){
                totalMinutos = ((horaFinal * 60)) + minutoFinal - ((horaInicial * 60) + minutoInicial) + 1440;
            }else{
                totalMinutos = ((horaFinal * 60)) + minutoFinal - ((horaInicial * 60) + minutoInicial);
            }
            
            tempo = totalMinutos/60;
            
            if (horaInicial == 0 & horaFinal == 0  & minutoInicial == 0 & minutoFinal == 0){
                tempo = 24;
                limite = 1;
            }else if (totalMinutos > 1440){
                tempo = tempo - 24;
                JOptionPane.showMessageDialog(null, "O tempo não pode exceder 24 horas!");
                JOptionPane.showMessageDialog(null, "Total do tempo do jogo a mais nesse caso: " + tempo);
            }else{
                limite = 1;
            }
        }
        System.out.println("Tempo total do jogo em horas:" + tempo);
        
        
        
        
        
        
    }
}
