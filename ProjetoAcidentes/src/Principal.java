/*
Objetivo:   Menu principal do sistema de controle de acidentes
Programador:Mario Kizuke Suzuki
Data:       11/10/2018
 */

import javax.swing.JOptionPane;

public class Principal 
{    
    public static void main (String args[]) 
    {    
        Transito[] t = new Transito[20];
        int opc, i;
        
        for (i = 0 ; i < t.length ; i++) 
            t[i] = new Transito();
        
        Metodos M = new Metodos();
        
        do 
        {    
            opc = Integer.parseInt(JOptionPane.showInputDialog(" - Menu Principal - \n1 - Carregar acidentes\n2 - Mostrar estatísticas \n9 - Finalizar"));
            
            switch (opc)
            {
                case 1: t = M.CarregaAcidentes(t.length, true);
                             break;
                case 2: M.MostraEstatisticas(t);
                             break;
                case 9: JOptionPane.showMessageDialog(null,"Finalizado.");
                             break;
                default: JOptionPane.showMessageDialog(null,"Opção inválida");
            }
        }
      
        while(opc != 9);
    
    }
    
}
