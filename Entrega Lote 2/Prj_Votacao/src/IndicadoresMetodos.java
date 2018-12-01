
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.*
import javax.swing.JOptionPane;

/*
    Quantidade de eleitores por seção
    Seção com maior e menor número de eleitores
    Quantidade de votos por candidato
    10 primeiros colocados
 */
public class IndicadoresMetodos {

    ManipulaMetodos manMet = new ManipulaMetodos();

    void mostraIndicador(Votacao2018[] votacao) throws IOException {
        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Quantidade Eleitores por seção"
                    + "\n2 - Seção com Maior e Menor número de Eleitores"
                    + "\n3 - Quantidade de votos por candidato"
                    + "\n4 - 10 primeiros colocados (nro cand. e qtd votos"
                    + "\n9 - Finaliza consulta"));

            switch (opc) {
                case 1:
                    mostraEleitorSecao(votacao);
                    break;

                case 2:
                    mostraSecaoMaiorMenorCandidatos(votacao);
                    break;

                case 3:
                    quantidadeVotoPorCandidato(votacao);
                    break;

                case 4:
                    maisVotados(votacao);
                    break;
                case 9:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "CÓDIGO INVÁLIDO!");
                    break;
            }
        }
    }

    int[] apuraSecao(Votacao2018[] votacao) throws IOException {
        String fileName = "Votação2018.txt";

        BufferedReader read = new BufferedReader(new FileReader(fileName));

        int secao = 0;
        int[] quantSecao = new int[10];
        int aux = 0;
        int contador = 0;

        for (int i = 0; i < votacao.length; i++) {
            votacao[i].NumeroSecao = Integer.parseInt(read.readLine());
            votacao[i].NumeroCandidato = Integer.parseInt(read.readLine());
            if (votacao[i].NumeroSecao == secao) {
                contador++;
            } else {
                quantSecao[aux] = contador;

                contador = 1;
                aux++;
                secao++;
            }
            if (secao == 9) {
                quantSecao[aux] = contador;
            }

        }
        read.close();
        return quantSecao;
    }

    void mostraEleitorSecao(Votacao2018[] votacao) throws IOException {
        int[] quantSecao = new int[10];
        quantSecao = apuraSecao(votacao);

        for (int i = 0; i < quantSecao.length; i++) {
            System.out.println("Seção: " + i + ""
                    + "\nQuantidade de Canditados: " + quantSecao[i]);
        }
        System.out.println("\n");

    }

    void mostraSecaoMaiorMenorCandidatos(Votacao2018[] votacao) throws IOException {
        int[] quantPorSecaoAtualizar = new int[10];
        int[] quantEstatica = new int[10];

        quantEstatica = apuraSecao(votacao);

        quantPorSecaoAtualizar = apuraSecao(votacao);
        int aux = 0;
        for (int i = 0; i < quantPorSecaoAtualizar.length - 1; i++) {
            for (int j = 0; j < quantPorSecaoAtualizar.length - i - 1; j++) {
                if (quantPorSecaoAtualizar[j] > quantPorSecaoAtualizar[j + 1]) {
                    aux = quantPorSecaoAtualizar[j];
                    quantPorSecaoAtualizar[j] = quantPorSecaoAtualizar[j + 1];
                    quantPorSecaoAtualizar[j + 1] = aux;
                }
            }
        }

        int secaoMenosCand = 0;
        int secaoMaisCand = 0;
        for (int i = 0; i < quantPorSecaoAtualizar.length; i++) {
            if (quantPorSecaoAtualizar[0] == quantEstatica[i]) {
                secaoMenosCand = i;

            }
            if (quantPorSecaoAtualizar[9] == quantEstatica[i]) {
                secaoMaisCand = i;
            }
        }

        System.out.println("Seção com o menor número de eleitores: " + secaoMenosCand + ""
                + "\nSeção com o maior número de eleitores: " + secaoMaisCand + "\n\n");

        System.out.println("*******************************");

    }

    void quantidadeVotoPorCandidato(Votacao2018[] votacao) {
        int[] candidato = new int[300];
        int[] voto = new int[300];
        int numeroCandidato = 0;
        for (int i = 0; i < votacao.length; i++) {
            numeroCandidato = votacao[i].NumeroCandidato - 1;
            candidato[numeroCandidato] = voto[numeroCandidato]++;
        }

        for (int i = 0; i < candidato.length; i++) {
            if (voto[i] != 0) {
                System.out.println("Candidato " + (i + 1) + ""
                        + "\nVotos: " + voto[i]);
            }

        }
        System.out.println("*******************************");
    }

    void maisVotados(Votacao2018[] votacao) {
        int[] candidato = new int[300];
        int[] voto = new int[300];
        int numeroCandidato = 0;
        for (int i = 0; i < votacao.length; i++) {
            numeroCandidato = votacao[i].NumeroCandidato - 1;
            candidato[numeroCandidato] = voto[numeroCandidato]++;
        }

        int auxCandidato = 0;
        int auxVoto = 0;
        for (int i = 0; i < candidato.length - 1; i++) {
            for (int j = 0; j < candidato.length - i - 1; j++) {
                if (voto[i] != 0) {
                    if (voto[j + 1] > voto[j]) {
                        auxCandidato = candidato[j + 1];
                        auxVoto = voto[j + 1];
                        candidato[j + 1] = candidato[j];
                        voto[j + 1] = voto[j];
                        candidato[j] = auxCandidato;
                        voto[j] = auxVoto;

                    }
                }

            }
        }

        for (int i = 0; i < candidato.length; i++) {
            if (voto[i] != 0) {
                System.out.println("Candidato " + (i + 1) + ""
                        + "\nVotos: " + voto[i]);
            }

        }
        System.out.println("*******************************");
    }
}
