import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("A cor é azul?");
        String respostas = scan.nextLine().toUpperCase();
        boolean resposta;

        if(respostas.equals("SIM")){
            resposta = true;
        }else{
            resposta = false;
        }

        if(resposta){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
        scan.close();
    }

}

  
