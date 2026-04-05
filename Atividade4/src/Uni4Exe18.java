import java.util.Scanner;

public class Uni4Exe18 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dia do vencimento: ");
        int vencimento = scan.nextInt();
        System.out.println("Dia do pagamento");
        int pagamento = scan.nextInt();
        System.out.println("Valor da prestação");
        float valor = scan.nextFloat();

        if (pagamento <= vencimento) {
            valor *= 0.9f;
            System.out.println("Pagamento está em dia. O valor da prestação = "+ valor);
        } else if (pagamento <= vencimento + 5) {
            System.out.println("Pagamento está atrasado. Desconto perdido.");
        } else {
            int diasAtraso = pagamento - vencimento;
            float multa = diasAtraso * 0.02f;
            valor *= (1 + multa);
        }
        System.out.println("Pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação" + valor);

        scan.close();
    }

}
