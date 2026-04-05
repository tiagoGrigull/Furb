import java.util.Scanner;

public class Uni4Exe27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hora de chegada:");
        int horaChegada = scan.nextInt();
        int minChegada = scan.nextInt();

        System.out.println("Hora de saída:");
        int horaSaida = scan.nextInt();
        int minSaida = scan.nextInt();

        if(horaChegada < 0 || horaChegada > 23 || horaSaida < 0 || horaSaida > 23 ||
           minChegada < 0 || minChegada > 59 || minSaida < 0 || minSaida > 59){
            System.out.println("Horário inválido.");
            return;
        }

        int chegadaMin = horaChegada * 60 + minChegada;
        int saidaMin = horaSaida * 60 + minSaida;

        if(saidaMin <= chegadaMin){
            System.out.println("Horário de saída inválido.");
            return;
        }

        int tempoTotal = saidaMin - chegadaMin;

        int horas = tempoTotal / 60;
        int minutos = tempoTotal % 60;

        int horasCobradas;

        if(tempoTotal < 30){
            horasCobradas = 1;
        }else if(minutos >= 30){
            horasCobradas = horas + 1;
        }else{
            horasCobradas = horas;
        }

        double preco = 0;

        for(int i = 1; i <= horasCobradas; i++){
            if(i <= 2){
                preco += 5;
            }else if(i <= 4){
                preco += 7.5;
            }else{
                preco += 10;
            }
        }
        System.out.printf("Preço cobrado: R$ %.2f\n", preco);

        scan.close();
    }
}