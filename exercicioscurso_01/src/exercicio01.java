import java.util.Scanner;
//Faça um programa que leia um número inteiro e o imprima.
public class exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1;

        System.out.println("\n----- Impressao de valor digitado -----");
        System.out.print("\nDigite um número inteiro: ");

        n1 = Integer.parseInt(ler.nextLine());

        System.out.println("\nO número digitado foi " + n1 + ".");

        ler.close();
    }
}