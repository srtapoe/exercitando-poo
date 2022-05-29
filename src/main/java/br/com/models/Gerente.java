package br.com.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gerente extends FuncionarioPJ implements Bonificacao {

    private Double valorBonificacao;

    public Gerente(){}

    @Override
    public void calcularBonificacao(double porcentagem) {
        this.valorBonificacao = (super.getValorRumenaracao()) * (porcentagem /100) + 100;
    }

    @Override
    public String toString() {
        return "Gerente{ \n"  +
                "Nome do Gerente: " + super.getNome() + "\nEndereço: " + super.getBairro() + "\nHoras trabalhadas: " + super.getHorasTrabalhadas() +
                "\nValor Hora trabalhada: " + super.getValorHora() + "\nValor Remuneração: " + super.getValorRumenaracao() +
                "\nValor da Bonificação: " + valorBonificacao +
                '}';
    }
}
