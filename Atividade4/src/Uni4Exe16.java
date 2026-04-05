import java.util.Scanner;

public class Uni4Exe16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade de 2 homens");
        int homem1 = scan.nextInt();
        int homem2 = scan.nextInt();

        System.out.println("Digite a idade de 2 mulheres");
        int mulher1 = scan.nextInt();
        int mulher2 = scan.nextInt();

        int soma = 0;
        int produto = 0;

        if(homem1 > homem2){
            soma += homem1;
            produto += homem2;
        }else{
            soma += homem2;
            produto += homem1;
        }

        if(mulher1 > mulher2){
            soma += mulher1;
            produto *= mulher2 ;
        }else{
            soma += mulher2;
            produto *= mulher1;
        }
        
        System.out.println("Soma: " + soma + "\nProduto: " + produto);
        scan.close();
    }

}
