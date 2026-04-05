import java.util.Scanner;

public class Uni4Exe01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com as horas trabalhadas no mês:");
        int horasMes = scan.nextInt();
        System.out.println("Entre com o valor pago por hora");
        int horasValor = scan.nextInt();

        int salarioTotal = horasMes * horasValor;
        if(horasMes>160){
            int salarioExtra = (horasMes - 160) * (horasValor/2);
            salarioTotal = salarioTotal + salarioExtra;
        }
            System.out.println("O salario total é: "+ salarioTotal);
            scan.close();

    }

}
