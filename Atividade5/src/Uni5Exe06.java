import java.util.Scanner;

public class Uni5Exe06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alturas = 0;
        for(int i = 0; i <20; i++ ){
            System.out.println("Altura da pessoa "+(i+1)+":");
            double altura = sc.nextDouble();
            alturas +=altura;
        }
        double media = alturas/20;
        System.out.println(media);

        sc.close();
    }
}
