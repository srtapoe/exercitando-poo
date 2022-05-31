package br.com.desafiostecnicos.registrocolaboradores;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Analista extends Colaborador {


    @Override
    public String toString() {
        return "Analista{" +
                "\nNom: " + super.getNome() + '\'' +
                "\nMatrícula: " + super.getMatricula() + '\'' +
                "\nNível de Escolaridade: " + super.getEscolaridade()  +
                "\nInstituição de Ensino: " + super.getInstituicaoEnsino() + "\n" +
                '}';
    }
}
