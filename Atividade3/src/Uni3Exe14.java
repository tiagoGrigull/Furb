import java.util.Scanner;

public class Uni3Exe14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        float kmPerLitro = 12.00f;

        System.out.println("Informe a distância percorrida: (em km)");
        double distancia = scan.nextDouble();
        System.out.println("Infome o tempo da viagem: (em Horas)");
        double tempo = scan.nextDouble();

        double velMedia = distancia/tempo;
        double qtdCombustivel = distancia/kmPerLitro;

        System.out.printf("A velocidade média foi de: %.2f", velMedia);
        System.out.println("A quantidade de combustivel foi de: %.2f" + qtdCombustivel);

        scan.close();
    }

}
