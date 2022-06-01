package br.com.construtores;

public class DataMain {
    public static void main(String[] args) {

        Data data1 = new Data("01/01/2021");
        System.out.println(data1.valiteData(data1.getData()));

        System.out.println(data1);
    }
}
