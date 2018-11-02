/*
        Nome do programa:       MostraMediaNotaAlunosCandidato
        Objetivo:               Coletar as notas de 100 candidatos e calcular o seguinte:
                                    - média do grupo;
                                    - nº do candidato e se a nota é maior ou menor que a média do grupo
        Nome do programador:    Fernando Issao Kassa
        Data:                   06/09/2018
 */
import javax.swing.JOptionPane;
public class ExercicioVetor {
    public static void main(String[] args) {
        int vetorCand[] = new int[100];
        int opc = 0;
        double media = 0;
        
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - carregar candidados \n"
                +   "2 - mostra candidatos \n"
                +   "3 - Calcula média \n"
                +   "4 - Mostra a média \n"
                +   "5 - Mostra candidato com nota > média \n" 
                +   "9 - FIM "));
            switch(opc){
                case 1:
                    vetorCand = carregaCandidato(vetorCand);
                    break;
                    
                case 2:
                    mostraCandidato(vetorCand);
                    break;
                    
                case 3:
                    media = calculaMedia(vetorCand);
                    break;
                
                case 4: mostraMedia(media);
                    break;
                    
                case 5:
                    mostraCandidatoAcimaMedia(media, vetorCand);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO!");
            }
        }
    }
    
// -------------------------- MÉTODOS  --------------------------
    
    // **********************  Carrega vetor  **********************
    public static int [] carregaCandidato(int vetor[]){
        int cta;
        
        for (cta = 0 ; cta < 100 ; cta++){
            vetor[cta] = (int) (Math.random() * 100);
        }
        return vetor;
    }
    
    // ********************** Mostra todos os candidatos  **********************
    public static void mostraCandidato(int vetor[]){
        int cta;
        
        for (cta = 0 ; cta < 100 ; cta++){
            System.out.println("Vet[" + cta + "] = " + vetor[cta]);
            System.out.println("*********************************");
        }
    }
    
    // ********************** Calcula a MÉDIA  **********************
    public static double calculaMedia(int vetor[]){
        int cta, soma;
        soma = 0;
        double media;
        for (cta = 0 ; cta < 100 ; cta ++){
            soma = soma + vetor[cta];
        }
        media = soma/100;
        
        return media;
    }
    
    // ********************** Mostra a média  **********************
    public static void mostraMedia (double media){
        System.out.println("A média do grupo é:" + media);
    }
    
    
    // ********************** Mostra candidato acima da média  **********************
    public static void mostraCandidatoAcimaMedia(double media, int vetor[]){
        int cta;
        for (cta = 0 ; cta < 100 ; cta++){
            if (vetor[cta] > media)
            System.out.println("Candidato " + cta + " - " + vetor[cta]);
        }
    }
}
