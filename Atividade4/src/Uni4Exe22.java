import java.util.Scanner;

public class Uni4Exe22 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 1 para Ciências da Computação\n"+
                            "Digite 2 para Licenciatura em computação\n"+
                            "Digite 3 para Sistemas de Informação"
        );
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Bacharel em Ciências da Computação");
                break;

            case 2:
                System.out.println("Licenciado em Computação");
                break;
            
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        
            default:
                System.out.println("Número inválido");
                break;
        }

        scan.close();
    }

}
