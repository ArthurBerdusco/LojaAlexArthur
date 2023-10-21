import model.Produto;
import service.DescontoService;

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


        var service = new DescontoService();

        test(service.calcularDesconto(produto1));
        test(service.calcularDesconto(produto2));
        test(service.calcularDesconto(produto3));
        test(service.calcularDesconto(produto4));
        test(service.calcularDesconto(produto5));

    }

    private static void test(double desconto) {
        System.out.println("VALOR DO DESCONTO: " + desconto);
    }

}
