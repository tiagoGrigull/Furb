import java.util.Scanner;

public class Uni3Exe12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = scan.nextLine();
        System.out.println("Quantidade de horas trabalhadas no mês: ");
        float horasT = scan.nextFloat();
        System.out.println("Número de dependentes");
        int numDepen = scan.nextInt();

        float salHora = 10.00f;
        float valorDepen = 60.00f;
        float descontos = 0.85f;

        float salBruto = horasT*salHora + valorDepen * numDepen;
        float salLiqui = salBruto + (salBruto*descontos);

        System.out.printf("O funcionario" + nome + "possui um salário bruto de: R$ %.2f",  salLiqui );

        scan.close();
    }

}
