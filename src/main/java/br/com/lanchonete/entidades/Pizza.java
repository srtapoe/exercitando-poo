package br.com.lanchonete.entidades;


import br.com.lanchonete.enums.TipoDeBorda;
import br.com.lanchonete.enums.TipoDeRecheioPizza;
import br.com.lanchonete.enums.TipoMolhoPizza;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Setter
@Getter
public class Pizza extends LancheGeral {
    public Pizza(){}

    private TipoDeBorda tipoDeBordaPizza;
    private boolean querMolho;
    private TipoDeRecheioPizza tipoDeRecheioPizza;
    private TipoMolhoPizza tipoMolhoPizza;


    void escolherMolho(){
        String molhoEscolhido = null;
        Scanner dados = new Scanner(System.in);
        int escolha = 0;
        if(querMolho){
            System.out.println("Cliente quer pizza sem molho");
        }else{
            while (escolha >=6 )
          
            System.out.println("Escolha o tipo de molho: ");
            System.out.println("[1] - TOMATE");
            System.out.println("[2] - GORGONZOLA");
            System.out.println("[3] - PARISIENSE");
            System.out.println("[4] - PICANTE");
            System.out.println("[5] - STROGONOFF");
            escolha = dados.nextInt();
            switch (escolha){
                case 1:
                   molhoEscolhido = TipoMolhoPizza.TOMATE.toString();
                    break;
                case 2:
                    molhoEscolhido = TipoMolhoPizza.GORGONZOLA.toString();
                    break;
                case 3:
                 molhoEscolhido = TipoMolhoPizza.PARISIENSE.toString();
                    break;
                case 4:
                molhoEscolhido = TipoMolhoPizza.PICANTE.toString();
                    break;
                case 5:
                 molhoEscolhido = TipoMolhoPizza.STROGONOFF.toString();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Opção escolhida : " + molhoEscolhido);
        }

    }

}
