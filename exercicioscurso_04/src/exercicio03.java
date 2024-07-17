/*
Escreva um programa que leita uma matriz 5 x 5 e um valor X. O programa deverá fazer uma
busca desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma
mensagem de “não encontrado”.
 */
import java.util.Scanner;
public class exercicio03 {
    public static void main(String[]args) {
        System.out.println("----- Busca do valor X -----");
        int matriz[][] = new int[5][5];
        int i, j, X, cont = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite os elementos da matriz: ");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(ler.nextLine());
            }
        }
        //Preenchimento automático para testar o programa
        /*for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)Math.round(Math.random()*10);
            }
        }
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.println("Elemento [" + i + "][" + j + "]: " + matriz[i][j] + " .");
            }
        }*/
        System.out.print("Digite um valor X: ");
        X = Integer.parseInt(ler.nextLine());
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == X) {
                    System.out.println("A localização do elemento " + X + " é [" + i + "][" + j + "].");
                    cont = 1;
                }
            }
        }
        if (cont != 1) {
            System.out.println("Elemento não encontrado.");
        }
        ler.close();
    }
}