import java.util.Scanner;

public class Uni6Exe10 {
    private int[] vetor = new int[50];
    private Scanner sc = new Scanner(System.in);
    private int posicaoFim = 0;

    public Uni6Exe10() {
        int opcao;
        do {
            System.out.println("MENU");
            System.out.println("[1] Incluir valor");
            System.out.println("[2] Pesquisar valor");
            System.out.println("[3] Alterar valor");
            System.out.println("[4] Excluir valor");
            System.out.println("[5] Mostrar valores");
            System.out.println("[6] Ordenar valores");
            System.out.println("[7] Inverter valores");
            System.out.println("[8] Sair do sistema");
            System.out.print("Digite a opção:\n");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    inserirValor();
                    break;
                case 2:
                    pesquisarValor();
                    break;
                case 3:
                    alterarValor();
                    break;
                case 4:
                    excluirValor();
                    break;
                case 5:
                    mostrarValores();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Até logo");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        } while (opcao != 8);
    }

    private void inserirValor() {
        if (posicaoFim < vetor.length) {
            System.out.println("Digite um número:\n");
            int numero = sc.nextInt();
            vetor[posicaoFim] = numero;
            System.out.println("Número " + numero + " inserido na posição " + posicaoFim);
            posicaoFim++;
        } else {
            System.out.println("Vetor cheio");
        }
    }

    private void mostrarValores() {
        for (int i = 0; i < posicaoFim; i++) {
            System.out.print("| ");
            System.out.print(vetor[i] + " ");
        }
        System.out.println("| ");
    }

    private int pesquisarValor() {
        System.out.println("Digite um número para encontrar");
        int num = sc.nextInt();
        for (int i = 0; i < posicaoFim; i++) {
            if (num == vetor[i]) {
                System.out.println("Valor está na lista na posição " + i);
                return i;
            }
        }
        System.out.println("Valor não está na lista");

        return -1;
    }

    private void alterarValor() {
        int posicao = pesquisarValor();
        if (posicao != -1) {
            System.out.println("Informe o novo numero");
            vetor[posicao] = sc.nextInt();
        }
    }

    private void excluirValor() {
        int posicao = pesquisarValor();
        if (posicao != -1) {
            for (int i = 0; i < posicaoFim - 1; i++) {
                vetor[posicao] = vetor[posicao + 1];
            }
            posicaoFim--;
            System.out.println("Numero excluido");
        }
    }

    private void ordenarValores() {
        for (int i = 0; i < posicaoFim - 1; i++) {
            for (int j = 0; j < posicaoFim - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    private void inverterValores() {
        for (int i = 0; i < posicaoFim / 2; i++) {
            for (int j = 0; j < i; j++) {
                int aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
