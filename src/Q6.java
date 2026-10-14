import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double n1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double n2 = scanner.nextDouble();

            System.out.print("Digite a operação (+, -, *, /): ");
            String operacao = scanner.next();

            switch (operacao) {
                case "+":
                    System.out.println("Resultado: " + (n1 + n2));
                    break;

                case "-":
                    System.out.println("Resultado: " + (n1 - n2));
                    break;

                case "*":
                    System.out.println("Resultado: " + (n1 * n2));
                    break;

                case "/":
                    if (n2 == 0) {
                        throw new ArithmeticException("Divisão por zero!");
                    }
                    System.out.println("Resultado: " + (n1 / n2));
                    break;

                default:
                    throw new IllegalArgumentException("Operação inválida!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite valores numéricos!");

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        }
    }
}
