import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[10];
        double[] notas = new double[10];


        for(int i=0; i<10; i++){
            System.out.println("Informe o nome "+i);
            nomes[i] = sc.next();
            System.out.println("Informe a nota "+i);
            notas[i] = sc.nextDouble();
        }

        double media = 0;
        for(int i = 0; i<10; i++){
            media += notas[i] ;
        }
        media = media/10;
        System.out.println("media das notas: "+media);
        sc.close();
    }

}