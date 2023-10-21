import controller.DescontoController;
import model.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        runTest();
    }

    private static void runTest() {

        var produto1 = new Produto(1, "Televisão", "Smart 55", 1000, 10);
        var produto2 = new Produto(2, "Celular", "Smart 55", 3500, 3);
        var produto3 = new Produto(3, "PS5", "Smart 55", 4300, 6);
        var produto4 = new Produto(4, "Tablet", "Smart 55", 2500, 8);
        var produto5 = new Produto(5, "Notebook", "Smart 55", 1300, 11);

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
