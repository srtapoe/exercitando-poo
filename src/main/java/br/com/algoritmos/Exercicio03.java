package br.com.algoritmos;

public class Exercicio03 {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int comeco, end;

        int i;
        
        for(i = 0; i<=8; i++){
            comeco = numbers[i];
            end = numbers[15 - i];
            numbers[i] = end;
            numbers[15 -i] = comeco;
        }

        for (int nums:numbers) {
            System.out.println(nums);
        }

    }
}
