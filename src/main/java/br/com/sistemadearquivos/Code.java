package br.com.sistemadearquivos;

import java.util.ArrayList;

public class Code extends Arquivo implements OpcoesDosArquivos{

    public Code(){}

    @Override
    public void guardaArquivo() {
        if (getTiposDeArquivos() == TiposDeArquivos.CSS || getTiposDeArquivos() == TiposDeArquivos.HTML || getTiposDeArquivos() == TiposDeArquivos.JS || getTiposDeArquivos() == TiposDeArquivos.JSP
        || getTiposDeArquivos() == TiposDeArquivos.XML){
            ArrayList<Code> codes = new ArrayList<>();
            codes.add(new Code());
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
