import java.util.Scanner;

public class Uni4Exe17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a renda anual");
        float renda = scan.nextFloat();
        System.out.println("Informe a quantidade de dependentes");
        int dependentes = scan.nextInt();


        float rendaLiquida = renda * (1 - (dependentes * 0.02f));
        float imposto = 0;


        if (rendaLiquida <= 2000) {
            imposto = 0;
        } 
        else if (rendaLiquida <= 5000) {
            imposto = rendaLiquida * 0.05f;
        } 
        else if (rendaLiquida <= 10000) {
            imposto = rendaLiquida * 0.10f;
        } 
        else {
            imposto = rendaLiquida * 0.15f;
        }

        System.out.println("Renda líquida: " + rendaLiquida);
        System.out.println("Imposto a pagar: " + imposto);

        scan.close();
    }

}

    