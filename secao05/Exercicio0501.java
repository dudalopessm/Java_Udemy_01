package br.com.geekuniversity.secao05;
/*
Faça um programa que possua uma função que recebe como parâmetro um número inteiro e devolve seu dobro.
 */
import java.util.Scanner;
public class Exercicio0501 {
    static int dobro(int n1) {
        return (n1*2);
    }
    public static void main(String[]args) {
        System.out.println("----- Dobro de um inteiro -----");
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.print("Digite um número inteiro: ");
        n = Integer.parseInt(ler.nextLine());
        System.out.println("O dobro do número " + n + " é " + dobro(n) + " .");
        ler.close();
    }
}