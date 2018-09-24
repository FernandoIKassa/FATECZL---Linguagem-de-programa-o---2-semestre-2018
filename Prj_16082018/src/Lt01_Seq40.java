/*  Nome do programa:        MostraPrimos
    Objetivo:                Receber dois números inteiros. Mostre todos os números primos entre eles.
    Programador:             Fernando Issao Kassa
    Data do desenvolvimento: 23/08/2018

*/
import javax.swing.JOptionPane;
public class Lt01_Seq40 {
    public static void main (String args[]){
        int
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:")),
            n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:")),
            cta = 0,
            menor = 0,
            maior = 0,
            primo = 1;
        
        if (n1 < n2){
            menor = n1;
            maior = n2;
        }else if (n1 > n2){
            menor = n2;
            maior = n1;
        }else{
            System.out.println("Números NÃO podem ser iguais!");
        }
        
        while(menor <= maior){
            for(cta = 2 ; cta < menor ; cta ++){
                if (menor % cta == 0){
                    primo = 0;
                    break;
                }
            }
            if (primo == 1){
                System.out.println(menor);
            }
            menor++;
            primo = 1;
        }
        
        
    }
}
