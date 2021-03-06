/* 01/11/2018
Exercício:

Criar uma classe abstrata segundo:
............................................................................	
.	              	Votação               	         	.
.............................................................................
.    NumerioSeção        :      NumeroCandidato      . 
............................................................................
.             int	           :                 int                      .
............................................................................


Criar classe Votação2016, conforme:

1)	Cadastrar 100 registros com votos de eleitores a partir do método  
    NúmeroCandidato ( 0 a 300)  (1) 
    NúmeroSeção         (0 a 10)     (1)
(1)	Utiizar método RANDOM()
             FCADRASTRAVOTAÇÃO(função);

2)	Classificar os registros em memória por NumeroSeção  e exibir mensagem 
  “dados classificados”      
             FCLASSIFICASEÇÃO(função);

3)	Gravar dados da votação em arquivo Votação2016.txt e exibir mensagem  “arquivo gerado”      
             FGRAVAVOTAÇÃO(função);

4)	Chamada de Menu  para Mostrar Indicadores;

4.1) Quantidade de eleitores por Seção (procedimento);
4.2) Número da Seção com maior e menor números de eleitores (procedimento);
4.3) Quantidade de votos por candidato (procedimento);
4.4) Exibir os 10 candidatos mais votados e suas quantidades (procedimento);

----------------------------------------------------------------
|	SISTEMA DE VOTAÇÃO			|
|      1 – Carregar Seção/Número Eleitor  	|
|      2 – Classificar por Seção      		|
|      3 – Gravar Registros                                	|
|      4 – Mostrar Indicadores                                   |
|      9 – Finalizar                                           	|
----------------------------------------------------------------

-----------------------------------------------------------------------
|	    Mostrar Indicadores			           |
|        Estatísticas de Votação em 2016		           |
|  1 – Quantidade Eleitores por Seção	                         |
|  2 –Seção com Maior e Menor número de Eleitores  |
|  3 – Quantidade de votos por candidato                       |
|  4 – 10 primeiros colocadas (nro  cand. e qtd votos )  |
|  9 – Finaliza consulta	                		            |
------------------------------------------------------------------------
 */

 /*
Carrega
Classifica
Gravar
Mostrar
 */
import java.io.IOException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) throws IOException {

        ManipulaMetodos manMet = new ManipulaMetodos();
        IndicadoresMetodos indMet = new IndicadoresMetodos();
        Votacao2018[] votacao = new Votacao2018[100];

        for (int i = 0; i < votacao.length; i++) {
            votacao[i] = new Votacao2018();
        }

        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Seção/Número do Eleitor "
                    + "\n 2 - Classificar por Seção"
                    + "\n 3 - Gravar registros"
                    + "\n 4 - Mostra Indicadores"
                    + "\n 9 - Finalizar"));
            switch (opc) {
                case 1:
                    votacao = manMet.cadastraVotacao(votacao);
                    break;
                case 2:
                    manMet.classficaSecao(votacao);
                    break;

                case 3:
                    manMet.gravaRegistro(votacao);
                    break;

                case 4:
                    indMet.mostraIndicador(votacao);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Finalizado");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "*** CÓDIGO INVÁLIDO! ***");
                    break;
            }
        }
    }
}
