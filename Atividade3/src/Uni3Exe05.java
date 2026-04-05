import java.util.Scanner;

public class Uni3Exe05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float precoAnelIdent = 4.00f;
        float precoAnelALimt = 3.50f;

        System.out.println("Informe a quantidade de aves que há na granja: ");
        int qtdAves = scan.nextInt();

        precoAnelIdent = precoAnelIdent * qtdAves;
        precoAnelALimt = precoAnelALimt * qtdAves;

        System.out.printf("O gasto total para marcar "+ qtdAves+ " é de: %.2f", precoAnelIdent+precoAnelALimt);

        scan.close();
    }

}
