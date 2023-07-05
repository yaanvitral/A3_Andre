import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        double[] notas = new double[5];
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            somaNotas += notas[i];
        }

        double media = somaNotas / notas.length;

        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("Notas:");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Média: " + media);

        if (media >= 60) {
            System.out.println("Situação: Aprovado");
        } else if (media < 40) {
            System.out.println("Situação: Reprovado");
        } else {
            System.out.println("Situação: Recuperação");
        }

        scanner.close();
    }
}

