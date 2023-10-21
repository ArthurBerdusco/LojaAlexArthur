package service;

import example.DescontoAlto;
import example.DescontoBaixo;
import example.DescontoRegular;
import model.Produto;

public class DescontoService {

    private Produto produto;

    public DescontoService(Produto produto){
        this.produto = produto;
    }

    public Double calcularDesconto(){

        Double valor;

        valor = new DescontoBaixo(produto)
                                        .ou(new DescontoRegular(produto))
                                        .ou(new DescontoAlto(produto))
                                        .calcular();

        return valor;

    }

    @Override
    public String toString() {

        Double valorPedido = produto.getQuantidade() * produto.getPreco();
        return "[ ID=" + produto.getId() + ", NOME=" + produto.getNome() + ", VALOR S/DESCONTO=" + valorPedido + ", VALOR C/DESCONTO=" + (valorPedido - calcularDesconto()) + ", DESCONTO=" + calcularDesconto() + " ]";
    }


}
