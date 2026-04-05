    import java.util.Scanner;

    public class Uni4Exe08 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite uma letra");
            char letra = scan.next().toUpperCase().charAt(0);
            if(letra == 'A' || letra =='E' || letra =='I' || letra =='O' || letra =='U'){
                System.out.println("É vogal");
            }else{
                System.out.println("Não é vogal");
            }

            scan.close();
        }

    }
