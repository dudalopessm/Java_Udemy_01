/*
Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A primeira vez,
deve usar a estrutura de repetição for, a segunda while e a terceira do while.
 */
public class exercicio02 {
    public static void main(String[]args) {
        System.out.println("----- Impressão de 1 a 100 -----");
        int n = 1, i;
        System.out.println("Usando estrutura de repetição for: ");
        for (i = 0; i < 100; i++) {
            System.out.print(" " + n + " ");
            n++;
        }
        System.out.print("\n");
        System.out.println("Agora, com a estrutura while: ");
        n = 1;
        while (n <= 100) {
            System.out.print(" " + n + " ");
            n++;
        }
        System.out.print("\n");
        System.out.println("Por fim, com a estrutura do-while: ");
        n = 1;
        do {
            System.out.print(" " + n + " ");
            n++;
        } while (n <= 100);
    }
}