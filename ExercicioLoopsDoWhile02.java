import java.util.Scanner;
public class ExercicioLoopsDoWhile02{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Ação de adicionar executada.");
                    break;
                case 2:
                    System.out.println("Ação de remover executada.");
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}

