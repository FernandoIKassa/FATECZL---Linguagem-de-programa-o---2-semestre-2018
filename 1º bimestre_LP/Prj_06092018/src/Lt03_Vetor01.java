/*
    Nome do programa:           CalculaMediaSomaImpares
    Objetivo:                   Criar e coletar um vetor [50] inteiro. Calcular e exibir:
                                    a. A média dos valores entre 10 e 200;
                                    b. A soma dos números ímpares.
    Nome do programdor:         Fernando Issao Kassa
    Data do desenvolvimento:    17/09/2018
 */
import javax.swing.JOptionPane;
public class Lt03_Vetor01 {
    public static void main(String[] args) {
        int vetor[] = new int[50];
        int opc, media, somaImpares;
        media = 0;
        somaImpares = 0;
        opc = 0;
               
        while (opc != 9){
            opc = Integer.parseInt((JOptionPane.showInputDialog(""
                    + "1 - Carregar vetor \n"
                    + "2 - Mostra vetor \n"
                    + "3 - Calcular média de valores entre 10 e 200 \n"
                    + "4 - Mostrar a média \n"
                    + "5 - Calcular a soma dos números ímpares \n"
                    + "6 - Mostrar a soma dos ímpares \n"
                    + "9 - FIM")));
            switch(opc){
                case 1:
                    vetor = carregaVetor(vetor);
                    break;
                
                case 2:
                    mostraVetor(vetor);
                    break;
                    
                case 3:
                    media = calcularMedia(vetor);
                    break;
                    
                case 4:
                    mostraMedia(media);
                    break;
                
                case 5:
                    somaImpares = calcularSomaImpares(vetor);
                    break;
                    
                case 6:
                    mostraSomaImpares(somaImpares);
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                
                default: JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO");
            }
        }
    }
    
    // ------------------------------ MÉTODOS ------------------------------
    
        // **************************** carrega vetor ****************************
        
    static int [] carregaVetor (int vetor[]){
        for (int i = 0; i < 50; i++) {
            vetor[i] = (int) (Math.random() * 1000);
        }
        return vetor;
    }
    
    static void mostraVetor (int vetor[]){
        for (int i = 0; i < 50; i++) {
            System.out.println("Vetor" + "[" + i + "]" + " = " + vetor[i]);
        }
    }
    
    static int calcularMedia(int vetor[]){
        int soma, media, quant;
        soma = 0;
        quant = 0;
        for (int i = 0; i < 50; i++) {
            if (vetor[i] >= 10 & vetor[i] <= 200){
                soma = soma + vetor[i];
                quant++;
            }
        }
        media = soma/quant;
        return media;
    }
    
    static void mostraMedia(int media){
        System.out.println(media);
    }
    
    static int calcularSomaImpares(int vetor[]){
        int somaImpar = 0;
        for (int i = 0; i < 50; i++) {
            if (vetor[i] % 2 != 0){
                somaImpar = somaImpar + vetor[i];
            }
        }
        return somaImpar;
    }
    
    static void mostraSomaImpares(int soma){
        System.out.println(soma);
    }
}
