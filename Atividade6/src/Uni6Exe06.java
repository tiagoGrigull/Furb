import java.util.Scanner;

public class Uni6Exe06 {
    Scanner sc = new Scanner(System.in);

    int num;

    int[] vetor;

    int num2;

    public void entradaVetor() {
        System.out.println("Informe um número. ");
        num = sc.nextInt();

        vetor = new int[num];

        System.out.println("Informe " + num + " números");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }
    }

    public void conferirNUm() {
        System.out.println("Informe um número");
        num2 = sc.nextInt();
        boolean existe = false;

        for (int i = 0; i < vetor.length; i++) {
            if (num2 == vetor[i]) {
                existe = true;
            }
        }

        if (existe) {
            System.out.println("O valor se encontra no vetor");
        } else {
            System.out.println("O valor não se encontra no vetor");
        }
    }

    public static void main(String[] args) {
        Uni6Exe06 exe6 = new Uni6Exe06();
        exe6.entradaVetor();
        exe6.conferirNUm();
    }

}
