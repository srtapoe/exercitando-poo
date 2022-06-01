package br.com.construtores;

public class ContadorMain {
    public static void main(String[] args) {

        Contador contador1 = new Contador(50);
        contador1.contar(contador1.getCont());

        Contador contador2 = new Contador();
        contador2.contar(contador2.getCont());
    }
}
