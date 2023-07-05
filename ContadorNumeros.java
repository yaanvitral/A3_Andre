import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma sequência de números inteiros positivos: ");

        int numero;
        int contadorPares = 0;
        int contadorImpares = 0;

        do {
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero >= 0) {
                contadorPares++;
            } else if (numero >= 0) {
                contadorImpares++;
            }
        } while (numero >= 0);

        System.out.println("Quantidade de números pares: " + contadorPares);
        System.out.println("Quantidade de números ímpares: " + contadorImpares);

        scanner.close();
    }
}
