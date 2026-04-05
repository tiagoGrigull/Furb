import java.util.Scanner;

public class Uni4Exe19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da coordenada X:");
        float x = scan.nextFloat();
        System.out.println("Informe o valor da coordenada Y:");
        float y = scan.nextFloat();

        if(x == 0 && y ==0){
            System.out.println("Quadrante 0");
        }else if(x>0 && y<  0){
            System.out.println("Quadrante 2");
        }else if(x<0 && y<0){
            System.out.println("Quadrante 3");
        }else if(x<0 && y>0){
            System.out.println("Quadrante 4");
        }
        
        scan.close();
    }

}
