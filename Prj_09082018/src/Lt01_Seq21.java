/*  Nome do programa        : CalculaMedia
    Objetivo                : Coletar 4 notas bimestrais e calcule a média.
                              Mostre as seguintes mensagens de acordo o resultado:
                              a. Se a média for >= 6,0 exibir “APROVADO”;
                              b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
                              c. Se a média for < 3,0 exibir “RETIDO”. 
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 09/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq21 {
    public static void main (String args[]){
        double notaUm, notaDois, notaTres, notaQuatro, media;
        notaUm = Double.parseDouble(JOptionPane.showInputDialog("Digite a PRIMEIRA nota:"));
        notaDois = Double.parseDouble(JOptionPane.showInputDialog("Digite a SEGUNDA nota:"));
        notaTres = Double.parseDouble(JOptionPane.showInputDialog("Digite a TERCEIRA nota:"));
        notaQuatro = Double.parseDouble(JOptionPane.showInputDialog("Digite a QUARTA nota:"));
        
        media = (notaUm + notaDois + notaTres + notaQuatro)/4;
        
        if (media >= 6){
            System.out.println("Média: " + media + " - APROVADO");
        }else if (media >=3 && media < 6){
            System.out.println("Média: " + media + " - EXAME");
        }else{
            System.out.println("Média: " + media + " - REPROVADO!!!");
        }
        
    }
}
