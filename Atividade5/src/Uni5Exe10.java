import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdHoras = 16;

        int qtdBiscoitos = 0;

        for(int i = 0; i <qtdHoras; i++ ){

          

            qtdBiscoitos = qtdBiscoitos * 3;

        }

        System.out.println("qtd biscoitos quebrados: "+ qtdBiscoitos);

    }

}
