/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab 102
 */
class Notas {
    String nome;
    double nt1;
    double nt2;
    double nt3;
    double media;
    
    //construtor
    Notas(){
        this("", 0.0, 0.0, 0.0, 0.0);
    }
    
    Notas (String nomealuno,
            double nt1aluno,
            double nt2aluno,
            double nt3aluno,
            double mediaaluno){
        nome = nomealuno;
        nt1 = nt1aluno;
        nt2 = nt2aluno;
        nt3 = nt3aluno;
        media = mediaaluno;
    }
}
