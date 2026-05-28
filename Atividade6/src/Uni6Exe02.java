import java.util.Scanner;

public class Uni6Exe02 {
    Scanner sc = new Scanner(System.in);
    int quantidade = 12;
    double media = 0.0;
    public int[] valores = new int[quantidade];

    public void ler(){
        for (int i = 0; i < quantidade; i++) {
            valores[i] = sc.nextInt();
        }
    }

    public void media(){
        for (int i = 0; i < quantidade; i++) {
            media += valores[i];
        }
        media = media/quantidade;
        System.out.printf("Média = %.2f", media);
        System.out.println();
    }

    public void valoresMaioresMedia(){
        System.out.println("Valores maior que a média: ");
        for (int i = 0; i < quantidade; i++) {
            if(valores[i]> media){
                System.out.println(valores[i]);
            }
            
        }
    }

    public static void main(String[] args) {
        Uni6Exe02 exe02 = new Uni6Exe02();
        exe02.ler();
        exe02.media();
        exe02.valoresMaioresMedia();
    }


}
