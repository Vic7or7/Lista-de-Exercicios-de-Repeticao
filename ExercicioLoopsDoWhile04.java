import java.util.Scanner;
public class ExercicioLoopsDoWhile04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaNotas = 0;
        int quantidadeNotas = 0;
        String resposta;

        do {
            System.out.print("Digite uma nota (0 a 10): ");
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                somaNotas += nota;
                quantidadeNotas++;
            } else {
                System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("s"));

        if (quantidadeNotas > 0) {
            double media = somaNotas / quantidadeNotas;
            System.out.printf("A média das notas é: ", media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}


