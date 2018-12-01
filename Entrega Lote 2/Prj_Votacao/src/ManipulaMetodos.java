
import javax.swing.JOptionPane;
import java.io.*;

/*
 Desenvolvimento dos métodos
 */
public class ManipulaMetodos {
    int numeroDeSecoes = 10;
    
    
    Votacao2018[] cadastraVotacao(Votacao2018[] votacao) {
        for (int i = 0; i < votacao.length; i++) {
            votacao[i].NumeroCandidato = (int) (Math.random() * 300);
            votacao[i].NumeroSecao = (int) (Math.random() * numeroDeSecoes);
        }

        return votacao;
    }

    void mostra(Votacao2018[] votacao) {
        for (int i = 0; i < votacao.length; i++) {
            System.out.println("Seção : " + votacao[i].NumeroSecao + ""
                    + "\nCandidato:" + votacao[i].NumeroCandidato);
        }
    }

    void classficaSecao(Votacao2018[] votacao) {
        mostra(votacao);
        int auxSecao = 0;
        int auxCandidato = 0;
        for (int i = 0; i < votacao.length - 1; i++) {
            for (int j = 0; j < votacao.length - i - 1; j++) {
                if (votacao[j].NumeroSecao > votacao[j + 1].NumeroSecao) {
                    //muda seção
                    auxSecao = votacao[j].NumeroSecao;
                    votacao[j].NumeroSecao = votacao[j + 1].NumeroSecao;
                    votacao[j + 1].NumeroSecao = auxSecao;
                    //já que mudou a seção, o numeroCandidatos acompanha obrigatoriamente
                    auxCandidato = votacao[j].NumeroCandidato;
                    votacao[j].NumeroCandidato = votacao[j + 1].NumeroCandidato;
                    votacao[j + 1].NumeroCandidato = auxCandidato;
                }
            }
        }

        System.out.println("\n\n");

        mostra(votacao);

        JOptionPane.showMessageDialog(null, "*** Dados classificados ***");
        System.out.println("***************************************");
    }

    void gravaRegistro(Votacao2018[] votacao) throws IOException {
        String fileName = "Votação2018.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (int i = 0; i < votacao.length; i++) {
            //writer.write("Seção: ");
            writer.write(Integer.toString(votacao[i].NumeroSecao));
            writer.newLine();
            //writer.write("Numero Candidato: ");
            writer.write(Integer.toString(votacao[i].NumeroCandidato));
            writer.newLine();
        }

        JOptionPane.showMessageDialog(null, "*** Arquivo gerado! ***");

        writer.close();
        //System.exit(0);
    } 
        
 
    
    

}

//1 – Quantidade Eleitores por Seção	                         |
//|  2 – Seção com Maior e Menor número de Eleitores  |
//|  3 – Quantidade de votos por candidato                       |
//|  4 – 10 primeiros colocadas (nro  cand. e qtd votos )  |
//|  9 – Finaliza consulta	   
