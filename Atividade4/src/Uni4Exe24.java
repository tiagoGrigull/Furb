import java.util.Scanner;

public class Uni4Exe24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva 3 valores");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("Escolha uma opção: \n1- Escrever os valores em ordem crescente"+
                                                "2- Escrever os valores em  ordem decfescente"+
                                                "3- Escrever os 3 valores de forma que o maior fique no meio"
        );




        
        int escolha = scan.nextInt();
        switch (escolha) {
            case 1:
                        if(num1 > num2 && num2 > num3){
        System.out.println(num1 + " " + num2 + " " + num3);
        }else if(num1 > num3 && num3 > num2){
        System.out.println(num1 + " " + num3 + " " + num2);
        }else if(num2 > num1 && num1 > num3){
        System.out.println(num2 + " " + num1 + " " + num3);
        }else if(num2 > num3 && num3 > num1){
        System.out.println(num2 + " " + num3 + " " + num1);
        }else if(num3 > num1 && num1 > num2){
        System.out.println(num3 + " " + num1 + " " + num2);
        }else if(num3 > num2 && num2 > num1){
        System.out.println(num3 + " " + num2 + " " + num1);
        }
                break;

            case 2:
                        if(num1 < num2 && num2 < num3){
        System.out.println(num1 + " " + num2 + " " + num3);
        }else if(num1 < num3 && num3 < num2){
        System.out.println(num1 + " " + num3 + " " + num2);
        }else if(num2 < num1 && num1 < num3){
        System.out.println(num2 + " " + num1 + " " + num3);
        }else if(num2 < num3 && num3 < num1){
        System.out.println(num2 + " " + num3 + " " + num1);
        }else if(num3 < num1 && num1 < num2){
        System.out.println(num3 + " " + num1 + " " + num2);
        }else if(num3 < num2 && num2 < num1){
        System.out.println(num3 + " " + num2 + " " + num1);
        }
                break;

            case 3:
                        if(num1 > num2 && num2 > num3){
        System.out.println(num2 + " " + num1 + " " + num3);
        }else if(num1 > num3 && num3 > num2){
        System.out.println(num3 + " " + num1 + " " + num2);
        }else if(num2 > num1 && num1 > num3){
        System.out.println(num1 + " " + num2 + " " + num3);
        }else if(num2 > num3 && num3 > num1){
        System.out.println(num3 + " " + num2 + " " + num1);
        }else if(num3 > num1 && num1 > num2){
        System.out.println(num1 + " " + num3 + " " + num2);
        }else if(num3 > num2 && num2 > num1){
        System.out.println(num2 + " " + num3 + " " + num1);
        }
                break;
        
            default:
                break;
        }
        scan.close();
    }

}
