import java.util.Scanner;

public class Uni3Exe15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um valor inteiro de até 3 digitos: ");
        int valor = scan.nextInt();

        int centena = valor / 100;
        int dezena = (valor % 100) / 10;
        int uni = valor % 10;

        System.out.println("Centenas: "+ centena);
        System.out.println("Dezenas: "+ dezena);
        System.out.println("Unidade: "+ uni);
        scan.close();
    }

}
