import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 20; i++){
            int num = scan.nextInt();
            if(num % 2 == 0){
                System.out.println("Par");
            }else{
                System.out.println("Impar");
            }
        }
        scan.close();
    }

}
