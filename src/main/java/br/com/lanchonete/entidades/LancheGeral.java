package br.com.lanchonete.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LancheGeral {

    private String nomeItem;
    private double precoVenda;
    private String dataValidade;
    private double peso;

    @Override
    public String toString() {
        return "LancheGeral{" +
                "\nNome do Item: " + nomeItem +
                "\nPreço: " + precoVenda +
                "\nData de Validade: '" + dataValidade + '\'' +
                "\nPeso: " + peso +
                '}';
    }
}
