class Transito 	
{	
    int codreg;	
    int codvei;
    int qtdacd;
    int qtdvei;
    
    // construtor	
    Transito ()
    {	
        this(0, 0, 0, 0);	
    }	
    
    Transito (int wcodreg, int wcodvei, int wqtdacd, int wqtdvei)	
    {
        codreg  = wcodreg;	
        codvei  = wcodvei;
        qtdacd  = wqtdacd;
        qtdvei  = wqtdvei;
    }
}