import java.util.Scanner;

public class Uni5Exe08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de números");
        int n = sc.nextInt();

        int qtdP = 0;
        int negativos = 0;
        
        for(int i = 0; i<n; i++){
            System.out.println("Informe o numero");
            int num = sc.nextInt();

            if(num > 0){
                qtdP+= num ;
            }
            

            if(num < 0){
                negativos = num;
            }

            if(num < negativos){
                negativos = num;
            }

        }
        
        double mediaP = qtdP/n;

        System.out.println("Menor número negativo: " + mediaP);
        System.out.println("Média dos numeros positivos: "+negativos);

        sc.close();
    }
}
