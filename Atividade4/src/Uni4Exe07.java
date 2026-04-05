import java.util.Scanner;

public class Uni4Exe07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o peso da carta: ");
        float peso = scan.nextFloat();

        float valorPagar = 0;

        if(peso >= 50){
            float pesoExedido = peso - 50f;
            float qtdAdicional = (pesoExedido / 20) + 1;
            valorPagar = 0.45f + 045f * qtdAdicional;
        }else{
            valorPagar = 0.45f;
        }
        System.out.println("Custo do selo: "+ valorPagar);
        scan.close();
    }

}