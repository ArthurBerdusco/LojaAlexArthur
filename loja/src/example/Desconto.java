package example;

import model.Produto;

public abstract class Desconto {
    
    protected Produto produto;

    public Desconto(){
        
    }

    public Desconto(Produto produto){
        this.produto = produto;
    }

    public Desconto produto(Produto produto){
        this.produto = produto;
        return this;
    }

    public abstract Double calcular();

    public final Desconto ou(Desconto proximo) {

        if (aplicarDesconto())
            return this;
        return proximo;

    };

    public abstract boolean aplicarDesconto();

}
