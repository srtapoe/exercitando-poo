package br.com.formula1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarroF1 {

    private Escuderia escuderia;
    private int numeroCarro;
    private TipoDePneus tipoDePneus;
    private Piloto piloto;

    public CarroF1(){}

    @Override
    public String toString() {
        return "CarroF1 \n{" +
                escuderia +
                ", Número do Carro: " + numeroCarro +
                ", Tipo de Pneus: " + tipoDePneus + "\n" +
                 piloto +
                '}';
    }
}
