package br.com.algoritmos;

import java.util.ArrayList;

public class Exercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 1; i<=20;i++){
            if(i % 2 != 0){
                numbers.add(i);
            }
        }

        for (Integer nums: numbers) {
            System.out.println(nums);
        }

    }
}
