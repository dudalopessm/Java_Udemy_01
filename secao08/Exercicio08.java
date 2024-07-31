package br.com.geekuniversity.secao08;
/*
2. Escreva um código Java que apresente a classe Moto, com atributos marca, modelo, cor e
marcha e os métodos imprimir e trocarMarcha. O método imprimir deve mostrar na tela os
valores de todos os atributos. O método trocarMarcha deverá aumentar ou diminuir a marca de
acordo com um valor informado. O atributo marcha indica em que marcha a Moto encontra-se no
momento, sendo representado de forma inteira, onde 0 – neutro, 1 – primeira, 2 – segunda, etc.
Adicione um método construtor que permita a definição de todos os atributos no momento da
instanciação do objeto. Crie um construtor para a classe permitindo a definição de todos os
atributos.
 */
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[]args) {
        System.out.println("----- Moto -----");
        Moto m1 = new Moto("Yamaha", "Fazer 250", "Preta", 0);
        m1.imprimir();
        System.out.println("~~~~~~~~~~~~~~~~");
        m1.trocarMarcha("aumentar", 2);
        m1.imprimir();
        System.out.println("~~~~~~~~~~~~~~~~");
        m1.trocarMarcha("diminuir", 1);
        m1.imprimir();
    }
}