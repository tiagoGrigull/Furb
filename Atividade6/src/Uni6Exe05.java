import java.util.Scanner;

public class Uni6Exe05 {
    Scanner sc = new Scanner(System.in);

    int qtdPerguntas = 5;

    String[] meninoResp = new String[qtdPerguntas];
    String[] meninaResp = new String[qtdPerguntas];

    String[] perguntas = {
        "Gosta de musica sertaneja?",
        "Gosta de futebol?",
        "Gosta de seriados?",
        "Gosta de redes sociais?",
        "Gosta doa OktoberFest?"
    };

    int pontos = 0;

    public void entrada(){
        System.out.println("Responda apenas com: SIM, NÃO e IND (indiferente)");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.println("Resposta Menino: ");
            meninoResp[i] = sc.next().toUpperCase();
            System.out.println("Resposta Menina: ");
            meninaResp[i] = sc.next().toUpperCase();
        }
    }

    public void soma(){
        for (int i = 0; i < perguntas.length; i++) {
            if(meninaResp[i].equals(meninoResp[i])){
                pontos += 3;
            }else if(meninaResp[i].equals("IND") || meninoResp[i].equals("IND")){
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
