import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor de entrada
        System.out.print("Digite um número inteiro n (0 <= n <= 93): ");
        int n = scanner.nextInt();

        // Validar o intervalo (até 93 para não ultrapassar o limite de long)
        if (n < 0 || n > 93) {
            System.out.println("Valor fora do intervalo permitido. Use de 0 até 93.");
            return;
        }

        // Cálculo iterativo da sequência de Fibonacci
        long a = 0, b = 1, resultado = 0;

        if (n == 0) {
            resultado = 0;
        } else if (n == 1) {
            resultado = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                resultado = a + b;
                a = b;
                b = resultado;
            }
        }

        // Mostrar o resultado
        System.out.println("F(" + n + ") = " + resultado);

        scanner.close();
    }
}
