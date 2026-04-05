import java.util.Scanner;

public class Uni3Exe03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço da gasolina por litro");
        float precoLitro = scan.nextFloat();
        System.out.println("Informe o valor do pagamento: ");
        float valorPgto = scan.nextFloat();

        float qtdGasolina =  precoLitro / valorPgto;

        System.out.printf("O motorista colocou: %.2f", qtdGasolina, " Litros");

        scan.close();
    }

}
