import java.util.Scanner;

public class Uni3Exe11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a temperatura em °C");
        float celcius = scan.nextFloat();

        float convertToF = (9.0f/5.0f) * celcius +32f;

        System.out.printf("Temperatura convertida para °F: ", convertToF);

        scan.close();
    }

}
