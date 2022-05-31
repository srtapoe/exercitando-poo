package br.com.desafiostecnicos.registrocolaboradores;

import br.com.desafiostecnicos.registrocolaboradores.Colaborador;

public class Faxineiro extends Colaborador {


    @Override
    public String toString() {
        return "Faxineiro{" +
                "\nNom: " + super.getNome() + '\'' +
                "\nMatrícula: " + super.getMatricula() + '\'' +
                "\nLetrado? " + super.isInstruido() +
                "\nNível de Escolaridade: " + super.getEscolaridade()  +
                "\nInstituição de Ensino: " + super.getInstituicaoEnsino() + "\n" +
                '}';
    }
}
