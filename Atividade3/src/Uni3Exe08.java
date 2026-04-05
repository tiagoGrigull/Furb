import java.util.Scanner;

public class Uni3Exe08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valor em dolares: ");
        double valorDolar = scan.nextDouble();
        System.out.println("Cotação do Dólar Hoje: ");
        double dolar = scan.nextDouble();

        double valorReais = valorDolar/dolar;

        System.out.println("O atendente deve devolver R$: "+ valorReais);

        scan.close();
    }

}
