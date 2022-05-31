package br.com.desafiostecnicos.registrocolaboradores;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Colaborador {

    private String nome;
    private String matricula;
    private boolean instruido;
    private GrauDeEscolaridade escolaridade;
    private String instituicaoEnsino;

    @Override
    public String toString() {
        return "Colaborador{" +
                "\nNom: " + nome + '\'' +
                "\nMatrícula: " + matricula + '\'' +
                "Letrado? " + instruido +
                "\nNível de Escolaridade: " + escolaridade +
                "\nInstituição de Ensino: " + instituicaoEnsino + "\n" +
                '}';
    }
}
