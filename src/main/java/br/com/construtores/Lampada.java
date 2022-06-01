package br.com.construtores;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lampada {

    private boolean ligada;
    private String marca;
    private int watts;

    public Lampada(boolean ligada) {
        this.ligada = ligada;
    }

    public Lampada() {
        watts = 60;
    }


    @Override
    public String toString() {
        return "Lampada{" +
                "ligada=" + ligada +
                ", marca='" + marca + '\'' +
                ", watts=" + watts +
                '}';
    }
}
