package br.com.sistemadearquivos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
public class Arquivo {

    private TiposDeArquivos tiposDeArquivos;
    private int tamanhoArquivo;
    private String nome;
    private Atributos atributo;
    private LocalDateTime dataCriacao;
    private boolean statusArquivo;

    public void excluirArquivo(){
        if(statusArquivo){
            System.out.println("Arquivo excluído!");
        }else{
            System.out.println("Arquivo em memória!");
        }
    }



}
