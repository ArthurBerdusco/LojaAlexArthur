import controller.DescontoController;
import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        runTest();
    }

    private static void runTest() {

        var produto1 = new Produto().nome("Televisão").descricao("Smart TV").preco(1500).quantidade(10);
        var produto2 = new Produto().nome("Celular").descricao("Iphone 11").preco(3500).quantidade(3);
        var produto3 = new Produto().nome("PS5").descricao("Spider").preco(4300).quantidade(6);
        var produto4 = new Produto().nome("Tablet").descricao("Samsung").preco(2500).quantidade(8);
        var produto5 = new Produto().nome("Notebook").descricao("Dell").preco(1300).quantidade(11);
        

        var controllerDesconto = new DescontoController();

        test(controllerDesconto.exibirDesconto(produto1));
        test(controllerDesconto.exibirDesconto(produto2));
        test(controllerDesconto.exibirDesconto(produto3));
        test(controllerDesconto.exibirDesconto(produto4));
        test(controllerDesconto.exibirDesconto(produto5));

    }

    private static void test(String desconto) {
        if (desconto == null)
            return;
        System.out.println(desconto);
    }

}
