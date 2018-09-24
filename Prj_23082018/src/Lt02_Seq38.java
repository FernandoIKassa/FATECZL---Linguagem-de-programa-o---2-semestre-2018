/*  Nome do programa:        VerificaMaiorMenorNumero
    Objetivo:                Receber 100 números inteiros. Verificar qual o maior e o menor (somente números positivos).
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq38 {
    static int n;
    static String resposta;
    
    public static void main (String args[]){
        n = 100;
        resposta = verifica(n);
        System.out.println(resposta);
    }
    
    static String verifica(int limite){
        int numGerado, menor, maior;
        String mostra;
        
        menor = 0;
        maior = 0;
        mostra = "";
        for (int cta = 1; cta <= limite; cta++) {
            numGerado = (int) (Math.random() * 10000);
            if (menor == 0 & maior == 0){
                menor = numGerado;
                maior = numGerado;   
            }else if (numGerado < menor){
                menor = numGerado;
            }else if (numGerado > maior){
                maior = numGerado;
            }
            System.out.println(numGerado);
        }
        mostra = "Menor número: " + menor + "\nMaior número: " + maior;
        return mostra;
    }
}

//Receba 100 números inteiros reais. Verifique e mostre o maior e o menos valor. Obs.: somente valores positivos