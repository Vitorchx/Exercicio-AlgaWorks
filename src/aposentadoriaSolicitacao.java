import java.util.Scanner;

public class aposentadoriaSolicitacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        Integer idadeRequerente = scanner.nextInt();

        System.out.println("Informe seu tempo de contribuição: ");
        Integer tempoContribuido = scanner.nextInt();

        Boolean idadeMinima = idadeRequerente >=55;
        Boolean contribuicaoMinima = tempoContribuido >=25;

        Boolean podeAposentar = idadeMinima && contribuicaoMinima;

        if (podeAposentar){
            System.out.println("Parabens, solicitação de aposentadoria aceita.");
        } else {
            System.out.println("Solicitação de aposentadoria negada.");
        }





    }



}
