import java.util.Scanner;

public class Uni4Exe06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite : \nM\nF\nI");
        char sexo = scan.next().toUpperCase().charAt(0);

        switch (sexo) {
            case 'M':
            System.out.println("Masculino");
                break;
        
            case 'F':
                System.out.println("Feminino");
                break;

            case 'I':
                System.out.println("Não informado");
                break;
            default:
                System.out.println("Entrada incorreta");
        }
            scan.close();
        
    }
    

}
