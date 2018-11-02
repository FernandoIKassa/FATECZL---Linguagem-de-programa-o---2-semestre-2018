
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/*
    Nome do programa:           CalculaAnosBissextos
    Objetivo:                   Receba a data de nascimento e atual em ano, mês e dia.
                                Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
    Nome do programador:        Fernando Issao Kassa
    Data:                       05/10/2018
 */
import javax.swing.JOptionPane;
public class Lt01_exer30 {
    public static void main (String args[]){
        int diaN, mesN, anoN, diaF, mesF, anoF, valido;
        diaN = 0;
        mesN = 0;
        anoN = 0;
        
        do{
            
            diaN = Integer.parseInt(JOptionPane.showInputDialog("Digite o DIA do seu nascimento:"));
            mesN = Integer.parseInt(JOptionPane.showInputDialog("Digite o MES do seu nascimento:"));
            anoN = Integer.parseInt(JOptionPane.showInputDialog("Digite o ANO do seu nascimento:"));
            valido = ((diaN >= 1 && diaN <= 31 && mesN >= 1 && mesN <= 12) ? 1 : 0);
            if (valido == 0) {
                JOptionPane.showMessageDialog(null, "Dia e/ou mês INVÁLIDO!");
            }
        }while(valido ==0);
        
        System.out.println(LocalDateTime.now());
    }
}
