import java.util.Scanner;

public class Uni6Exe07 {
    Scanner sc = new Scanner(System.in);

    int num;

    int[] vetor;

    public void entrada(){
        System.out.println("Informe um valor>: ");
        num = sc.nextInt();

        if(num > 20){
            System.out.println("Número invalido");
        }else{
             System.out.println("Insira "+ num+ " valores para preencher o vetor");
             
             vetor = new int[num];
             for (int i = 0; i < vetor.length; i++) {
                vetor[i] = sc.nextInt();
                
                

                }
             }

        }
    }