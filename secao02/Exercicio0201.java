package br.com.geekuniversity.secao02;
//Faça um programa que peça ao usuário para digitar dois números e mostre qual deles é o maior.
import java.util.Scanner;
public class Exercicio0201 {
    public static void main (String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("----- Qual é o maior número? -----");
        int n1, n2;
        System.out.print("Digite um número inteiro: ");
        n1 = Integer.parseInt(ler.nextLine());
        System.out.print("Digite outro número inteiro: ");
        n2 = Integer.parseInt(ler.nextLine());
        if (n1 > n2) {
            System.out.println("O número " + n1 + " é maior do que o número " + n2 + ".");
        } else if (n1 == n2) {
            System.out.println("O número " + n1 + " é igual ao número " + n2 + ".");
        } else {
            System.out.println("O número " + n1 + " é menor do que o número " + n2 + ".");
        }
        ler.close();
    }
}