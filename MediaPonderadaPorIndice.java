import java.util.Scanner;

public class MediaPonderadaPorIndice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaIndices = 0;
        int somaPonderada = 0;

        //  os 10 valores do usuário
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // A média ponderada pelos índices
        for (int i = 0; i < 10; i++) {
            somaPonderada += numeros[i] * i;
            somaIndices += i;
        }

        // Evitar divisão por zero
        if (somaIndices != 0) {
            double mediaPonderada = (double) somaPonderada / somaIndices;
            System.out.printf("Média ponderada pelos índices: %.2f\n", mediaPonderada);
        } else {
            System.out.println("Não é possível calcular a média ponderada (soma dos índices é zero).");
        }

        scanner.close();
    }
}
