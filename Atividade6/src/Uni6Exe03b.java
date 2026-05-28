import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe03b {
    Scanner sc = new Scanner(System.in);
    int tamanho = 12;
    ArrayList<Double> numeros = new ArrayList<>();

    public void ler() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um valor: ");
            numeros.add(sc.nextDouble());
        }
    }

        public void paridade() {
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                numeros.set(i, numeros.get(i)*1.02);
            } else {
                numeros.set(i, numeros.get(i)*1.05);
            }
        }
    }

    public void saida() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição " + i + "valor: " + numeros.get(i));
        }
    }

      public static void main(String[] args) {
        Uni6Exe03b uni03b = new Uni6Exe03b();
        uni03b.ler();
        uni03b.paridade();
        uni03b.saida();
    }

}
