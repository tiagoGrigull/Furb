import java.util.ArrayList;
import java.util.Scanner;

public class Uni6Exe05b {
    Scanner sc = new Scanner(System.in);

    int qtdPerguntas = 5;

    ArrayList<String> meninoResp = new ArrayList<>(); 
    ArrayList<String> meninaResp = new ArrayList<>(); 
    
    ArrayList<String> perguntas = new ArrayList<>();

    int pontos = 0;

    public void entrada(){
        perguntas.add("Gosta de musica sertaneja?");
        perguntas.add("Gosta de futebol?");
        perguntas.add("Gosta de seriados?");
        perguntas.add("Gosta de redes sociais?");
        perguntas.add("Gosta doa OktoberFest?");
        System.out.println("Responda apenas com: SIM, NÃO e IND (indiferente)");
        for (int i = 0; i < 5; i++) {
            System.out.println(perguntas.get(i));
            System.out.println("Resposta Menino: ");
            meninoResp.add(sc.next().toUpperCase());
            System.out.println("Resposta Menina: ");
            meninaResp.add(sc.next().toUpperCase());
        }
    }

    public void soma(){
        for (int i = 0; i < perguntas.size(); i++) {
            if(meninaResp.get(i) == meninoResp.get(i)){
                pontos += 3;
            }else if(meninaResp.get(i) == "IND" || meninoResp.get(i) =="IND"){
                pontos += 1;
            }else{
                pontos -= 2;
            }  
        }
    }

    public void resultado(){
        if(pontos == 15){
            System.out.println("Casem");
        }else if(pontos < 15 && pontos >= 10){
            System.out.println("Vocês tem coisas em comum");
        }else if(pontos < 10 && pontos >= 5 ){
            System.out.println("Talvez não de certo :(");
        }else if(pontos < 5 && pontos >= 0){
            System.out.println("Vale um encontro");
        }else if(pontos < 0 && pontos >= -9){
            System.out.println("Melhor não perder tempo");
        }else if(pontos < -10 ){
            System.out.println("Vocês se odeiam");
        }
    
    }

    public static void main(String[] args) {
        Uni6Exe05 exe5 = new Uni6Exe05();
        exe5.entrada();
        exe5.soma();
        exe5.resultado();
    }

}
