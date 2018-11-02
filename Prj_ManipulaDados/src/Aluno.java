
class Aluno {

    String primeiroNome;
    String ultimoNome;
    int pontos;

    // construtor	 
    Aluno() {
        this("", "", 0);
    }

    Aluno(String pnomealuno,
            String unomealuno,
            int pontosaluno) {
        primeiroNome = pnomealuno;
        ultimoNome = unomealuno;
        pontos = pontosaluno;
    }
}
