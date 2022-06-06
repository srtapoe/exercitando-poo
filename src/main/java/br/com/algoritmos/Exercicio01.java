package br.com.algoritmos;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int number;

        for (int i = 1; i<=12;i++){
            System.out.println("Digite o n° " + i + " : ");
            number = dados.nextInt();
            numbers.add(number);
        }

        System.out.println("Digite a primeira posição a usar na soma: ");
        int posOne = dados.nextInt();
        System.out.println("Digite a segunda posição a usar na soma: ");
        int posTwo = dados.nextInt();

        int sum = numbers.get(posOne) + numbers.get(posTwo);

        System.out.println("A soma da pos[" + posOne + "]" + " + " + "pos[" + posTwo + "] = " + sum);

    }
}
