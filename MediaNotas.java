import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();

        double[] notas = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        double media = somaNotas / quantidadeAlunos;

        System.out.println("Média das notas: " + media);

        scanner.close();
    }
}
