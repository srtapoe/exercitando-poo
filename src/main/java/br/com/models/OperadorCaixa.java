package br.com.models;

public class OperadorCaixa extends FuncionarioCLT {

    public OperadorCaixa(){}


    @Override
    public String toString() {
        return "\nNome: " + super.getNome() +
                "\nEndereço: " + "Rua: " + getRua() + "Bairro: " + getBairro() + " Complemento: " + getComplemento() +
                "\nSalário: " + getValorSalario();
    }
}
