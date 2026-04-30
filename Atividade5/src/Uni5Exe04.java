public class Uni5Exe04 {
    public static void main(String[] args) {
        
        double resposta = 0;
        
        for(int i = 1 ; i <=20 ; i++){
            double nominador = 2* i + 1;
            double denominador = i *(i+1);
            resposta += nominador/denominador;
        }
        System.out.println(resposta);
    }

}
