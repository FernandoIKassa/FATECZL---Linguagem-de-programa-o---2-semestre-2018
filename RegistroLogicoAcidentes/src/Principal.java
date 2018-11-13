/*
    Data:       11/10/2018
    Objetivo:
                    1) Cadastrar 20 registros sendo direcionada a 5 regiões (LESTE, OESTE, SUL, NORTE, CENTRO)
                    2) Para cada região haverá 4 registros que terão informações de acidentes por:

                        tipo de veículo     descritivo
                        1                   veículo de passeio
                        2                   transporte coletivo
                        3                   transporte público
                        4                   moto

                    3) Gerar indicadores com:
                        
                        - Descrição a região, código, número de acidentes
                        - Média de acidentes de todas as regiões
                        - Relações nas quais a quantidade de acidentes sejam menores e maiores que a média

 */
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Metodos m = new Metodos();
        Transito[] transito = new Transito[20];

        for (int i = 0; i < transito.length; i++) {
            transito[i] = new Transito();
        }

        int opc;
        opc = 0;
        
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1 - Cadastra acidentes \n"
                    + "2 - Mostra .estatísticas \n"
                    + "9 - FIM"));
            switch (opc) {
                case 1:
                    transito = m.cadastraRegiaoAcidente(transito);
                    break;

                case 2:
                    m.mostraEstatisticas(transito);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO!");
                    break;
            }
        }
    }
}
