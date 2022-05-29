package br.com;

import br.com.models.Gerente;
import br.com.models.OperadorCaixa;
import br.com.models.Vendedor;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Lily Aldrin");
        vendedor1.setRua("Street 34");
        vendedor1.setBairro("Forest Hills");
        vendedor1.setComplemento("Apt.55");
        vendedor1.setValorSalario(1500);
        vendedor1.calcularBonificacao(5);


        System.out.println(vendedor1);
        System.out.println("=======================================================");

        Gerente gerente = new Gerente();
        gerente.setNome("Ted Mosby");
        gerente.setDocumento("2000.000.000.00");
        gerente.setBairro("Broklyn");
        gerente.setRua("Black Street");
        gerente.setComplemento("Apt.33");
        gerente.setHorasTrabalhadas(150);
        gerente.setValorHora(60);
        gerente.calculaRemuneracao();
        gerente.calcularBonificacao(5);

        System.out.println(gerente);

        System.out.println("=======================================================");

        OperadorCaixa operadorCaixa = new OperadorCaixa();
        operadorCaixa.setNome("Barney Stinson");
        operadorCaixa.setNome("Ted Mosby");
        operadorCaixa.setDocumento("2000.000.000.00");
        operadorCaixa.setBairro("Broklyn");
        operadorCaixa.setRua("Black Street");
        operadorCaixa.setComplemento("Apt.34");
        operadorCaixa.setValorSalario(1500);

        System.out.println(operadorCaixa);
    }
}
