import java.util.Scanner;

public class Uni3Exe01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a largura do terreno");
        int larg = scan.nextInt();
        System.out.println("Informe o comprimento do terreno");
        int comp = scan.nextInt();

        int area = larg * comp;

        System.out.println("A área do terreno é de: " + area + " m²");

        scan.close();
    }

}
