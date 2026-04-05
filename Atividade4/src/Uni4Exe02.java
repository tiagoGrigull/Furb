import java.util.Scanner;

public class Uni4Exe02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre co um valor inteiro maior que 0: ");
        int valor = scan.nextInt();
        if(valor % 2 == 0){
            System.out.println("Número é par");
        }else{
            System.out.println("Número é par");
        }
        scan.close();
    }

}
