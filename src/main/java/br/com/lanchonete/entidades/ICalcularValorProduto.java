package br.com.lanchonete.entidades;

public interface ICalcularValorProduto {

    double somarItensConsumidos();

    double calcularTaxaDeServico(double somaItensPedidos);

    double calcularTroco();

    void mostrarNotaFiscal();
}
