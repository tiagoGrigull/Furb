import java.util.Scanner;

public class Uni4Exe04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero maior que zero");
        float num = scan.nextFloat();

        if(num % 1 != 0){
            System.out.println("O numero possui casas decimais");
        }else{
            System.out.println("O numero não possui casas decimais");
        }
        scan.close();
    }

}
