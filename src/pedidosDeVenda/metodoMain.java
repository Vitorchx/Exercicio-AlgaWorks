package pedidosDeVenda;

public class metodoMain {
    static void impressao(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {


        Pedido pedido = new Pedido();
        pedido.codigo = 402;
        pedido.subtotal = 800.0;
        pedido.desconto = 13 * (pedido.subtotal/100);


        impressao("Numero do código: " + pedido.getCodigo());
        impressao("Numero do subtotal: " + pedido.getSubtotal());
        impressao("Numero do desconto: " + pedido.getDesconto());
        impressao("Numero do total: " + pedido.getTotal());
    }

}
