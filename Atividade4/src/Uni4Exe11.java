import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade de 3 irmãos");
        int irmao1 = scan.nextInt();
        int irmao2 = scan.nextInt();
        int irmao3 = scan.nextInt();

        if(irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3){
            System.out.println("Gêmeos");
        }else if(irmao1 == irmao2 && irmao1 == irmao3){
            System.out.println("Trigêmeos");
        }else{
            System.out.println("Apenas irmãos");
        }
        scan.close();
    }

}
