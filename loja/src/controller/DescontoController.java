package controller;

import model.Produto;
import service.DescontoService;

public class DescontoController {


    public String exibirDesconto(Produto produto){
        return new DescontoService(produto).toString();
    }


}
