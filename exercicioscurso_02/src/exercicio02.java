/*
Faça um programa que peça ao usuário para digitar um número. Se esse número for positivo, calcule a raiz quadrada do número.
Se o número for negativo, mostre uma mensagem dizendo que o número é inválido.
 */
import java.util.Scanner;
public class exercicio02 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("----- Números positivos -----");
        System.out.print("Digite um número real positivo ou negativo: ");
        float n1;
        n1 = Float.parseFloat(ler.nextLine());
        if (n1 > 0) {
            System.out.println("O número " + n1 + " é positivo e a raiz quadrada dele é " + Math.sqrt(n1) + ".");
        } else {
            System.out.println("O número " + n1 +  " é negativo, e portanto, inválido.");
        }
        ler.close();
    }
}