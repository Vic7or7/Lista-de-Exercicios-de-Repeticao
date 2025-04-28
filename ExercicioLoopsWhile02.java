    import java.util.Scanner;

public class ExercicioLoopsWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int number = 0;

        System.out.println("Digite números positivos para somá-los. Digite um número negativo para encerrar.");

        System.out.print("Digite um número: ");
        number = scanner.nextInt();

        while (number >= 0){
            soma = soma + number;
            System.out.print("Digite um número: ");
            number = scanner.nextInt();
        }

        System.out.println("A soma dos números positivos é: " + soma);

        scanner.close();
    }
}

