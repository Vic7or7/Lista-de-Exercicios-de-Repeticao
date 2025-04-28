public class ExercicioLoopsFor03{
    public static void main(String[] args) {
    
        int[] numeros = {5, 8, 12, 3, 7, 1, 9, 4, 6, 2};
        int soma = 0;
    
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos elementos do vetor é: " + soma);
    }
}
    

