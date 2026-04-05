import java.util.Scanner;

public class Uni3Exe10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do cateto 'a': ");
        float a = scan.nextFloat();
        System.out.println("Informe o valor do cateto 'b': ");
        float b = scan.nextFloat();

        float pitagoras = (a * a) + (b * b);

        System.out.printf("A hipotenusa do triângulo é: %.2f", pitagoras);

        scan.close();
    }

}
