import java.util.Scanner;

public class Exemplos {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        for(int x = 0; x< 3; x++){
            if(x==0){
                System.out.println(" _ _ _");
            }
            System.out.print("|");
            for(int y = 0; y<3; y++){
                System.out.print("_");
                System.out.print("|");
            }
            System.out.println("");

        }

        sc.close();
    }

}