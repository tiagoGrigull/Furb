import java.util.Scanner;

public class Uni3Exe06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o peso do prato: (em Kg)");
        float peso = scan.nextFloat();

        float precoPeso = 25.00f;
        float pesoPrato = 0.75f;

        if(peso < pesoPrato){
            System.out.println("peso inválido");
        }

        peso = peso - pesoPrato;

        precoPeso = precoPeso * peso;

        System.out.printf("O valor do prato do cliente é de: %.2f", precoPeso);
        

        scan.close();
    }

}
