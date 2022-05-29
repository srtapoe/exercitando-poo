package br.com.sistemadearquivos;

import java.util.ArrayList;

public class Video extends Arquivo implements OpcoesDosArquivos{

    public Video(){}

    @Override
    public void guardaArquivo() {
        if (getTiposDeArquivos() == TiposDeArquivos.MP4 || getTiposDeArquivos() == TiposDeArquivos.AVI){
            ArrayList<Video> videos = new ArrayList<>();
            videos.add(new Video());
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