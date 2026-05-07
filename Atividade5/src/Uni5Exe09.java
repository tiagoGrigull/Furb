import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros");
        int n = sc.nextInt();

        int Alunos20 = 0;
        String alunos18 = "";

        for(int i = 0; i<n; i ++){
            System.out.println("Nome: ");
            String nome= sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();

            if(idade > 20){
                Alunos20++ ;
            }

            if(idade == 18){
                alunos18 += nome + "\n";
            }

        }
        System.out.println("Nome dos alunos que tem 18 anos: \n"+ alunos18);
        System.out.println("Quantidade de alunos com idade superios a 20 anos: "+ Alunos20);

        sc.close();
    }

}
