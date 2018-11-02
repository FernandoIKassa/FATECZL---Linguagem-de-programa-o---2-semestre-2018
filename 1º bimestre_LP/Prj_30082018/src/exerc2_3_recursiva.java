/*
    Nome do programa:        CalculaSerie3
    Objetivo:                Coletar um n postivo e calcular e mostrar a soma da serie:
                             1/n + 2/(n - 1) + 3/(n - 2) + ... + n/1
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 17/09/2018    
 */
import javax.swing.JOptionPane;
public class exerc2_3_recursiva {
    public static void main(String[] args) {
        double n, resultado;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número:"));
        
        resultado = calculaSerie(n);
        System.out.println(resultado);
    }
    
    static double calculaSerie(double numero){
        double x, quociente;
        quociente = 6;
        
        if (numero == 1){
            return quociente - numero;
        }else{
            x = (quociente - numero)/numero + calculaSerie(numero - 1);
            return x;
        }
    }
}
