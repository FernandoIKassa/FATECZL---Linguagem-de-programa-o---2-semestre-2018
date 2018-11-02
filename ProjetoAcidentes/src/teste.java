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
        Transito [] t = new Transito[20];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Transito();
        }
        System.out.println(t[1].codreg);
    }
    
    
}
