package br.com.construtores;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contador {

    private int cont;

    public Contador(int cont) {
        this.cont = cont;
    }

    public Contador(){
        cont = 0;
    }

    public void contar(int cont){
       if(cont <=0){
           for(int i =0; i<10; i++){
               System.out.println("Contando...." + i);
           }
       }else {
           for (int i = 0; i<=cont;i++){
               System.out.println(i + " contando até sua entrada " + cont);
           }
       }
    }
}
