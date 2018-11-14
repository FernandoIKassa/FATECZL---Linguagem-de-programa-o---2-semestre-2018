/*Criar uma classe abstrata segundo:
............................................................................	
.	              	Votação               	         	.
.............................................................................
.    NumerioSeção        :      NumeroCandidato      . 
............................................................................
.             int	           :                 int                      .
............................................................................
*/
public class Votacao2018 {
    int NumeroCandidato;
    int NumeroSecao;
    
    
    //construtores
    
    Votacao2018(){
        this(0,0);
    }
    
    Votacao2018(int nCandidato, int nSecao){
        NumeroCandidato = nCandidato;
        NumeroSecao = nSecao;
    }
    
    
}
