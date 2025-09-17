import java.util.Scanner;

public class VetorDobroValorAnterior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        // Ler o valor inicial
        System.out.print("Digite um valor inteiro: ");
        vetor[0] = scanner.nextInt();

        // Preencher o vetor com o dobro do valor anterior
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = vetor[i - 1] * 2;
        }

        // Mostrar os valores do vetor
        System.out.println("\nVetor resultante:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        scanner.close();
    }
}
