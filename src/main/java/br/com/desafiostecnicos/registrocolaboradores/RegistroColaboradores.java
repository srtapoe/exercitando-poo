package br.com.desafiostecnicos.registrocolaboradores;

import java.util.ArrayList;

public class RegistroColaboradores {
    public static void main(String[] args) {

        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        Faxineiro faxineiro = new Faxineiro();
        faxineiro.setNome("Flávio Augusto dos Reis");
        faxineiro.setMatricula("202200099");
        faxineiro.setInstruido(false);
        faxineiro.setEscolaridade(GrauDeEscolaridade.ANALFABETO);
        faxineiro.setInstituicaoEnsino("Não cursou a alfabetização");

        colaboradores.add(faxineiro);

        Analista analista = new Analista();
        analista.setNome("Paulo Ricardo Alves");
        analista.setMatricula("202122256");
        analista.setInstruido(true);
        analista.setEscolaridade(GrauDeEscolaridade.SUPERIOR);
        analista.setInstituicaoEnsino("Universidade Federal do Ceará");

        colaboradores.add(analista);


        Gerente gerente = new Gerente();
        gerente.setNome("André Augusto Flaustino");
        gerente.setMatricula("201812345");
        gerente.setInstruido(true);
        gerente.setEscolaridade(GrauDeEscolaridade.SUPERIOR);
        gerente.setInstituicaoEnsino("Universidade de Brasília");
        gerente.setSetorGerencia(SetorGerencia.TI);

        colaboradores.add(gerente);

        for (Colaborador colaborador: colaboradores) {
            System.out.println("Colaborador: " + colaborador.toString());
        }


    }
}
