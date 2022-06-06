package br.com.algoritmos;

public class Exercicio06 {
    public static void main(String[] args) {
        int [] numbers = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10, 1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] < 0){
                numbers[i] = 0;
            }
        }

        for (int nums:numbers) {
            System.out.println(nums);
        }

    }
}
