import java.util.Scanner;

public class Uni3Exe16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        int valorCompra = scan.nextInt();
        System.out.print("Valor pago pelo cliente: ");
        int valorCliente = scan.nextInt();

        if (valorCliente < valorCompra) {
            System.out.println("Pagamento inválido");
        } else {

            int troco = valorCliente - valorCompra;

            int notas100 = troco / 100;
            int resto = troco % 100;
            int notas10 = resto / 10;
            resto = resto % 10;
            int notas1 = resto;

            int totalNotas = notas100 + notas10 + notas1;

            System.out.println("Troco: " + troco);
            System.out.println("Número mínimo de notas: " + totalNotas);
            System.out.println("Notas de 100: " + notas100);
            System.out.println("Notas de 10: " + notas10);
            System.out.println("Notas de 1: " + notas1);
        }

        scan.close();
    }
}