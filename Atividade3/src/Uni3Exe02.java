import java.util.Scanner;

public class Uni3Exe02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do sapato: ");
        float valor = scan.nextFloat();

        float desconto = 0.12f;


        desconto = desconto * valor;
        valor = valor + desconto;

        System.out.printf("O valor do desconto é:  %.2f", desconto);
        System.out.printf("\nO valor do par de sapatos é de: %.2f" + valor);



        scan.close();
    }

}
