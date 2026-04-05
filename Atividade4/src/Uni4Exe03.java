import java.util.Scanner;

public class Uni4Exe03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois valores");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1>num2){
            System.out.println("O valor " + num1 + " é maior que o valor " + num2);
        }else{
            System.out.println("O valor " + num2 + " é maior que o valor " + num1);
        }
        scan.close();
    }

}
