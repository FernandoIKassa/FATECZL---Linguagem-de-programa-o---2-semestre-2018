
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

    void mostraMediaRegiao(Transito[] transito) {

        int[] acidente = new int[5];
        int[] media = new int[5];

        System.out.println("                Média de acidentes de todas as regiões");

        for (int i = 0; i < acidente.length; i++) {
            System.out.print(regiao(i) + "             ");
        }

        System.out.println("\n");

        for (int i = 0; i < transito.length; i++) {
            for (int j = 0; j < acidente.length; j++) {
                if (regiao(transito[i].codigoRegiao) == regiao(j)) {
                    acidente[j] += transito[i].nro_acidentes;
                }
            }
        }

        for (int i = 0; i < acidente.length; i++) {
            media[i] = acidente[i] / 4;
            System.out.print("  " + media[i] + "              ");
        }

        System.out.println("\n\n");

        int mediaDeTodasRegioes = 0;
        for (int i = 0; i < media.length; i++) {
            mediaDeTodasRegioes += media[i];
        }
        mediaDeTodasRegioes /= media.length;
        System.out.println("Média de todas as regiões: " + mediaDeTodasRegioes);

        //Bubble sort das médias
        /*for (int i = 0; i < media.length; i++) {
            int aux = 0;
            for (int j = 0; j < media.length - 1; j++) {
                if (media[j] > media[j + 1]) {
                    aux = media[j];
                    media[j] = media[j + 1];
                    media[j + 1] = aux;
                }
            }
        }*/
        //Carrega Mostra quem esta abaixo/acima da média ou igual a ela
        int[] abaixoMedia = new int[media.length];
        int[] igualMedia = new int[media.length];
        int[] acimaMedia = new int[media.length];

        for (int i = 0; i < media.length; i++) {

            int ctaAbaixo = 0;
            int ctaIgual = 0;
            int ctaAcima = 0;

            if (media[i] < mediaDeTodasRegioes) {
                abaixoMedia[ctaAbaixo] = media[i];
                ctaAbaixo++;
            } else if (media[i] == mediaDeTodasRegioes) {
                igualMedia[ctaIgual] = media[i];
                ctaIgual++;
            } else if (media[i] > mediaDeTodasRegioes) {
                acimaMedia[ctaAcima] = media[i];
                ctaAcima++;
            }
        }

        System.out.println("Valores abaixo da média: ");
        for (int i = 0; i < abaixoMedia.length; i++) {
            
            System.out.print(abaixoMedia[i] + " ");
        }
        
        System.out.println("\n");
        
        System.out.println("Valores igual à média: ");
        for (int i = 0; i < igualMedia.length; i++) {
            
            System.out.print(igualMedia[i] + " ");
        }
        
        System.out.println("\n");
        
        System.out.println("Valores acima da média: ");
        for (int i = 0; i < acimaMedia.length; i++) {
            
            System.out.print(acimaMedia[i] + " ");
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
