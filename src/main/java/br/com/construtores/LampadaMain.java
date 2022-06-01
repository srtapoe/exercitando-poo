package br.com.construtores;

public class LampadaMain {
    public static void main(String[] args) {


        Lampada lampada1 = new Lampada(true);
        lampada1.setMarca("Philps");

        System.out.println(lampada1);

        Lampada lampada2 = new Lampada();
        System.out.println(lampada2);
    }
}
