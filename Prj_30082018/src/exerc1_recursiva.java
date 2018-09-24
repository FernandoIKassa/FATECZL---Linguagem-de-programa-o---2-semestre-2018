/*
    Nome do programa:        CalcularSoma100
    Objetivo:                Calcular e mostrar a soma dos 100 primeiros números (a partir do 1)
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 30/08/2018    
 */
public class exerc1_recursiva {
    public static void main(String[] args) {
        int n, soma;
        n = 1;
        soma = calculaCem(n);
        System.out.println(soma);
    }
    
    static int calculaCem(int num){
        int x;
        if (num == 100){
            return 100;
        }else{
            x = num + calculaCem(num + 1);
            return x;
        }
    }
}
