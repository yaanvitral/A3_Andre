import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho das matrizes (n x n): ");
        int tamanho = scanner.nextInt();

        int[][] matriz1 = preencherMatriz(scanner, tamanho, "1");
        int[][] matriz2 = preencherMatriz(scanner, tamanho, "2");

        int[][] matrizSoma = somarMatrizes(matriz1, matriz2);

        exibirMatriz(matrizSoma);

        scanner.close();
    }

    public static int[][] preencherMatriz(Scanner scanner, int tamanho, String numero) {
        int[][] matriz = new int[tamanho][tamanho];

        System.out.println("Preencha a matriz " + numero + ":");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Informe o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
        int tamanho = matriz1.length;
        int[][] matrizSoma = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizSoma;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
