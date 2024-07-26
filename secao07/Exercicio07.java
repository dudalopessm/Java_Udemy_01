package br.com.geekuniversity.secao07;
/*
1. Escreva um código Java que tenha a classe Quadrado, com atributos lado, área e perímetro e
os métodos calcularArea, calcularPerimetro e imprimir. Adicione um método construtor que
permita a definição de todos os atributos no momento da instanciação do objeto. Crie um
programa para testar a classe. Para encontrar a área usamos a fórmula (lado * lado) e o
perímetro (4 * lado).
 */
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("----- Cálculo de quadrados -----");
        int l;
        System.out.print("\nDigite o lado do quadrado: ");
        l = Integer.parseInt(ler.nextLine());
        Quadrado q1 = new Quadrado(l, l, l);
        System.out.println("\nO perímetro do quadrado é: " + q1.calcularPerimetro(q1.getLado()) + ".");
        System.out.println("A área do quadrado é: " + q1.calcularArea(q1.getLado()) + ".");
        System.out.println(q1);
        ler.close();
    }
}