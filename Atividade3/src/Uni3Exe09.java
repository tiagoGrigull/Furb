import java.util.Scanner;

public class Uni3Exe09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Informe o raio da lata: ");
            float r = scan.nextFloat();
            System.out.println("Informe a altura da lata: ");
            float h = scan.nextFloat();

            float pi = 3.1415f;
            float volume = pi*(r*r) * h;

            System.out.printf("O volume da lata de óleo é: %.2f", volume);


        scan.close();
    }

}
