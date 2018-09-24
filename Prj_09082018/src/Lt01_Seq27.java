/*  Nome do programa        : CalculaVelocidadeMedia
    Objetivo                : Coletar número de voltas, extensão do circuito (em mentro) e o tempo de duração em minutos.
                              Calcular e mostrar a velocidade média em km/h.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 16/08/2018

*/

import javax.swing.JOptionPane;

public class Lt01_Seq27 {
    public static void main(String args[]){
        int voltas;
        double circuito, tempo, velocidade;
        
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas realizadas:"));
        circuito = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do circuito (metros):"));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Informe quantos minutos foram gastos:"));
        
        circuito = circuito/1000; //transformar metros em KM
        tempo = tempo/60; //transforma minutos em horas;
        
        velocidade = (circuito * voltas)/tempo;
                
        System.out.println("A velocidade média foi de: " + velocidade + "km/h");
    }
}
