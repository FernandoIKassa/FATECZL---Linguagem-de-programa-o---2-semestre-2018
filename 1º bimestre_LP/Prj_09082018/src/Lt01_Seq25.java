/*  Nome do programa        : DiferençaHorarios
    Objetivo                : Coletar hora inicial e final de um jogo.
                              Tempo máximo de 24 horas e o jogo pode começar em um dia e terminar no outro.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq25 {
    public static void main(String args[]){
        int horaInicial, minutoInicial, horaFinal, minutoFinal, horas, minutos;
        horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial do jogo:"));
        minutoInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto inicial do jogo:"));
        horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final do jogo:"));
        minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a minuto final do jogo:"));
        
        if(horaInicial == horaFinal && minutoInicial == minutoFinal){
            horas = 24;
            minutos = 0;
        }
        else{
          if(horaFinal > horaInicial){
              horas = horaFinal - horaInicial;
          }else{
              horas = horaFinal - horaInicial + 24;
          }
          if (minutoFinal < minutoInicial){
              horas = horas - 1;
              minutoFinal = minutoFinal + 60;
              minutos = minutoFinal - minutoInicial;
          }else{
              minutos = minutoFinal - minutoInicial;
          }
        }
         System.out.println(horas + ":" + minutos);
    }
}
