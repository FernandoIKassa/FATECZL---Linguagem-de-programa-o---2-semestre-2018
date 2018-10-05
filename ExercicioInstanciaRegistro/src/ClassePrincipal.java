
import javax.swing.JOptionPane;

public class ClassePrincipal {
    public static void main(String[] args) {
        Notas [] notas = new Notas[3];
        
        for (int i = 0; i < 3; i++) {
            notas[i] = new Notas();
        }
        
        for (int i = 0; i < 3; i++) {
            notas[i].nome = JOptionPane.showInputDialog("Digite o nome do aluno " + (i+1));
            notas[i].nt1 =  Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 do aluno:"));
            notas[i].nt2 =  Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 do aluno:"));
            notas[i].nt3 =  Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3 do aluno:"));
            notas[i].media = (notas[i].nt1 + notas[i].nt2 +notas[i].nt3)/3;
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(notas[i].nome + ", " + notas[i].nt1 + ", " + notas[i].nt2 + ", " +  + notas[i].nt3 + ", " + notas[i].media + ", " +  ((notas[i].media >= 6) ? "APROVADO" : "REPROVADO"));
            
        }
    }
    //(expressão booleana) ? código 1 : código 2; para exibição da situação
}
