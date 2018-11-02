
import java.io.*;
import javax.swing.*;

public class ClassePrincipal {

    public static void main(String args[]) throws IOException {
        Aluno[] aluno = new Aluno[3];
        ClasseMetodos metodo = new ClasseMetodos();
        
        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar alunos\n2 - Mostra alunos \n9 - Finalizar"));

            switch (opc) {
                case 1:
                    aluno = metodo.CarregaAluno(aluno);
                    break;
                case 2:
                    metodo.MostraAluno(aluno);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "finaliza");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opc inválida");
                    break;
            }
        } while (opc != 9);

    }
}