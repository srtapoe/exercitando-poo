package br.com.lanchonete.entidades;

import br.com.lanchonete.enums.TipoDePao;
import br.com.lanchonete.enums.TipoDeRecheioLanche;
import br.com.lanchonete.enums.TipoMolhoLanche;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Lanche extends LancheGeral {
    public Lanche(){}

    private TipoDePao tipoDePao;
    private TipoMolhoLanche tipoMolhoLanche;
    private TipoDeRecheioLanche tipoDeRecheioLanche;

}
