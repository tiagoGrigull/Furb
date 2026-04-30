public class Uni5Exe02 {
    public static void main(String[] args) {
        int par = 0;
        int impar = 0;
        for(int i = 1; i<101; i++){
            if(i % 2 == 0){
                par += i;
            }else{
                impar += i;
            }
        }
        System.out.println("Soma dos Números Pares: "+ par);
        System.out.println("Soma dos números impares: "+ impar);
    }

}
