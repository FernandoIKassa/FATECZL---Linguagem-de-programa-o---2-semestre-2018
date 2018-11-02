/*
    Nome do programa:           OrganizarCrescente
    Objetivo:                   A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e
                                verificar a sua existência no vetor (utilizar pesquisa binária).
    Nome do programdor:         Fernando Issao Kassa
    Data do desenvolvimento:    18/09/2018
 */
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class Lt03_Vetor07 {
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
                    + "4 - Procurar número\n (FAÇA A PROCURA APÓS A OPÇÃO 3) \n"
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
                    
                case 4:
                    procuraNumero(vetor);
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
    
    static void procuraNumero(int vt []){
        int inicio, meio, fim, encontrado, n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado:"));
        inicio = 0;
        fim = 19;
        encontrado = 0;
        
        while (inicio <= fim & encontrado == 0){
            meio = (fim+inicio)/2;
            if (n == vt[meio]){
                encontrado = 1;
                break;
            }else if (n < vt[meio]){
                fim = meio - 1;
            }else if (n > vt[meio]){
                inicio = meio + 1;
            }
        }
        if (encontrado == 1){
            System.out.println("Número encontrado!");
        }else{
            System.out.println("Número NÃO encontrado!");
        }
        
    }
}
