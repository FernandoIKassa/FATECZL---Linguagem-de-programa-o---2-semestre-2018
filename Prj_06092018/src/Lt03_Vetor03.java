/*
    Nome do programa:           TransporteDados
    Objetivo:                   Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3].
                                Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados.
                                P. ex: VT1| 1| 2| 3| |VT2| 4| 5| 6| |VT3| 1| 2| 3| 4| 5| 6
    Nome do programdor:         Fernando Issao Kassa
    Data do desenvolvimento:    17/09/2018
 */
import javax.swing.JOptionPane;
public class Lt03_Vetor03 {
    public static void main(String[] args) {
        int opc;
        opc = 0;
        int vt1[] = new int [3];
        int vt2[] = new int[3];
        int vt3[] = new int[6];
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Carregar vetor 1 \n"
                    + "2 - Carregar vetor 2 \n"
                    + "3 - (APÓS OPC 1 E 2) Carregar vetor 3 \n"
                    + "4 - Mostrar vetor 1 \n"
                    + "5 - Mostrar vetor 2 \n"
                    + "6 - Mostrar vetor 3 \n"
                    + "9 - FIM"));
            
            switch(opc){
                case 1:
                    vt1 = carregaVT(vt1);
                    break;    
                
                case 2:
                    vt2 = carregaVT(vt2);
                    break;
                    
                case 3:
                    vt3 = carregaVT3(vt1, vt2, vt3);
                    break;
                    
                case 4:
                    mostraVT(vt1, 3);
                    break;
                    
                case 5:
                    mostraVT(vt2, 3);
                    break;
                    
                case 6:
                    mostraVT(vt3, 6);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO!");
            }
        }
    }
    static int [] carregaVT(int vetor[]){
        for (int i = 0; i < 3; i++) {
            vetor[i] = (int)(Math.random() * 100);
        }
        return vetor;
    }
   
    static int [] carregaVT3(int vetor1[], int vetor2[], int vetor3[]){
        for (int i = 0; i < 6; i++) {
            if(i < 3){
                vetor3[i] = vetor1[i];
            }else{
                vetor3[i] = vetor2[i - 3];
            }     
        }
        return vetor3;
    }
    
    static void mostraVT (int vetor[], int quant){
        for (int i = 0; i < quant; i++) {
            System.out.println("v[" + i + "]" + " = " + vetor[i]);
        }
    }
}
