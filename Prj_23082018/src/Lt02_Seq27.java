/*  Nome do programa        : CalculaVelocidadeMedia
    Objetivo                : Receber número de voltas, extensão do circuito (metros) e o tempo de duração (minutos).
                              Calcular e mostrar a velocidade média em km/h
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 11/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq27 {
    static double voltas, extensao, tempo, velocidade, distancia;
    
    public static void main(String args[]){
        voltas = Double.parseDouble(JOptionPane.showInputDialog("Informe o número de voltas:"));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Informe a extensão do circuito (metros):"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo gasto em minutos:"));
        
        calculaVelocidade();
    }
    
    static void calculaVelocidade(){
        distancia = (voltas * extensao)/1000;
        tempo = tempo/60;
        velocidade = distancia/tempo;
        System.out.println("A velocidade média ao se percorrer " + distancia + "km " + "em " + tempo + " hora " + " é de: " + velocidade + "km/h");
    }
}
