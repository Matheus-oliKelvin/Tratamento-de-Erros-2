import java.util.Scanner;

public class Q12 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o CPF (000.000.000-00): ");
            String cpf = scanner.nextLine();

            if (cpf == null || cpf.trim().isEmpty()) {
                throw new IllegalArgumentException("O CPF não pode ser vazio!");
            }

            if (cpf.length() != 14) {
                throw new IllegalArgumentException(
                        "O CPF deve ter 14 caracteres!"
                );
            }

            if (!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
                throw new IllegalArgumentException(
                        "Formato inválido! Use 000.000.000-00."
                );
            }

            System.out.println("Formato do CPF válido!");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());

        }
    }
}
