import java.util.Scanner;
// Faça um programa que peça ao usuário para digitar três valores inteiros e imprima a soma deles.
public class exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1, n2, n3;

        System.out.println("\n----- Soma entre três números -----");
        System.out.print("\nDigite o primeiro número: ");

        n1 = Integer.parseInt(ler.nextLine());

        System.out.print("\nDigite o segundo número: ");

        n2 = Integer.parseInt(ler.nextLine());

        System.out.print("\nDigite o terceiro número: ");

        n3 = Integer.parseInt(ler.nextLine());

        System.out.println("\nA soma entre esses números é " + (n1+n2+n3) + ".");

        ler.close();
    }
}