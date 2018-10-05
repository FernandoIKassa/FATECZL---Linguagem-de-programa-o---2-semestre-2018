/*
    Nome do programa:           OrganizarCrescente
    Objetivo:                   Criar e coletar em um vetor [20] com números aleatórios.
                                Classificar este vetor em ordem crescente e mostre os dados.
    Nome do programdor:         Fernando Issao Kassa
    Data do desenvolvimento:    18/09/2018
 */
import javax.swing.JOptionPane;
public class Lt03_Vetor06 {
    static int tamanhoVetor;
    public static void main(String[] args) {
        int opc;
        tamanhoVetor = 20;
        int vetor [] = new int [tamanhoVetor];
        
        opc = 0;
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Carregar vetor \n"
                    + "2 - Mostrar vetor  \n"
                    + "3 - Organizar vetor \n"
                    + "9 - FIM"));
            
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
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO!");
                    break;
            }
        }
    }
    static int [] carregaVetor (int vt[]){
        for (int i = 0; i < tamanhoVetor ; i++) {
            vt[i] = (int)(Math.random()*100);
        }
        return vt;
    }
    
    static void mostraVetor(int vt[]){
        for (int i = 0; i < tamanhoVetor; i++) {
            System.out.println("v["+ i + "]" + " = " + vt[i]);
        }
    }
    
    static int [] organizaVetor(int vt []){
        int aux;
        aux = 0;
        for (int i = 0; i < tamanhoVetor - 1; i++) {
            for (int j = i + 1; j < tamanhoVetor; j++) {
                if (vt[i] > vt[j]){
                    aux = vt[i];
                    vt[i] = vt[j];
                    vt[j] = aux;
                }
            }
        }
        return vt;
    }
}