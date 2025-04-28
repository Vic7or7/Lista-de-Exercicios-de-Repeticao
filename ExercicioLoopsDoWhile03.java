import java.util.Scanner;
import java.util.Random;

public class ExercicioLoopsDoWhile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSorteado = random.nextInt(20) + 1; 
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 20!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSorteado) {
                System.out.println("Seu palpite é maior que o número sorteado.");
            } else if (palpite < numeroSorteado) {
                System.out.println("Seu palpite é menor que o número sorteado.");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou o número " + numeroSorteado + " em " + tentativas + " tentativa(s).");

        scanner.close();
    }
}


