/*  Nome do programa        : DiferençaMaiorMenor        
    Objetivo                : Coletar 2 valores inteiros, calcular e mostrar o resultado da diferença do maior pelo menor.
    Programador             : Fernando Issao Kassa
    Data de desenvolvimento : 23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq18 {
    static int
        menor,
        maior,
        diferenca,
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:")),
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
    
    public static void main(String args[]){
        VerificaMenorMaior();
        CalculaDiferenca();
        System.out.println("A diferença entre o " + maior + " e o " + menor);
    }
    
    //--------------- MÉTODOS -------------------
    static void VerificaMenorMaior(){
        if (n1 < n2){
            menor = n1;
            maior = n2;
        }else{
            menor = n2;
            maior = n1;
        }
    }
    
    static void CalculaDiferenca(){
        diferenca = maior - menor;
    }
}
