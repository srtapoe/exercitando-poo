package br.com.formula1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Escuderia {

    private String nomeEscuderia;
    private String nacionalidade;

    public Escuderia(){}

    @Override
    public String toString() {
        return "Escuderia" +
                "\nNome:'" + nomeEscuderia + '\'' +
                ",\nNacionalidade:'" + nacionalidade + "\n";
    }
}
