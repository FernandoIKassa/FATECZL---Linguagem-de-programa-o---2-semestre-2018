/*
    Nome do programa:        CalculaSerie2
    Objetivo:                Coletar um n postivo e calcular e mostrar a soma da serie:
                             1/n + 1/(n - 1) + 1(n - 2) + ... + 1/1
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 30/08/2018    
 */
import javax.swing.JOptionPane;
public class exerc2_2_recursiva {
    public static void main(String args[]){
        double n, soma;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        
        soma = calculaSerie(n);
        System.out.println(soma);
    }
    
    static double calculaSerie(double num){
            double x = 0;
            if (num == 1){
                return 1;
            }else{
                x = 1/num + calculaSerie(num - 1);
                return x;
            }
            
        }
}
