import java.util.Scanner;

public class Uni4Exe20 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota das 3 provas e anota da média dos exercícios de um aluno");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();
        float notaExercicios = scan.nextFloat();

        float media = nota1 + nota2*2 + nota3*3 + notaExercicios;

        if(media>= 9.0){
            System.out.printf("A média foi: %.2f", media , " Conceito = A");
        }else if(media >= 7.5 && media < 9.0){
            System.out.printf("A média foi: %.2f" , media , " Conceito = B");
        }else if(media>= 6.0 && media <7.5){
            System.out.printf("A média foi: %.2f" , media , " Conceito = C");
        }else if(media >= 4.0 && media < 6.0){
            System.out.printf("A média foi: %.2f" , media , " Conceito = D");
        }else if(media < 4){
            System.out.println("A média foi: Conceito = E");
        }

        scan.close();
    }

}
