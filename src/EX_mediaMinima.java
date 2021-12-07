import java.util.Scanner;

public class EX_mediaMinima {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Informe a nota de Portugues do aluno: ");
        Double notaPortugues = scan.nextDouble();

        System.out.println("Informe a nota de Matemática do aluno:" );
        Double notaMatematica = scan.nextDouble();

        Double mediaAluno = notaPortugues + notaMatematica;
        Double mediaMinima = 150.0;
        Double notaPorMateria = 60.0;

        Boolean notaMinima = notaPortugues >= notaPorMateria && notaMatematica >= notaPorMateria;
        Boolean mediaAprovado = mediaAluno >= mediaMinima;
        Boolean alunoAprovado = notaMinima && mediaAprovado;

        if (alunoAprovado){
            System.out.println("Aluno aprovado! " + notaPortugues + " pontos em portugues e " + notaMatematica + " pontos em matematica. "
            + mediaAluno + " pontos no total.");
        } else{
            System.out.println("Aluno reprovado! " + notaMatematica + " pontos em matematica e " + notaPortugues + " pontos em portugues. "
            + mediaAluno + " pontos no total.");
        }




    }


}
