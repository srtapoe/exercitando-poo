package br.com.lanchonete.enums;

public enum TipoMolhoPizza {
    TOMATE(1), GORGONZOLA(2), PARISIENSE(3),PICANTE(4), STROGONOFF(5);

    public final int valorEscolha;
    TipoMolhoPizza(int escolha) {
        valorEscolha = escolha;
    }
}
