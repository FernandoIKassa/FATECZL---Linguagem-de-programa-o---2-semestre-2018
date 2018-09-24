/*
    Nome do programa:           CalcularConta
    Objetivo:                   Criar e coletar em um vetor [20] inteiro.
                                Calcule e exiba, segundo: 10 Σ i = 1 (A[i] – A[21–i])
    Nome do programdor:         Fernando Issao Kassa
    Data do desenvolvimento:    17/09/2018
 */
import javax.swing.JOptionPane;
public class Lt03_Vetor05 {
    public static void main(String[] args) {
        int vetor[] = new int [20];
        int opc, soma;
        opc = 0;
        soma = 0;
        
        
        while(opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Carregar vetor \n"
                    + "2 - Mostrar vetor \n"
                    + "3 - Calcular \n"
                    + "4 - Mostrar cálculo \n"
                    + "9 - FIM"));
            
            switch(opc){
                case 1:
                    vetor = carregarVetor(vetor);
                    break;
                    
                case 2:
                    mostrarVetor(vetor);
                    break;
                
                case 3:
                    soma = calcular(vetor);
                    break;
                    
                case 4:
                    mostrarCalculo(vetor, soma);
                    break;
                    
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO");
                    break;
            }
        }
    }
    
    static int [] carregarVetor(int vt []){
        for (int i = 0; i < 20; i++) {
            vt[i] = (int)(Math.random()* 100);
        }
        return vt;
    }
    
    static void mostrarVetor(int vt[]){
        for (int i = 0; i < 20; i++) {
            System.out.println("V[" + i + "]" + " = " + vt[i]);
        }
        
    }
    
    static int calcular (int vt[]){
        int resultado;
        resultado = 0;
        for (int i = 0; i < 10; i++) {
            resultado = resultado + vt[i] - vt[19 - i];
        }
        return resultado;
    }
    
    static void mostrarCalculo(int vt[], int soma){
        int calculo, j, resultado;
        resultado = 0;
        j = 19;
        for (int i = 0; i < 10; i++) {
            calculo = vt[i] - vt[j - i];
            System.out.println("v[" + i + "]" + " - " + "v[" + j + "]" + " = " + calculo);
            
        }
        System.out.println("Soma total: " + soma);
    }
    
}
