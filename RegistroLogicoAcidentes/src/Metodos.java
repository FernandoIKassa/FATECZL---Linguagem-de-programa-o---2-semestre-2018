
import javax.swing.JOptionPane;

public class Metodos {

    Transito[] cadastraRegiaoAcidente(Transito[] transito) {
        int codRegiao, codVeiculo, limiteRegiao, limiteVeiculo;
        codRegiao = 0;
        codVeiculo = 0;
        limiteRegiao = 0;
        limiteVeiculo = 0;

        for (int i = 0; i < transito.length; i++) {

            if (limiteRegiao < 4) {
                transito[i].codigoRegiao = codRegiao;
                limiteRegiao++;
            } else {
                codRegiao++;
                transito[i].codigoRegiao = codRegiao;
                limiteRegiao = 1;
            }

            if (limiteVeiculo < 4) {
                transito[i].tipo_veiculo = codVeiculo;
                codVeiculo++;
                limiteVeiculo++;
            } else {
                codVeiculo = 0;
                transito[i].tipo_veiculo = codVeiculo;
                codVeiculo++;
                limiteVeiculo = 1;
            }

            transito[i].nro_acidentes = (int) (Math.random() * 100);
            transito[i].qtd_veiculos = (int) (Math.random() * 1000);

        }
        return transito;
    }

    void mostraEstatisticas(Transito[] transito) {
        mostraDadosTotais(transito);
        System.out.println("\n");
        mostraMediaRegiao(transito);
    }

    void mostraDadosTotais(Transito[] transito) {
        System.out.println("Região          " + "Número de acidentes        " + "Quantidade de veículos         " + "Tipo do veículo        ");
        for (int i = 0; i < transito.length; i++) {
            System.out.println(regiao(transito[i].codigoRegiao)
                    + "                 " + transito[i].nro_acidentes
                    + "                             " + transito[i].qtd_veiculos
                    + "                 " + tipoVeiculo(transito[i].tipo_veiculo));

        }

    }

    
    // SEPARAR O CALCULAR DA MÉDIA DO MOSTRAR MÉDIA OU NÃO???????????
    
    void mostraMediaRegiao(Transito[] transito) {

        int[] acidente = new int[4];
        int[] media = new int[4];

        System.out.println("                Média de acidentes por tipo de veículo em relação a todas as regiões");

        for (int i = 0; i < 4; i++) {
            System.out.print(tipoVeiculo(i) + "             ");
        }

        System.out.println("\n");

        for (int i = 0; i < transito.length; i++) {

            for (int j = 0; j < 4; j++) {
                if (transito[i].tipo_veiculo == j) {
                    acidente[j] += transito[i].nro_acidentes;
                }
            }

        }

        for (int i = 0; i < acidente.length; i++) {
            media[i] = acidente[i] / 5;
            System.out.print("      " + media[i] + "                       ");
        }

    }

    public String tipoVeiculo(int codVeiculo) {

        String veiculo[] = {"Veículo de passeio", "Transporte coletivo", "Transporte Público", "Moto"};
        return veiculo[codVeiculo];

    }

    public String regiao(int codReg) {

        String reg[] = {"Leste", "Oeste", "Sul  ", "Norte", "Centro"};
        return reg[codReg];

    }

}
