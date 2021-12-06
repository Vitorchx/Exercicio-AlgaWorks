import java.util.Scanner;

public class EX_CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double numero1 = scan.nextDouble();

        char operacao = scan.next().charAt(0);

        System.out.println("Digite o segundo valor: ");
        double numero2 = scan.nextDouble();

        if (operacao == '/'){
            double divisao = numero1 / numero2;
            System.out.print("Resultado: " + divisao);
        }
        if (operacao == '*'){
            double multiplicacao = numero1 * numero2;
            System.out.print("Resultado: " + multiplicacao);
        }
        if(operacao == '-'){
            double subtracao = numero1 - numero2;
            System.out.print("Resultado: " + subtracao);
        }
        if(operacao == '+'){
            double adicao = numero1 + numero2;
            System.out.print("Resultado: " + adicao);
        }



    }



     }




