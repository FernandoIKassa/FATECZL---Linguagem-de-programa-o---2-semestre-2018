/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Issao
 */
public class teste {

    public static void main(String[] args) {
        int[] vet = new int[1000];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = (int) (Math.random() * 1000);
            System.out.println(vet[i]);
        }

        for (int i = 0; i < vet.length; i++) {
            int aux = 0;
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
            
        }
        System.out.println("\n");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
}
