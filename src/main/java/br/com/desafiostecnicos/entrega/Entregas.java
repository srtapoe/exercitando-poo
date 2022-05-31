package br.com.desafiostecnicos.entrega;

import java.util.ArrayList;

public class Entregas {
    public static void main(String[] args) {

        ArrayList<Morador> moradors = new ArrayList<>();

        Morador morador1 = new Morador();
        morador1.setTelefone("9999-9999");
        morador1.setNumeroResidencia(10);
        morador1.setTemCachorro(true);
        morador1.entregarCorrespondencia(morador1.isTemCachorro(), morador1.getNumeroResidencia());

        moradors.add(morador1);

        Morador morador2 = new Morador();
        morador2.setTelefone("9998-9998");
        morador2.setNumeroResidencia(11);
        morador2.setTemCachorro(false);
        morador2.entregarCorrespondencia(morador2.isTemCachorro(), morador2.getNumeroResidencia());

        moradors.add(morador2);

        Morador morador3 = new Morador();
        morador3.setTelefone("1111-1111");
        morador3.setNumeroResidencia(12);
        morador3.setTemCachorro(false);
        morador3.entregarCorrespondencia(morador3.isTemCachorro(), morador3.getNumeroResidencia());

        moradors.add(morador3);

        Morador morador4 = new Morador();
        morador4.setTelefone("2222-2222");
        morador4.setNumeroResidencia(13);
        morador4.setTemCachorro(false);
        morador4.entregarCorrespondencia(morador4.isTemCachorro(), morador4.getNumeroResidencia());

        moradors.add(morador4);

        int contador = 0;
        for (Morador morador: moradors) {
            if(!morador.isTemCachorro() && morador.getNumeroResidencia() % 2 != 0){
                contador = contador + 1;
            }
        }
        System.out.println("Quantidade de entregas do dia: " + contador);
    }
}
