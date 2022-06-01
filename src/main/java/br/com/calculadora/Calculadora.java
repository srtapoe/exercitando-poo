package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws IllegalStateException {
        Scanner menu = new Scanner(System.in);


        while (true) {

            System.out.print("##----MENU DE OPERAÇÕE-----##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Soma | +          |\n");
            System.out.print("| Opção 2 - Subtração | -     |\n");
            System.out.print("| Opção 3 - Multiplicação | * |\n");
            System.out.print("| Opção 4 - Divisão | /       |\n");
            System.out.print("| Opção 0 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao;
            opcao = Integer.parseInt(menu.nextLine());

            if (opcao == 0) {
                System.out.println("Até logo!");
                break;
            }


            switch (opcao) {
                case 1, 2, 3, 4 -> calcularOperacao(opcao);
                default -> System.out.print("\nOpção Inválida!");
            }
        }

    }


    public static void calcularOperacao(int opcao){
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numero1 = dados.nextInt();
        System.out.println("Digite o segundo número: ");
        int numero2 = dados.nextInt();

        int operacao;
        switch (opcao) {
            case 1 -> {
                operacao = numero1 + numero2;
                System.out.println("Soma entre " + numero1 + " + " + numero2 + " = " + operacao);
            }
            case 2 -> {
                operacao = numero1 - numero2;
                System.out.println("Subtração entre " + numero1 + " - " + numero2 + " = " + operacao);
            }
            case 3 -> {
                operacao = numero1 * numero2;
                System.out.println("Multiplicação entre " + numero1 + " * " + numero2 + " = " + operacao);
            }
            case 4 -> {
                operacao = numero1 / numero2;
                System.out.println("Divisão entre " + numero1 + " / " + numero2 + " = " + operacao);
            }
            default -> System.out.println("Operação inválida!");
        }

    }
}
