import java.util.Scanner;

public class VetorMetadeAnterior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] N = new double[100];

        // Ler o valor inicial
        System.out.print("Digite o valor inicial (X): ");
        N[0] = scanner.nextDouble();

        // Preencher o vetor: cada posição é a metade da anterior
        for (int i = 1; i < N.length; i++) {
            N[i] = N[i - 1] / 2.0;
        }

        // Imprimir o vetor
        System.out.println("\nVetor N:");
        for (int i = 0; i < N.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, N[i]);
        }

        scanner.close();
    }
}
