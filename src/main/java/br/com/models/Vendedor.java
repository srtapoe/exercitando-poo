package br.com.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vendedor extends FuncionarioCLT implements Bonificacao {

    private double valorBonificacao;
    public Vendedor(){}

    @Override
    public void calcularBonificacao(double porcentagem) {
        this.valorBonificacao = super.getValorSalario() * (porcentagem/100);
    }

    @Override
    public String toString() {
        return "Vendedor{ \n" +
                "\nNome do Vendedor: " + getNome() +
                "\nEndereço: " + "Rua: " +  getRua() + " Bairro: " +  getBairro() +
                "\nComplemento: " +  getComplemento() + "\n" +
                "\nSalário: " + getValorSalario() +
                "\nBonificação:  " + getValorBonificacao() +
                '}';
    }


}
