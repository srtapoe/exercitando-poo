package br.com.lanchonete.entidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LancheGeral {

    private double precoVenda;
    private String dataValidade;
    private double peso;
}
