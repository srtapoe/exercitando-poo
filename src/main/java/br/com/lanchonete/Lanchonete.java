package br.com.lanchonete;

import br.com.lanchonete.entidades.LancheGeral;
import br.com.lanchonete.entidades.Pedido;
import br.com.lanchonete.entidades.Pizza;
import br.com.lanchonete.enums.TipoDeRecheioPizza;
import br.com.lanchonete.enums.TipoMolhoPizza;

import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete {

    static ArrayList<Pedido> pedidos = new ArrayList<>();
    static ArrayList<LancheGeral> lanchesPedidos = new ArrayList<>();
    static Scanner dados = new Scanner(System.in);


    public static void main(String[] args) {
        carregarPedidos();

        int op;

        while(true){
            System.out.println("=======BEM VINDO(A) A LANCHONETE QUASE TRÊS LANCHES=======");
            System.out.println("[1] - Fazer pedido");
            System.out.println("[2] - Sair");
            op = dados.nextInt();

            switch (op){
                case 1:
                    fazerPedido();
                    break;
                case 2:
                    return;
            }
        }

    }

    public static void carregarPedidos(){
        Pizza pizza1 = new Pizza();
        pizza1.setTipoDeRecheioPizza(TipoDeRecheioPizza.CALABRESA);
        pizza1.setQuerMolho(true);
        pizza1.setTipoMolhoPizza(TipoMolhoPizza.TOMATE);
        pizza1.setDataValidade("01/06/2022");
        pizza1.setPrecoVenda(35.50);
        pizza1.setPeso(40);
        pizza1.setNomeItem("Calabresa");

        Pizza pizza2 = new Pizza();
        pizza2.setTipoDeRecheioPizza(TipoDeRecheioPizza.MUSSARELA);
        pizza2.setQuerMolho(false);
        pizza2.setDataValidade("01/06/2022");
        pizza2.setPrecoVenda(40.0);
        pizza2.setPeso(40);
        pizza2.setNomeItem("Mussarela");

        lanchesPedidos.add(pizza1);
        lanchesPedidos.add(pizza2);

    }

    public static  void fazerPedido(){
        Pedido novoPedido = new Pedido();
        System.out.println("Nome do Cliente: ");
        novoPedido.setNomeCliente(dados.nextLine());

        int op;
        while(true){
            for(int i = 0; i<lanchesPedidos.size(); i++){
                System.out.println(i + ")" + lanchesPedidos.get(i).getNomeItem());
            }
            System.out.println("[0] - Para encerrar o pedido");
            op = dados.nextInt();

            if(op != 0){
                ArrayList<LancheGeral> lanches;

                lanches = novoPedido.getItensPedidos();
                System.out.println(lanches);
                lanches.add(lanchesPedidos.get(op));
                novoPedido.setItensPedidos(lanches);
            }else {
                break;
            }
        }
        novoPedido.mostrarNotaFiscal();
    }
}
