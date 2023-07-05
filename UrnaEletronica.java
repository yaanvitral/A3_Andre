import java.util.Scanner;

public class UrnaEletronica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] candidatos = new String[5];
        int[] votos = new int[5];
        int votosTotais = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome do candidato " + (i + 1) + ": ");
            candidatos[i] = scanner.nextLine();
        }

        while (true) {
            System.out.print("Informe o número do candidato (0 para encerrar a votação): ");
            int numeroCandidato = scanner.nextInt();
            if (numeroCandidato == 0) {
                break;
            }
            if (numeroCandidato >= 1 && numeroCandidato <= 5) {
                votosTotais++;
                votos[numeroCandidato - 1]++;
            } else {
                System.out.println("Número de candidato inválido. Voto não computado.");
            }
        }

        int maiorVotos = 0;
        int candidatoVencedor = 0;
        boolean empate = false;

        for (int i = 0; i < 5; i++) {
            int numVotos = votos[i];
            if (numVotos > maiorVotos) {
                maiorVotos = numVotos;
                candidatoVencedor = i + 1;
                empate = false;
            } else if (numVotos == maiorVotos) {
                empate = true;
            }
        }

        System.out.println("Número de votos totais: " + votosTotais);

        for (int i = 0; i < 5; i++) {
            String nomeCandidato = candidatos[i];
            int numVotos = votos[i];
            double percentualVotos = (double) numVotos / votosTotais * 100;

            System.out.println("Candidato " + (i + 1) + " (" + nomeCandidato + "): " + numVotos + " votos (" + percentualVotos + "%)");
        }

        if (empate || (maiorVotos < votosTotais * 0.5)) {
            System.out.println("Nenhum dos candidatos obteve 50% dos votos. Realizar outra votação com os dois candidatos mais votados.");
        } else {
            String nomeVencedor = candidatos[candidatoVencedor - 1];
            System.out.println("O candidato " + candidatoVencedor + " (" + nomeVencedor + ") obteve a maioria dos votos e é o vencedor.");
        }

        scanner.close();
    }
}
