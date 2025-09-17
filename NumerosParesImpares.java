import java.util.Scanner;

public class NumerosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // 10 números do usuário
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // mostra os  números pares
        System.out.println("\nNúmeros pares:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        // apresenta os  números ímpares
        System.out.println("\nNúmeros ímpares:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}
