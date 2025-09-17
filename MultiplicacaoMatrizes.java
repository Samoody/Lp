import java.util.Scanner;

public class MultiplicacaoMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dimensões da primeira matriz
        System.out.print("Digite o número de linhas da matriz A: ");
        int m = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz A: ");
        int n = scanner.nextInt();

        // Dimensões da segunda matriz
        System.out.print("Digite o número de linhas da matriz B: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz B: ");
        int p = scanner.nextInt();

        // Verifica se a multiplicação é possível
        if (n != n2) {
            System.out.println("Multiplicação impossível: o número de colunas da matriz A deve ser igual ao número de linhas da matriz B.");
            return;
        }

        // Leitura da matriz A
        int[][] A = new int[m][n];
        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Leitura da matriz B
        int[][] B = new int[n2][p];
        System.out.println("Digite os elementos da matriz B:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        // Multiplicação das matrizes
        int[][] resultado = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Exibir resultado
        System.out.println("\nResultado da multiplicação (A x B):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
