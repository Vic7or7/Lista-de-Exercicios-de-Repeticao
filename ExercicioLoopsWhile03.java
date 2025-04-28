import java.util.Scanner;

public class ExercicioLoopsWhile03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada; 

        System.out.println("Digite a senha para obter acesso:");

        System.out.print("Senha: ");
        senhaDigitada = scanner.nextLine();

        while (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Senha incorreta, tente novamente.");
            System.out.print("Senha: ");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Acesso concedido.");

        scanner.close();
    }
}

