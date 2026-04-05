import java.util.Scanner;

public class Uni4Exe25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números");

        int opcao = scan.nextInt();
        
        if(opcao >= 1 && opcao <= 4){
            System.out.println("Digite o primeiro número:");
            double num1 = scan.nextDouble();
            System.out.println("Digite o segundo número:");
            double num2 = scan.nextDouble();

            switch (opcao) {

                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    if(num2 != 0){
                        System.out.println("Resultado: " + (num1 / num2));
                    }else{
                        System.out.println("Erro: divisão por zero não é permitida.");
                    }
                    break;
            }
        }else{
            System.out.println("Opção inválida.");
        }

        scan.close();
    }
}