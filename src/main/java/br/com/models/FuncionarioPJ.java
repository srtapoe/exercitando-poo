package br.com.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FuncionarioPJ {

    private String nome;
    private String documento;
    private double horasTrabalhadas;
    private double valorHora;
    private double valorRumenaracao;
    private String rua;
    private String bairro;
    private String complemento;


    public void calculaRemuneracao(){
        this.valorRumenaracao = this.horasTrabalhadas * this.valorHora;
    }
}
