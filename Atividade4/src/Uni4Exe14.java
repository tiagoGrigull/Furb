import java.util.Scanner;

public class Uni4Exe14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = scan.nextInt();

        System.out.println("Digite o mês: ");
        int mes = scan.nextInt();

        System.out.println("Digite o ano: ");
        int ano = scan.nextInt();

        if(dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0){

            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 ||mes == 10 || mes == 12 ){
                if(dia <=31){
                    System.out.println("Valida");
                }else{
                    System.out.println("Não valido");
                }
            }else
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
                if(dia<=30){
                    System.out.println("Valido");
                }else{
                    System.out.println("Não valido");
                }

            }else
             if (mes != 2 && dia <30) {
                        System.out.println("Valida");
                    } else {
                        System.out.println("Nao valida");
                    }

        }


        scan.close();
    }

}
