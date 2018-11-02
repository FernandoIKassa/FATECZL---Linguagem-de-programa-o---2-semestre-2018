/*
        Programador     : Ricardo Satoshi
        Data            : 30/02/2017
        Objetivo        : Calcula a Área do Triângulo 
                          Exemplo de recursiva

*/
import javax.swing.JOptionPane;
public class ex_funcao_recursiva {
     public static void main (String args[]){
         int n,fatorial; 
         n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o seu fatorial:"));
         fatorial = calculaFatorial(n);
        System.out.println(fatorial);
    }
    
    
    static int calculaFatorial(int num){
        int x, cta;
        x = 1;
        
        for(cta = num; cta >= 1; cta--){
            x = x * cta;
        }
        
        return x;
    }
    
   
}
