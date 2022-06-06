package br.com.algoritmos;

import java.util.ArrayList;

public class Exercicio05 {
    public static void main(String[] args) {
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();


        for(int i = 1; i<=80; i++){
            if(i % 2 == 0){
                pares.add(i);
            }else{
                impares.add(i);
            }
        }

        System.out.println("Quantidade de pares: " + pares.size());
        System.out.println("Quantidade de ímpares: " + impares.size());
    }
}
