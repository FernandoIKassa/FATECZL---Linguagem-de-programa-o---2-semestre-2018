
import java.io.*;
import javax.swing.JOptionPane;

public class ClasseMetodos {

    public Aluno[] CarregaAluno(Aluno[] aluno) throws IOException {
        for (int i = 0; i < 3; i++) {
            aluno[i] = new Aluno();
        }

        String fileName = "ArquivoNotas.txt";

        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        
        for (int i = 0; i < 3; i++) {
            aluno[i].primeiroNome = JOptionPane.showInputDialog("Digite o primeiro nome do aluno:");
            gravar.write(aluno[i].primeiroNome);
            gravar.newLine();
            aluno[i].ultimoNome = JOptionPane.showInputDialog("Digite o último nome do aluno:");
            gravar.write(aluno[i].ultimoNome);
            gravar.newLine();
            aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Digite o último nome do aluno:"));
            gravar.write(aluno[i].pontos);
            gravar.newLine();
        }
        
        gravar.close();
        System.exit(0);
        
        return aluno;
    }
    
    public void MostraAluno (Aluno[] aluno) throws IOException{
        int i, ptos;
        
        String fileName = "ArquivoNotas.txt";
        
        BufferedReader ler = new BufferedReader (new FileReader(fileName));
        
        for (i = 0; i < 3; i++) {
            aluno[i] = new Aluno();
        }

        for (i = 0; i < 3; i++) {
            aluno[i].primeiroNome = ler.readLine();
            aluno[i].ultimoNome = ler.readLine();
            aluno[i].pontos = Integer.parseInt(ler.readLine());
        }

        for (i = 0; i < 3; i++) {
            System.out.println(aluno[i].primeiroNome + " " + aluno[i].ultimoNome + " pontos: " + aluno[i].pontos);
        }
        ler.close();
        System.exit(0);
    }
    
}
