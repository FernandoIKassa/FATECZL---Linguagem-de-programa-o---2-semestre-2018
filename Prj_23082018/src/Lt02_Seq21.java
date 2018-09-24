/*  Nome do programa        : CalculaMedia
    Objetivo                : Coletar 4 notas bimestrais e calcule a média.
                              Mostre as seguintes mensagens de acordo o resultado:
                              a. Se a média for >= 6,0 exibir “APROVADO”;
                              b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
                              c. Se a média for < 3,0 exibir “RETIDO”. 
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq21 {
    static double
        media,
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:")),
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:")),
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:")),
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
    
    public static void main(String[] args) {
        CalculaMedia();
        VerificaSituacao();
    }
    
    //--------------- MÉTODOS -------------------
    static void CalculaMedia(){
        media = (n1 + n2 + n3 + n4)/4;
    }
    
    static void VerificaSituacao(){
        if (media >= 6){
            System.out.println("Média: " + media + " - APROVADO");
        }else if(media < 3){
            System.out.println("Média: " + media + " - REPROVADO!!!");
        }else{
            System.out.println("Média: " + media + " - EXAME");
        }
    }
}
