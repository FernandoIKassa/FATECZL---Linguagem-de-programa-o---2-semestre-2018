/*
        Programador     : Ricardo Satoshi
        Data            : 30/02/2017
        Objetivo        : Calcula a Área do Triângulo 
                          Exemplo de recursiva 2

*/
import javax.swing.JOptionPane;
public class ex_recursiva {
    public static void main(String[] args) {
        int n, resultado;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        resultado = recursiva01(n);
        System.out.println(resultado);
    }
    
    static int recursiva01(int num){
        int x;
        if(num == 1){
            return 1;
        }else{
            x = num * recursiva01(num -1);
            return x;
        }
    }
}
