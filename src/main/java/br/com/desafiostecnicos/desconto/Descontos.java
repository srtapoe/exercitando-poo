package br.com.desafiostecnicos.desconto;

public class Descontos {

    public static void main(String[] args) {

        int i = 1;

        System.out.println("=======TABELA DE DESCONTOS=======");
        double valorInicial = 200;
        double desconto = 1;

        while(i<=20){


            valorInicial = valorInicial + 100;
            desconto = desconto + 1;

            i++;

            double descontoConcedido = (desconto * valorInicial) / 100 ;
            double valorFinal = valorInicial - descontoConcedido;

            System.out.println("Valor da Compra: " + valorInicial + " | Porcentagem de desconto: " + desconto + " | Desconto dado:"  + descontoConcedido +
                    " | Valor Final: " + valorFinal);

        }

    }

}


