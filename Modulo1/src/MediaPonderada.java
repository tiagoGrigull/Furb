import java.util.Scanner;

public class MediaPonderada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Nota da prova1");
        float prova1 = scan.nextInt();
        System.out.println("Nota da prova2");
        float prova2 = scan.nextInt();
        System.out.println("Nota do Trabalho final");
        float tF = scan.nextInt();

        System.out.println("Nota do Trabalho 1");
        float t1 = scan.nextInt();    
        System.out.println("Nota do Trabalho 2");
        float t2 = scan.nextInt();    
        System.out.println("Nota do Trabalho 3");
        float t3 = scan.nextInt();    
        System.out.println("Nota do Trabalho 4");
        float t4 = scan.nextInt();    
        System.out.println("Nota do Trabalho 5");
        float t5 = scan.nextInt();    
        System.out.println("Nota do Trabalho 6");
        float t6 = scan.nextInt();    
        System.out.println("Nota do Trabalho 7");
        float t7 = scan.nextInt();    
        float mediaT = (t1+t2+t3+t4+t5+t6+t7)/7;

        float media = (prova1 * 0.2f +
                      prova2 * 0.3f +
                      tF     * 0.3f +
                      mediaT * 0.2f);

        System.out.println("A media é "+ media);

        if(media>6){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }


    }
}
