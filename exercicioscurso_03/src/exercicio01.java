/*
Faça um programa que determine e mostre os cinco primeiros múltiplos de 3, considerando números maiores que 0.
 */
public class exercicio01 {
    public static void main(String[]args) {
        System.out.println("----- Cinco primeiros múltiplos de 3 -----");
        int i, n = 0;
        for (i = 0; n < 5; i++) {
            if (i % 3 == 0) {
                System.out.println("O número " + (i) + " é o " + (n+1) + "° múltiplo de 3.");
                n++;
            }
        }
    }
}