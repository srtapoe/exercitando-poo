package br.com.sistemadearquivos;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class GerenciadorDeArquivos {
    public static void main(String[] args) {


        System.out.println("==============IMAGENS====================");
        Imagem imagem1 = new Imagem();
        imagem1.setNome("4K Dragon Ball Z Wallpaper (60+ images).jfif");
        imagem1.setTiposDeArquivos(TiposDeArquivos.JPG);
        imagem1.setTamanhoArquivo(320);
        imagem1.setAtributo(Atributos.SOMENTE_LEITURA);
        imagem1.setDataCriacao(LocalDateTime.now());
        imagem1.setStatusArquivo(false);
        imagem1.mostrarPropriedades();


        Imagem imagem2 = new Imagem();
        imagem2.setNome("61d3967c84fc2.jpg");
        imagem2.setTiposDeArquivos(TiposDeArquivos.PNG);
        imagem2.setTamanhoArquivo(119);
        imagem2.setAtributo(Atributos.SOMENTE_LEITURA);
        imagem2.setDataCriacao(LocalDateTime.now());
        imagem2.setStatusArquivo(false);
        imagem2.mostrarPropriedades();

        ArrayList<Imagem> imagens = new ArrayList<>();
        imagens.add(imagem1);
        imagens.add(imagem2);

        for (Imagem imagem: imagens) {
            System.out.println("Imagens guardadas no diretório: " + imagem.getNome());
        }

        System.out.println("========DOCUMENTOS====================");
        ArrayList<DocX> docs = new ArrayList<>();

        DocX documento1 = new DocX();
        documento1.setNome("edgar_allan_poe_storyteller.pdf");
        documento1.setTamanhoArquivo(1509610);
        documento1.setTiposDeArquivos(TiposDeArquivos.PDF);
        documento1.setDataCriacao(LocalDateTime.now());
        documento1.setStatusArquivo(false);
        documento1.mostrarPropriedades();

        DocX documento2 = new DocX();
        documento2.setNome("O SALTO DO GATO.pdf");
        documento2.setTamanhoArquivo(19028381);
        documento2.setTiposDeArquivos(TiposDeArquivos.PDF);
        documento2.setDataCriacao(LocalDateTime.now());
        documento2.setStatusArquivo(false);
        documento2.mostrarPropriedades();

        docs.add(documento1);
        docs.add(documento2);

        for (DocX doc: docs) {
            System.out.println("Imagens guardadas no diretório: " + doc.getNome());
        }
    }
}
