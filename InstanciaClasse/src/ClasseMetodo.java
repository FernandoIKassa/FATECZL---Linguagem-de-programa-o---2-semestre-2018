
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
public class ClasseMetodo {
public int[] FunçãoCarrega(int v[]) {
    
        int  i;

        for(i=0; i<5; i++) {
    
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "o elemento do vetor."));
        }

        return v;
    }
    
    public int[] FunçãoClassifica(int v[]) {
        int i, j, aux;
        
        for(i=0; i<4; i++) {
            for(j=i+1; j<5; j++) {
                if(v[i]>v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        
        return v;
    }
    
    public void ProcedimentoMostra(int v[]) {
        //System.out.println("O vetor eh:\n");
        String mostra="";
        for (int i=0; i<5; i++) { 
            //System.out.println(v[i]);
            mostra += ("\t "+v[i]);
        }
        JOptionPane.showMessageDialog(null,mostra);
    }   
}
