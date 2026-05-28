import java.util.Scanner;

public class Uni6Exe03 {
    Scanner sc = new Scanner(System.in);
    int quantidade = 12;
    double media = 0.0;
    public int[] valores = new int[quantidade];

    public void ler() {
        for (int i = 0; i < quantidade; i++) {
            valores[i] = sc.nextInt();
        }
    }

    public void paridade() {
        for (int i = 0; i < quantidade; i++) {
            if (i % 2 == 0) {
                valores[i] += valores[i] * 0.2;
            } else {
                valores[i] += valores[i] * 0.5;
            }
        }
    }

    public void saida() {
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Posição " + i + "valor: " + valores[i]);
        }
    }

    public static void main(String[] args) {
        Uni6Exe03 uni03 = new Uni6Exe03();
        uni03.ler();
        uni03.paridade();
    }

}
