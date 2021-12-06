import java.util.Scanner;

public class descontoFrete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        Double valorProduto = scan.nextDouble();

        Double frete = 15.0;
        Boolean valorSemFrete = valorProduto >= 100;

        if(valorSemFrete){
           frete = Double.valueOf(0);
        }
         Double totalCompra = valorProduto + frete;
        System.out.println("Valor total da campra é de: " + totalCompra);



    }
}
