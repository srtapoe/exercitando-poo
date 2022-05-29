package br.com.sistemadearquivos;

import javax.print.Doc;
import java.util.ArrayList;

public class DocX extends Arquivo implements OpcoesDosArquivos{

    public DocX(){}

    @Override
    public void guardaArquivo() {
        if (getTiposDeArquivos() == TiposDeArquivos.DOC || getTiposDeArquivos() == TiposDeArquivos.EXE || getTiposDeArquivos() == TiposDeArquivos.PDF
        || getTiposDeArquivos() == TiposDeArquivos.PPT){
            ArrayList<DocX> docs = new ArrayList<>();
            docs.add(new DocX());
        }
    }

    @Override
    public void mostrarPropriedades() {
        System.out.println("=========PROPRIEDADES======================");
        System.out.println("Nome do Arquivo: " + super.getNome());
        System.out.println("Tipo de Arquivo: " + super.getTiposDeArquivos());
        System.out.println("Tamanho: " + super.getTamanhoArquivo());
        System.out.println("Atributos: " + super.getAtributo());
        System.out.println("Status do Arquivo: " + super.isStatusArquivo());
        System.out.println("Último acesso em: " + super.getDataCriacao() );
    }
}
