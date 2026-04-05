import java.util.Scanner;

public class Uni3Exe04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe as 3 notas de um aluno: ");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();

        float mediaP = nota1 * 0.5f + nota2 * 0.3f + nota3 * 0.2f;

        System.out.printf("Amedia do aluno é: %.2f", mediaP);

        scan.close();
    }

}
