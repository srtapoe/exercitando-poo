package br.com.desafiostecnicos.entrega;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Morador {

    private String telefone;
    private int numeroResidencia;
    private boolean temCachorro;

    public void entregarCorrespondencia(boolean temCachorro, int numeroResidencia){
        if(temCachorro){
            System.out.println("Entrega não será feita na Residência N° " + numeroResidencia);
        }else{
            System.out.println("A entrega será feita na Residência N° " + numeroResidencia);
        }
    }

    @Override
    public String toString() {
        return "Morador{" +
                "telefone='" + telefone + '\'' +
                ", numeroResidencia=" + numeroResidencia +
                ", temCachorro=" + temCachorro +
                '}';
    }
}
