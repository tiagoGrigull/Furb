import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe06b {
    Scanner sc = new Scanner(System.in);

    int num;

    ArrayList<Integer> arrayList = new ArrayList<>();

    int num2;

    public void entradaVetor(){
        System.out.println("Informe um número. ");
        num = sc.nextInt();

        System.out.println("Informe "+ num+ " números");
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.add(sc.nextInt());
        }
    }

    public void conferirNUm(){
        System.out.println("Informe um número");
        num2 = sc.nextInt();

        for (int i = 0; i < num; i++) {
            if(num2 == arrayList.get(i)){
                System.out.println("O valor se encontra no vetor");
            }else {
                System.out.println("O valor não se encontra no vetor");
            }
            
        }
    }

    public static void main(String[] args) {
        Uni6Exe06  exe6 = new Uni6Exe06();
        exe6.entradaVetor();
        exe6.conferirNUm(); 
    }

}
