//Faça um programa que peça ao usuário para digitar um número e diga se o número digitado é par ou ímpar.
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("----- Paridade de números -----");
        System.out.print("Digite um número inteiro: ");
        int n1;
        n1 = Integer.parseInt(ler.nextLine());
        if (n1 % 2 == 0) {
            System.out.println("O número " + n1 + " é par.");
        } else {
            System.out.println("O número " + n1 + " é ímpar.");
        }
        ler.close();
    }
}