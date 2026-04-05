import java.util.Scanner;

public class Uni4Exe12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o comprimento do lado 1");
        int lado1 = scan.nextInt();
        System.out.println("Entre com o comprimento do lado 2");
        int lado2 = scan.nextInt();
        System.out.println("Entre com o comprimento do lado 3");
        int lado3 = scan.nextInt();

        if(lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2) ){
            if(lado1 == lado2 && lado1 == lado3){
                System.out.println("Triângulo Equilatero");
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                System.out.println("Triângulo isósceles");
            }else{
                System.out.println("triângulo escaleno");
            }
        }{
            System.out.println("Não forma um triangulo");
        }

        scan.close();

    }

}
