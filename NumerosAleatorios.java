import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[100];
        int soma = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 100; i++) {
            numeros[i] = random.nextInt(100);
            soma += numeros[i];
        }

        for (int i = 0; i < 100; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números gerados:");
        for (int i = 0; i < 100; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.println("Soma dos números: " + soma);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
