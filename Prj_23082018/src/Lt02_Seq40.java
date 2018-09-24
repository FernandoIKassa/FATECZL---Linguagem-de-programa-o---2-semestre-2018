/*  Nome do programa:           CalcularPrimos
    Objetivo:                   Receber dois números inteiros.
                                Verificar e mostrar todos os números primos existentes entre eles.
    Programador:                Fernando Issao Kassa
    Data do desenvolvimento:    16/09/2018

*/
import javax.swing.JOptionPane;
public class Lt02_Seq40 {
    static int n1, n2, menor, maior;
    static String mostra;
    
    public static void main(String[] args) {
        n1 = Integer.parseInt((JOptionPane.showInputDialog("Digite o primeiro número:")));
        n2 = Integer.parseInt((JOptionPane.showInputDialog("Digite o segundo número:")));
        
        if (n1 < n2) {
            menor = n1;
            maior = n2;
        }else{
            menor = n2;
            maior = n1;
        }
        
        mostra = verificaPrimos(menor, maior);
        System.out.println(mostra);
    }
    
    static String verificaPrimos(int me, int ma){
        String lista = "";
        int primo = 1;
        while (me < ma){
            for (int cta = 2; cta < me; cta++) {
                if (me % cta == 0){
                    primo = 0;
                    break;
                }    
            }
            if (primo == 1){
                lista = lista + " " + me;
            }
            me++;
            primo = 1;
        }
        return lista;
    }
}