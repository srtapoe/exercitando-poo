package br.com.sistemadearquivos;

import java.util.ArrayList;

public class Imagem extends Arquivo implements OpcoesDosArquivos{
    public Imagem(){}


    @Override
    public void guardaArquivo() {
        if (getTiposDeArquivos() == TiposDeArquivos.JPG || getTiposDeArquivos() == TiposDeArquivos.PNG){
            ArrayList<Imagem> imagens = new ArrayList<>();
            imagens.add(new Imagem());
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
