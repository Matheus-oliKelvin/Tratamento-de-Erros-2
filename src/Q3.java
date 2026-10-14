import java.util.Scanner;

public class Q3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] vetorGenerico = {1,2,3,4,5};

        System.out.print("Digite o indice que deseja acessar: ");
        int indice  = sc.nextInt();

        acessarElemento(indice,vetorGenerico);

    }

    public static void acessarElemento (int indice, int[] vetor){
        int elemento = 0;
        try {
            elemento = vetor[indice];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("indice invalido!");
        }
        System.out.println(elemento);
    }
}
