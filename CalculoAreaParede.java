import java.util.Scanner;

public class CalculoAreaParede {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura da parede (hp): ");
        double alturaParede = scanner.nextDouble();

        System.out.print("Informe a largura da parede (lp): ");
        double larguraParede = scanner.nextDouble();

        System.out.print("Informe a altura do azulejo (ha): ");
        double alturaAzulejo = scanner.nextDouble();

        System.out.print("Informe a largura do azulejo (la): ");
        double larguraAzulejo = scanner.nextDouble();

        double areaParede = alturaParede * larguraParede;
        double areaAzulejo = alturaAzulejo * larguraAzulejo;

        int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

        System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);

        scanner.close();
    }
}
