package br.com.formula1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Piloto {

    private String nome;
    private int idade;
    private String nacionalidade;

    public Piloto(){}

    @Override
    public String toString() {
        return "Piloto{" +
                "\nNome:'" + nome + '\'' +
                ", \nIdade: '" + idade + '\'' +
                ", \nNacionalidade: '" + nacionalidade + '\'' +
                '}';
    }
}
