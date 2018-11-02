/*
Objetivo:   Metodos do sistema de acidentes
Programador:Mario Kizuke Suzuki
Data:       11/10/2018
 */

import javax.swing.JOptionPane;

public class Metodos 
{
    public Transito[] CarregaAcidentes(int Len, boolean random) 
    {
    
        int i, wcodreg, wcodvei;
        
        Transito[] wt = new Transito[Len];
        
        for (i = 0 ; i < wt.length ; i++) 
            wt[i] = new Transito();
        
        wcodreg = 0;
        wcodvei = 5;
        
        for(i=0; i < wt.length; i++) 
        {
            if (wcodvei==5)
            {
                wcodvei = 1;
                wcodreg++;
            }
            
            wt[i].codreg = wcodreg;
            wt[i].codvei = wcodvei;
            
            if (random == true)
            {
                wt[i].qtdacd = (int)(Math.random()*10);
                wt[i].qtdvei = (int)(Math.random()*100);
            }
            else
            {
                wt[i].qtdacd = Integer.parseInt(JOptionPane.showInputDialog("REGIÃO: " + Regiao(wcodreg) + "\nTIPO DE VEÍCULO: " + TipoVeiculo(wcodvei) + "\n\nDigite a quantidade de acidentes:"));
                wt[i].qtdvei = Integer.parseInt(JOptionPane.showInputDialog("REGIÃO: " + Regiao(wcodreg) + "\nTIPO DE VEÍCULO: " + TipoVeiculo(wcodvei) + "\n\nDigite a quantidade de veículos:"));   
            }
            
            wcodvei++;
            
        }

        return wt;
    }

    public void MostraEstatisticas(Transito wt[]) 
    {
        
        MostraTodos(wt);
        
        MostraAcidentesPorVeiculo(wt);
        
        MostraMediaAcidentes(wt);
        
        MostraTodos(wt);

    }
    
    public void MostraTodos(Transito wt[]) 
    {
        String mostra="REGIÃO    TIPO DE VEICULO    QTD.ACIDENTES    QTD.VEICULOS";
        
        for (int i=0; i<wt.length; i++) 
        { 
            mostra += ("\n"+ Regiao(wt[i].codreg) + "    " + TipoVeiculo(wt[i].codvei) + "    " + wt[i].qtdacd + "    " + wt[i].qtdvei);
        }
        JOptionPane.showMessageDialog(null,mostra);
    }
    
    public void MostraAcidentesPorVeiculo(Transito wt[]) 
    {
        
        wt = Ordena_qtdacd(wt);
        
        String mostra="REGIÃO    TIPO DE VEICULO    QTD.ACIDENTES    QTD.VEICULOS";
        
        for (int i=1; i <= 4; i++) 
        {
            boolean ok = false;
            for (int j=0; j < wt.length; j++) 
            {   
                if (wt[j].codvei == i && ok == false)
                {
                    mostra += ("\n"+ Regiao(wt[j].codreg) + "    " + TipoVeiculo(wt[j].codvei) + "    " + wt[j].qtdacd + "    " + wt[j].qtdvei);
                    ok = true;
                }
            }
        }
        JOptionPane.showMessageDialog(null,mostra);
    }
    
    public void MostraMediaAcidentes(Transito wt[]) 
    {
        
        int wSoma, wQtd, wSomaGeral = 0;
        double wMedia = 0;
        String mostra="REGIÃO    MÉDIA";
        
        for (int i=1; i <= 5; i++) 
        {
            wQtd = 0;
            wSoma = 0;
            for (int j=0; j < wt.length; j++) 
            {   
                if (wt[j].codreg == i)
                {
                    wSoma += wt[j].qtdacd;
                    wQtd++;
                }
            }
            mostra += ("\n"+ Regiao(i) + "    " + (wSoma/wQtd));
            wSomaGeral += wSoma;
        }
        mostra += ("\nMÉDIA     " + (wSomaGeral/wt.length));
        JOptionPane.showMessageDialog(null,mostra);
    }
    
    public Transito[] Ordena_qtdacd(Transito wt[]) 
    {
        
        Transito[] wtaux = new Transito[wt.length];
        
        int i, j;
        
        for(i=0; i < wt.length - 1; i++) 
        {
        
            for(j=i; j<wt.length; j++) 
            {
            
                if(wt[i].qtdacd < wt[j].qtdacd) 
                {
                    wtaux[i] = wt[i];
                    wt[i] = wt[j];
                    wt[j] = wtaux[i];
                }
            }
        }
        return wt;
    }
    
    public String Regiao(int wcodreg) 
    {
        
        String nomreg[] = {"LESTE","OESTE","SUL","NORTE","CENTRO"};
        
        return nomreg[wcodreg - 1];
        
    }
    
    public String TipoVeiculo(int wcodvei) 
    {
        
        String nomvei[] = {"VEÍCULO PASSEIO","TRANSPORTE COLETIVO","TRANSPORTE PÚBLICO","MOTO"};
        
        return nomvei[wcodvei - 1];
        
    }
}
