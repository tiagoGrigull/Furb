import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois numeros:");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("Os valores são multipos");
        }else{
            System.out.println("Os valores não são multiplos");
        }

        scan.close();
    }

}