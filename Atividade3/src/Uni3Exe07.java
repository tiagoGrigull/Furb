import java.util.Scanner;

public class Uni3Exe07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Informe a quantidade de Latas (350ml): ");
        int qtdLatas = scan.nextInt();
        System.out.println("Informe a quantidade de Garrafas (600ml): ");
        int qtdGarrafas1 = scan.nextInt();
        System.out.println("Informe a quantidade de Garrafas (2L): ");
        int qtdGarrafas2 = scan.nextInt();

        float litrosFinal = (qtdLatas * 0.35f) + (qtdGarrafas1 * 0.60f) + (qtdGarrafas2 * 2.0f);

        System.out.printf("O cliente comprou %.2f Litros de refrigerante" , litrosFinal);



        scan.close();
    }

}
