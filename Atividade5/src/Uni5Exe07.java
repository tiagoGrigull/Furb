import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros");
        int n = sc.nextInt();

        int maior = 0;
        int menor = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o número");
            int num = sc.nextInt();

            if (i == 0) {
                maior = num;
                menor = num;
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }

        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        sc.close();

    }

}
