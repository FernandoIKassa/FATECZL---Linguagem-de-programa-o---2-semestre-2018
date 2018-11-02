/*
    Nome do programa:           CalculaMediaMaiorMeno
    Objetivo:                   Criar e coletar um vetor [100] inteiro e exibir:
                                    a. O maior e o menor valor;
                                    b. A média dos valores.
    Nome do programdor:         Fernando Issao Kassa
    Data do desenvolvimento:    17/09/2018
 */
import javax.swing.JOptionPane;
public class Lt03_Vetor02 {
    public static void main(String[] args) {
        int vetor[] = new int [100];
        int opc, media, maior, menor;
        opc = 0;
        media = 0;
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog((""
                    + "1 - Carregar vetor \n"
                    + "2 - Mostra valores \n"
                    + "3 - Organiza vetor de forma crescente \n"
                    + "4 - Calcula a média dos valores \n"
                    + "5 - Mostra média \n"
                    + "6 - (APÓS ORGANIZAR O VETOR) Mostra maior e menor número do vetor \n"
                    + "9 - FIM")));
            switch(opc){
                case 1:
                    vetor = carregaVetor(vetor);
                    break;
                
                case 2:
                    mostraVetor(vetor);
                    break;
                    
                case 3:
                    organizaVetor(vetor);
                    break;
                    
                case 4:
                    media = calculaMedia(vetor);
                    break;
                    
                case 5:
                    mostraMedia(media);
                    break;
                    
                case 6:
                    mostraMaiorMenor(vetor);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    
                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO!");
            }
        }
    }
    
    static int [] carregaVetor(int v[]){
        for (int i = 0; i < 100; i++) {
            v[i] = (int)(Math.random() * 100);
        }
        return v;
    }
    
    static void mostraVetor(int v[]){
        for (int i = 0; i < 100; i++) {
            System.out.println("V[" + i + "]" + " = " + v[i]);
        }
    }
    
    static int [] organizaVetor(int v[]){
        int aux;
        aux = 0;
        for (int i = 0; i < 99; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (v[i] > v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        return v;
    }
    
    static int calculaMedia(int v[]){
        int media, soma, quantidade;
        media = 0;
        soma = 0;
        quantidade = 0;
        for (int i = 0; i < 100; i++) {
            quantidade++;
            soma = soma + v[i];
        }
        media = soma/quantidade;
        return media;
    }
    
    static void mostraMedia(int media){
        System.out.println("A média é: " + media);
    }
    
    static void mostraMaiorMenor (int v[]){
        System.out.println("O menor número do vetor:" + v[0]);
        System.out.println("O maior número do vetor:" + v[99]);
    }
}