
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    static void main() {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("Digite o primeiro numero inteiro: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo numero inteiro: ");
            int num2 = sc.nextInt();

            System.out.println("A divisão do primeiro pelo segundo é: " + num1 / num2  );
        }catch (ArithmeticException e ){
            System.out.println("Erro de Divisão por 0");
        } catch (InputMismatchException e) {
            System.out.println("Erro de tipo de Dado");
        }


    }
}
