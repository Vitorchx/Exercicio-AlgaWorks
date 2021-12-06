import java.util.Scanner;

public class EX_gastoFamiliar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double valorTotal = 0.0;

        System.out.println("Digite o valor da conta de luz: ");
        Double contaLuz = scan.nextDouble();
        valorTotal += contaLuz;

        System.out.println("Digite o valor da conta de água: ");
        Double contaAgua = scan.nextDouble();
        valorTotal += contaAgua;
        
        System.out.println("Digite o valor da conta de telefone: ");
        Double contaTelefone = scan.nextDouble();
        valorTotal += contaTelefone;
        
        System.out.println("Digite o valor da mensalidade da escola dos filhos: ");
        Double contaEscola = scan.nextDouble();
        valorTotal += contaEscola;
        
        System.out.println("Total de gastos é de: " + valorTotal);
    }
}













