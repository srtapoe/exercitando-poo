package br.com.desafiostecnicos.menu;

import java.util.Scanner;

public class Opcoes {
    public static void main(String[] args) throws IllegalStateException{

        Scanner menu = new Scanner(System.in);


        while (true) {

            System.out.print("##------MENU DE OPÇÕES------##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Saber sua idade   |\n");
            System.out.print("| Opção 2 - IMC               |\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = menu.nextInt();

            if (opcao == 3) {
                System.out.print("Até logo!");
                menu.close();
            }


            switch (opcao) {
                case 1 -> calcularIdade();
                case 2 -> calcularIMC();
                default -> System.out.print("\nOpção Inválida!");
            }
        }

    }


    public static void calcularIdade(){
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = dados.nextInt();
        System.out.println("Já fez aniversário neste ano? ");
        System.out.println("[1] - SIM");
        System.out.println("[2] - NÃO");
        int opcaoNiver = dados.nextInt();
        System.out.println("Ano atual: ");
        int anoAtual = dados.nextInt();

        int calculoIdade;
        switch (opcaoNiver) {
            case 1 -> {
                calculoIdade = anoAtual - anoNascimento;
                System.out.println("Sua idade é: " + calculoIdade);
            }
            case 2 -> {
                calculoIdade = (anoAtual - anoNascimento) - 1;
                System.out.println("Sua idade é " + calculoIdade);
            }
        }

    }

    public static void calcularIMC(){
        Scanner dados = new Scanner(System.in);
        System.out.println("Sua altura: ");
        double altura = dados.nextDouble();
        System.out.println("Seu peso: ");
        double peso = dados.nextDouble();

        double imc = peso / (altura*altura);

        System.out.println("Seu IMC é de: " + imc);
    }
}
