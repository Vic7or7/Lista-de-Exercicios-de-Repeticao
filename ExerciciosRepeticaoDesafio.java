import java.util.Scanner;
public class ExerciciosRepeticaoDesafio {

    public static double calcularSimples(double p, double r, int t) {
        return p * (1 + (r / 100) * t);
    }

    public static double calcularComposta(double p, double r, int t) {
        return p * Math.pow((1 + r / 100), t);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Calculadora de Rendimento Financeiro");

            // Solicita os dados ao usuário
            System.out.print("Digite o valor do investimento inicial (P): ");
            double p = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual (r): ");
            double r = scanner.nextDouble();

            System.out.print("Digite o período de investimento em anos (t): ");
            int t = scanner.nextInt();

            System.out.print("Digite o tipo de capitalização (simples ou composta): ");
            String tipo = scanner.next().toLowerCase();

            double montante;

            // Calcula o montante com base na escolha do tipo de capitalização
            if (tipo.equals("simples")) {
                montante = calcularSimples(p, r, t);
            } else if (tipo.equals("composta")) {
                montante = calcularComposta(p, r, t);
            } else {
                System.out.println("Opção de capitalização inválida. Tente novamente.");
                continue;
            }

            // Exibe o resultado
            System.out.printf("O valor do montante ao final do período será: R$ %.2f%n", montante);

            // Pergunta ao usuário se deseja realizar outro cálculo
            System.out.print("Deseja realizar outro cálculo? (sim/não): ");
            String resposta = scanner.next().toLowerCase();
            continuar = resposta.equals("sim");
        }

        System.out.println("Encerrando o programa.");
        
        scanner.close();
    }
}
