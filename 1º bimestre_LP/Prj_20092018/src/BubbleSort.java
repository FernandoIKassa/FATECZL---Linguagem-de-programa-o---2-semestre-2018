/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ruffy
 */
public class BubbleSort {
    public static void main (String args[]){
        int vet [] = new int [8];
        int aux = 0;
        for (int i = 0; i < 8; i++) {
            vet[i] = (int)(Math.random() * 100);
            System.out.print(vet[i] + " ");
        }
        
        System.out.print("\n");
        
        for(int i = 0; i<8; i++){
            for(int j = 0; j<7; j++){
                if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
            
        }
        
        for (int i = 0; i < 8; i++) {
            System.out.print(vet[i] + " ");
        }
        
        
    }
}
