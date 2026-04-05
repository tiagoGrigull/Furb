import java.util.Scanner;

public class Uni4Exe21 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo de IMC");
        System.out.println("Informe o seu peso: ");
        float peso = scan.nextFloat();
        System.out.println("Informe a sua altura: ");
        float altura = scan.nextFloat();

        float imc = peso / altura*altura;

        if(imc < 18.5){
            System.out.println("Magreza");
        }else if(imc >= 18.5 && imc < 24.9){
            System.out.println("Saudável");
        }else if(imc >= 25.0 && imc < 29.9){
            System.out.println("Sobrepeso");
        }else if(imc >= 30 && imc < 34.9){
            System.out.println("Obesidade Grau 1");
        }else if(imc >= 35.0 && imc < 39.9){
            System.out.println("Obesidade Grau 2");
        }else if(imc >= 40){
            System.out.println("Obsidade Grau3 (Mórbida)");
        }

        scan.close();
    }

}
