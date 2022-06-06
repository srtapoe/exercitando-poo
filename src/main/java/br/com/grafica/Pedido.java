package br.com.grafica;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Calendar;

@Getter
@Setter
public class Pedido extends SetorDeVendas {

      private LocalDate dtaEmissao;
      private Calendar dtaFinalizacao;
      private double preco;
      private SetorVendas responsavelVendas;


      public Pedido(){}

    public void responsavel(SetorVendas responsavelVendas, Pedido pedido) throws IllegalStateException {
            switch (responsavelVendas) {
                case EDUARDO -> {
                    pedidosEduardo.add(pedido);
                    for (Pedido pedidos : pedidosEduardo) {
                        System.out.println("Pedido do Eduardo: ");
                    }
                }
                case MARCOS -> {
                    pedidosMarcos.add(pedido);
                    for (Pedido pedidos : pedidosMarcos) {
                        System.out.println("Pedido do Eduardo: ");
                    }
                }
                case MICHELLE -> {
                    pedidosMichelle.add(pedido);
                    for (Pedido pedidos : pedidosMichelle) {
                        System.out.println("Pedido do Eduardo: ");
                    }
                }
                case ALAN -> {
                    pedidosAlan.add(pedido);
                    for (Pedido pedidos : pedidosAlan) {
                        System.out.println("Pedido do Eduardo: ");
                    }
                }
                case FELIPE -> {
                    pedidosFelipe.add(pedido);
                    for (Pedido pedidos : pedidosFelipe) {
                        System.out.println("Pedido do Eduardo: ");
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + responsavelVendas);
            }
        }

    @Override
    public String toString() {
        return "Pedido{" +
                "dtaEmissao=" + dtaEmissao +
                ", dtaFinalizacao=" + dtaFinalizacao +
                ", preco=" + preco +
                ", responsavelVendas=" + responsavelVendas +
                '}';
    }
}
