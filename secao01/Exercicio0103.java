package br.com.geekuniversity.secao01;
//Faça um programa que peça ao usuário para digitar um número real e imprima o resultado do quadrado desse número.
import java.util.Scanner;
public class Exercicio0103 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1;
        System.out.println("\n----- Número ao quadrado -----");
        System.out.print("\nDigite um número real: ");
        n1 = Float.parseFloat(ler.nextLine());
        System.out.println("\nEsse número ao quadrado é " + (n1*n1) + ".");
        ler.close();
    }
}
