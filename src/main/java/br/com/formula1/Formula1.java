package br.com.formula1;

public class Formula1 {
    public static void main(String[] args) {


        Piloto piloto1 = new Piloto();
        piloto1.setNome("Charles Leclerc");
        piloto1.setIdade(24);
        piloto1.setNacionalidade("Mônaco");

        Escuderia escuderia = new Escuderia();
        escuderia.setNomeEscuderia("Ferrari");
        escuderia.setNacionalidade("Italiana");

        CarroF1 carroF1 = new CarroF1();
        carroF1.setNumeroCarro(10);
        carroF1.setEscuderia(escuderia);
        carroF1.setPiloto(piloto1);
        carroF1.setTipoDePneus(TipoDePneus.MEDIUM);


        System.out.println(carroF1);
    }
}
