import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho da pilha: ");
        int capacidade = scanner.nextInt();
        Pilha pilha = new Pilha(capacidade);

        int opcao;
        do {
            System.out.println("1. Inserir elemento na pilha");
            System.out.println("2. Remover elemento da pilha");
            System.out.println("3. Visualizar elemento do topo");
            System.out.println("4. Exibir todos os elementos da pilha");;
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a ser inserido na pilha: ");
                    int valor = scanner.nextInt();
                    String resultadoInsercao = pilha.insere(valor);
                    System.out.println(resultadoInsercao);
                    break;
                case 2:
                    String resultadoRemocao = pilha.remove();
                    System.out.println(resultadoRemocao);
                    break;
                case 3:
                    if (pilha.vazia().equals("Pilha está vazia.")) {
                        System.out.println("Pilha está vazia.");
                    } else {
                        System.out.println("Elemento no topo: " + pilha.getDados()[pilha.getTopo()]);
                    }
                    break;
                case 4:
                    String elementos = pilha.imprime();
                    System.out.println(elementos);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 5);
    }
}
