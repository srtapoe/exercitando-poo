package br.com.lanchonete.entidades;

import br.com.lanchonete.enums.TipoDePagamento;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
@Setter
public class Pedido implements  ICalcularValorProduto{

    private String nomeCliente;
    private double taxaServico;
    private TipoDePagamento pagamento;
    ArrayList<LancheGeral> itensPedidos;

    public Pedido(){
        itensPedidos = new ArrayList<>();
    }

    @Override
    public double somarItensConsumidos() {
        double somaItensPedidos = 0d;

        for (LancheGeral cesta: itensPedidos) {
            somaItensPedidos += cesta.getPrecoVenda();
        }

        return somaItensPedidos;
    }

    @Override
    public double calcularTaxaDeServico(double somaItensPedidos) {

        somarItensConsumidos();

        return somaItensPedidos * 0.2;
    }

    @Override
    public double calcularTroco() {
        double recebido;

        Scanner dados = new Scanner(System.in);
        recebido = dados.nextDouble();

        somarItensConsumidos();

        return (recebido - somarItensConsumidos());
    }

    @Override
    public void mostrarNotaFiscal() {

        System.out.println("===================NOTA FISCAL===================");
        System.out.println("Itens Pedidos: ");
        double total = 0d;
        for (LancheGeral lanche: itensPedidos) {
            System.out.println(lanche);
            total+= lanche.getPrecoVenda();
        }
        System.out.println("Total a pagar: " + total);
        System.out.println("Taxa de Serviço: " + calcularTaxaDeServico(somarItensConsumidos()));
        System.out.println("Tipo de Pagamento: " + getPagamento());
        System.out.println("Troco: " + calcularTroco());

        System.out.println("Obrigado pela preferência!");
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "\nNome do Cliente: '" + nomeCliente + '\'' +
                "\nTaxa de Serviço: " + taxaServico +
                "\nTipo de Pagamento: " + pagamento +
                "\nItens Pedidos: " + itensPedidos +
                '}';
    }
}
