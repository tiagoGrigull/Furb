import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd = sc.nextInt();
        int num = 8;
        for(double i=0; i<=qtd; i++){
            if(i % 2 == 0){
                num += 2;
                System.out.println("par"+num);
        }else{
            num *= 2;
            System.out.println("impar"+num);
        }
        
    }

    sc.close();
}
}
