package br.com.lanchonete.entidades;

import br.com.lanchonete.enums.TipoDePagamento;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class Pedido {

    private String nomeCliente;
    private double taxaServico;
    private TipoDePagamento pagamento;
    ArrayList<?> pedidos;
}
