import java.util.Scanner;

public class Uni3Exe13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precoAzulejo = 12.50;

        System.out.println("Informe a altura da parede:");
        float h = scan.nextFloat();
        System.out.println("Informe o comprimento da parede:");
        float c = scan.nextFloat();

        float area = h * c;

        float qtdAzulejosParede = area * 9;
        double valorFinal = qtdAzulejosParede * precoAzulejo;

        System.out.printf("O valor final é: R$ %.2f", valorFinal);




        scan.close();
    }

}
