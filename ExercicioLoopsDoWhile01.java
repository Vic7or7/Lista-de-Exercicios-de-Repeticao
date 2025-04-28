import java.util.Scanner;

public class ExercicioLoopsDoWhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número entre 1 e 100: ");
            numero = scanner.nextInt();
            if (numero < 1 || numero > 100) {
                System.out.println("Número inválido. Tente novamente.");
            }
        } while (numero < 1 || numero > 100);

        System.out.println("Número validado: " + numero);

        scanner.close();
    }
}
