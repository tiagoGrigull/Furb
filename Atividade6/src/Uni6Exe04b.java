import java.util.Scanner;

public class Uni6Exe04b {
    Scanner sc = new Scanner(System.in);
    int quantidade = 10;
    public int[] num1 = new int[quantidade];
    public int[] num2 = new int[quantidade];

    public int[] soma = new int[quantidade];

    public void ler(){
        for (int i = 0; i < quantidade; i++) {
            num1[i] = sc.nextInt();
            num2[i] = sc.nextInt();
        }
    }

    public void soma(){
        for (int i = 0; i < quantidade; i++) {
            soma[i] = num1[i] + num2[i];
        }
    }

    public void imprimir(){
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Numero 1: "+num1[i]+" Numero 2: "+num2[i]+" = "+soma[i]);
        }
    }

}
