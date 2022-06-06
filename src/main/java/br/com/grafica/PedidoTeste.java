package br.com.grafica;

import java.time.LocalDate;
import java.util.Calendar;

public class PedidoTeste {
    public static void main(String[] args) {

        Pedido pedido = new Pedido();
        pedido.setDtaEmissao(LocalDate.now());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 15);
        pedido.setDtaFinalizacao(calendar);
        pedido.setResponsavelVendas(SetorVendas.ALAN);

        pedido.responsavel(SetorVendas.ALAN, pedido);

        System.out.println(pedido);
    }
}
