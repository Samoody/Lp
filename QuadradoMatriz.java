import java.util.Scanner;

public class QuadradoMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        do {
            System.out.print("Digite o valor de N (2 ≤ N ≤ 5): ");
            N = scanner.nextInt();
        } while (N < 2 || N > 5);

        int[][] matriz = new int[N][N];
        int valor = 1;

        // Preenche com valores de 1 até N^2
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor++;
            }
        }

        // Multiplica matriz por ela mesma
        int[][] resultado = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    resultado[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        // Exibe o resultado
        System.out.println("Quadrado da matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
