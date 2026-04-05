import java.util.Scanner;

public class Uni4Exe10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a idade de Zezinho");
        int zIdade = scan.nextInt();
        System.out.println("Digite a idade de Marquinhos");
        int mIdade = scan.nextInt();
        System.out.println("Dite a idade de Luluzinha");
        int lIdade = scan.nextInt();

        if (zIdade > mIdade) { 
            System.out.println("O caçula é o Marquinhos");
        }
        if (mIdade > lIdade) {
            System.out.println("O caçula é a Luluzinha");
        }else{
            System.out.println("O caçula é o Zezinho");
        }

        scan.close();
    }

}
