/*
Escreva um programa que tenha uma função que recebe dois valores inteiros e retorna o maior.
 */
import java.util.Scanner;
public class exercicio03 {
    static int i;
    static Scanner ler = new Scanner(System.in);
    static int numeros[];
    static void receberdados(int quant) {
        numeros = new int[quant];
        for (i = 0; i < quant; i++) {
            System.out.println("Digite o " + (i+1) + " ° valor: ");
            numeros[i] = Integer.parseInt(ler.nextLine());
        }
    }
    static void mostravalores(int num[]) {
        for (i = 0; i < num.length; i++) {
            System.out.println(" "+ num[i]);
        }
    }
    static int maiorvalor(int num[]) {
        int controle = num[num.length-1];
        for (i = ((num.length)-1); i >= 0; i--) {
            if (controle <= num[i]) {
                controle = num[i];
            }
        }
        return controle;
    }
    public static void main(String[]args) {
        int quantidade, maior;
        System.out.println("----- Maior inteiro -----");
        System.out.print("Digite quantos valores inteiros deseja informar: ");
        quantidade = Integer.parseInt(ler.nextLine());
        receberdados(quantidade);
        System.out.println("Valores informados: ");
        mostravalores(numeros);
        maior = maiorvalor(numeros);
        System.out.println("O maior valor digitado foi: " + maior + " .");
        ler.close();
    }
}