/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
public class teste {
    public static void main(String[] args) {
        Transito[] transito = new Transito[1];
        transito[0].codigoRegiao = 1;
        transito[0].nro_acidentes = 123;
        transito[0].qtd_veiculos = 5000;
        transito[0].tipo_veiculo = 5;
        
        
        
        System.out.println(transito[0].codigoRegiao);
    }
}
