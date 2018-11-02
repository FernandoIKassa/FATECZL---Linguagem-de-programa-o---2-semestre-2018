
class Transito {

    int codigoRegiao;
    int tipo_veiculo;
    int nro_acidentes;
    int qtd_veiculos;

    //construtores
    Transito() {
        this(0, 0, 0, 0);
    }

    Transito(int codRegiao,
            int tipoVeiculo,
            int acidentes,
            int quantidades) {

        codigoRegiao = codRegiao;
        tipo_veiculo = tipoVeiculo;
        nro_acidentes = acidentes;
        qtd_veiculos = quantidades;
    }
}
