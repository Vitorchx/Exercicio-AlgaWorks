import java.util.Scanner;

public class bonusFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a meta de faturamento: ");
        Double metaAnual = scanner.nextDouble();

        System.out.println("Informe o faturamento: ");
        Double faturamentoEmpreza = scanner.nextDouble();

        Double media80PorCento = (metaAnual * 80) / 100;
        Double mediaSalarial = 0.0;
        Boolean bonus100PorCento = faturamentoEmpreza >= metaAnual;
        Boolean bonus80porCento = (faturamentoEmpreza >= media80PorCento) && (faturamentoEmpreza < metaAnual);

        if (bonus100PorCento) {
            System.out.print("Digite a média salaria do funcionario: ");
            mediaSalarial = scanner.nextDouble();

            System.out.println("O funcionario ira receber de bonús o valor de : " + mediaSalarial);

        } else if (bonus80porCento) {
            System.out.print("Digite a média salaria do funcionario: ");
            mediaSalarial = scanner.nextDouble();

            Double media80PorCentoSalarial = (mediaSalarial * 80) / 100;

            System.out.println("O funcionario recebera de bonús o valor de: " + media80PorCentoSalarial);

        } else {
            System.out.println("O funcionario não receberá bonús.");
        }

        scanner.close();


    }


}
