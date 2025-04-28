public class ExercicioLoopsWhile04 {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        int contador = 0;
        int limite = 10;
        
        System.out.println("Sequência de Fibonacci:");

        while (contador < limite) {
            if (contador == 0) {
                System.out.print(primeiro);
            } else if (contador == 1) {
                System.out.print(", " + segundo);
            } else {
                int proximo = primeiro + segundo;
                System.out.print(", " + proximo);
                primeiro = segundo;
                segundo = proximo;
            }
            contador++;
        }
    }
}

