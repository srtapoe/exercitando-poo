package br.com.lanchonete.entidades;

import br.com.lanchonete.enums.TipoDeMASSA;
import br.com.lanchonete.enums.TipoDeRecheioLanche;
import br.com.lanchonete.enums.TipoSalgado;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Salgado extends LancheGeral {
    public Salgado(){}


    private TipoSalgado tipoSalgado;
    private TipoDeMASSA tipoDeMASSA;
    private TipoDeRecheioLanche tipoDeRecheio;
}
