import java.util.Scanner;

public class Q4 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();


        try {
            if (texto == null) {
                System.out.println("A string é null.");

                System.out.println("Comprimento: " + texto.length());
            }



        } catch (NullPointerException e) {
            System.out.println("Erro: não é possível acessar o comprimento de uma string null.");
        }
    }
}
