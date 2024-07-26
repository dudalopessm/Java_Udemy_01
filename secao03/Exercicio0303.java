package br.com.geekuniversity.secao03;
/*
Faça um programa que declara um valor inteiro, inicialize-o com 0, incremente-o de 1000 em
1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).
 */
public class Exercicio0303 {
    public static void main(String[]args) {
        System.out.println("----- Impressão de 0 a 100000 de 1000 em 1000 -----");
        int n = 0;
        do {
            System.out.print(" " + n + " ");
            n = n + 1000;
        } while(n <= 100000);
    }
}