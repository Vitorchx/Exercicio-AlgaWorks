package reporEstoque;

public class reposicaoProdu {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Teclado Hermes E2";
        produto.quantidadeEstoque = 20;

        System.out.println("Necessidade de repor " + produto.nome + "?");

        if (quantidadeEstoque(produto) == true) {
            System.out.println(" Sim, é necessário repor estoque no momento.");
        } else {
            System.out.println(" Não é necessário repor estoque no momento.");
        }
    }

    static  Boolean quantidadeEstoque(Produto produto) {
        if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE){
            return true;
        } else {
            return false;
        }
    }
}
