package br.com.algoritmos;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        int [] numbers = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,38,40,42};

        boolean itsFound = false;
        System.out.println("Digite o número a ser averiguado: ");
        int numerSearch = dados.nextInt();


        int i;
        for ( i = 0; i<numbers.length;i++){
            if(numbers[i] == numerSearch){
                System.out.println("The number " + numerSearch + " is position n° " + i);
                itsFound = true;
                break;
            }
                if(itsFound){
                    System.out.println("Não encontrado!");
                }
        }
    }
}
