/*
    Nome do programa:           CalculaNotas
    Objetivo:                   Criar e coletar em um vetor [30] real e calcular e exibir:
                                    a. A média do grupo;
                                    b. A quantidade de notas acima do grupo;
                                    c. As posições dos valores abaixo da média do grupo.
    Nome do programdor:         Fernando Issao Kassa
    Data do desenvolvimento:    17/09/2018
 */
import javax.swing.JOptionPane;
public class Lt03_Vetor04 {
    public static void main(String[] args) {
        double vetor [] = new double[30];
        double media;
        media = 0;
        int opc;
        opc = 0;
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Carregar vetor de notas \n"
                    + "2 - Mostrar vetor  \n"
                    + "3 - Calcular média do grupo \n"
                    + "4 - Mostrar média \n"
                    + "5 - Mostrar as quais e a quantidade de notas acima da média \n"
                    + "6 - Mostrar as posições das notas abaixo da média \n"
                    + "9 - FIM"));
            
            switch(opc){
                case 1:
                    vetor = carregarVetor(vetor);
                    break;
                    
                case 2:
                    mostrarVetor(vetor);
                    break;
                    
                case 3:
                    media = calcularMedia(vetor);
                    break;
                    
                case 4:
                    mostrarMedia(media);
                    break;
                    
                case 5:
                    mostrarNotasAcima(vetor, media);
                    break;
                    
                case 6:
                    mostrarPosicaoNotasAbaixo(vetor, media);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO!");
                    break;
            }
        }
    }
    
    static double [] carregarVetor(double vt[]){
        for (int i = 0; i < 30; i++) {
            vt[i] = (int)(Math.random() * 100);
        }
        return vt;
    }
    
    static void mostrarVetor(double vt[]){
        for (int i = 0; i < 30; i++) {
            System.out.println("V[" + i + "]" + " = " + vt[i]);
        }
    }
    
    static double calcularMedia(double vt[]){
        double media, soma, quanti;
        soma = 0;
        quanti = 0;
        for (int i = 0; i < 30; i++) {
            soma = soma + vt[i];
            quanti++;
        }
        media = soma/quanti;
        return media;
    }
    
    static void mostrarMedia(double media){
        System.out.println("A média é: " + media);
    }
    
    static void mostrarNotasAcima(double vt[], double media){
        int quanti = 0;
        for (int i = 0; i < 30; i++) {
            if (vt[i] > media){
                System.out.println("v[" + i + "]" + " = " + vt[i]);
                quanti++;
            }
        }
        System.out.println("Quantidade de notas acima da média: " + quanti);
    }
    
    static void mostrarPosicaoNotasAbaixo(double vt[], double media){
        int quanti = 0;
        for (int i = 0; i < 30; i++) {
            if(vt[i] < media){
                System.out.println("v[" + i + "]" + " = " + vt[i]);
                quanti++;
            }
        }
        System.out.println("Quantidade de notas ABAIXO da média: " + quanti);
    }
       
}


