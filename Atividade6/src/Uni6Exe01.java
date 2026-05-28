import java.util.Scanner;

public class Uni6Exe01 {
    Scanner sc = new Scanner(System.in);
    public int tamanho = 10;
    public int[] num = new int[tamanho];

    

    public void ler() {
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt();
        }
    }

    public void escreverOrdemInversa() {

        for (int i = 9; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        Uni6Exe01 exe01 = new Uni6Exe01();
        exe01.ler();
        exe01.escreverOrdemInversa();
    }
}