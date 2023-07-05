import java.util.Random;
import java.util.Scanner;

public class DescubraONumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroGerado = random.nextInt(100) + 1;
        int palpite;

        System.out.println("Bem-vindo ao jogo Descubra o Número!");

        do {
            System.out.print("Digite o seu palpite (entre 1 e 100): ");
            palpite = scanner.nextInt();

            if (palpite < numeroGerado) {
                System.out.println("Palpite muito baixo! Tente novamente.");
            } else if (palpite > numeroGerado) {
                System.out.println("Palpite muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        } while (palpite != numeroGerado);

        scanner.close();
    }
}
