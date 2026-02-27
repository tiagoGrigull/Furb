import java.util.Scanner;

public class exercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Idade
        /*System.out.println("informe a sua idade");
        int idade = scanner.nextInt();
        Idade(idade); */

        // Media Ponderada
        System.out.println("Nota da prova 1");
        float prova1 = scanner.nextFloat();
        System.out.println("Nota da prova 2");
        float prova2 = scanner.nextFloat();
        System.out.println("Nota do Trabalho Final");
        float tabalhoFinal = scanner.nextFloat();
        System.out.println("notas dos 7 trabalhos");
        float trabalho[] = new float[7];
            for (int i = 0; i < trabalho.length; i++) {
            System.out.println("Digite a nota do trabalho " + (i+1) + ": ");
            trabalho[i] = scanner.nextFloat();
        }

        MediaPonderada(prova1, prova2, tabalhoFinal, trabalho);
    }

    public static void Idade(int idade){
        if(idade >=18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
    }

    public static void MediaPonderada(float prova1, float prova2, float tFinal, float Trabalhos[]){
        float mediaTrabalhos = 0;
        for(int i = 0; i< Trabalhos.length; i++){
            mediaTrabalhos += Trabalhos[i];
        }
        mediaTrabalhos = mediaTrabalhos / Trabalhos.length;
        System.out.println("mediaTrabalhos"+mediaTrabalhos);

        //Calculo da média ponderada
        float media = ((prova1         * 0.2f) + 
                       (prova2         * 0.3f) + 
                       (tFinal         * 0.3f) + 
                       (mediaTrabalhos * 0.2f) );

        System.out.printf("A media é: %.2f%n \n" ,media);
        
        
    }
}
