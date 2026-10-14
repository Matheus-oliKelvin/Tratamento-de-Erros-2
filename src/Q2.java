import java.util.Scanner;

public class Q2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

       try{
            System.out.print("Digite uma String de um número ");
            String palavra = sc.nextLine();

            int palavraEmNumero = Integer.parseInt(palavra);

            System.out.println("A conversão deu certo! numero: " + palavraEmNumero);
       }catch (NumberFormatException e){
           System.out.println("A conversão dessa String não pode ser feita!");
       }

    }
}
