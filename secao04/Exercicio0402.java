package br.com.geekuniversity.secao04;
/*
Faça um programa que leia uma matriz 4 x 4, conte e escreva quantos valores maiores que 10 ela possui.
 */
import java.util.Scanner;
public class Exercicio0402 {
    public static void main(String[]args) {
        System.out.println("----- Matriz com valores condicionais -----");
        Scanner ler = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int i, j, cont = 0;
        System.out.println("Digite os elementos da matriz: ");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(ler.nextLine());
            }
        }
        System.out.println("Os elementos maiores que 10 da matriz são: ");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 10) {
                    cont++;
                    System.out.print(" " + matriz[i][j]);
                }
            }
        }
        System.out.print("\n");
        System.out.println("Há " + cont + " elementos maiores que 10 na matriz.");
        ler.close();
    }
}