import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Selecione a opção desejada:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Informe a temperatura em Celsius: ");
            double temperaturaCelsius = scanner.nextDouble();

            double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;

            System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit + " °F");
        } else if (opcao == 2) {
            System.out.print("Informe a temperatura em Fahrenheit: ");
            double temperaturaFahrenheit = scanner.nextDouble();

            double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

            System.out.println("Temperatura em Celsius: " + temperaturaCelsius + " °C");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}
