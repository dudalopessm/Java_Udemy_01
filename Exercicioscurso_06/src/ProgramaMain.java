/*
    1. Crie uma classe para representar um contato, com os atributos privados de nome, email e
telefone. Crie os métodos públicos necessários para sets e gets e também um método para
imprimir os dados de uma pessoa. Crie também um programa, instancie um objeto desta classe
e imprima os dados do objeto.
    2. Crie uma classe Agenda que pode armazenar contatos, podendo realizar as seguintes
operações:
- void armazenarContato(Contato contato);
- void removeContato(Contato contato);
- int buscaContato(String nome); // Informa em que posição da agenda está o contato.
- void imprimeAgenda(); // Imprime os dados de todos os contatos da agenda.
- void imprimeContato(int index); // Imprime os dados do contato que está no índice informado.

 */
import java.util.Scanner;
public class ProgramaMain {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[]args) {
        String nom, em, tel;
        Agenda minhaAgenda = new Agenda();
        System.out.println("----- Contatos -----");
        System.out.println("Insira o primeiro contato: ");
        System.out.print("Nome: ");
        nom = ler.nextLine();
        System.out.print("Email: ");
        em = ler.nextLine();
        System.out.print("Telefone: ");
        tel = ler.nextLine();
        Contato c1 = new Contato(nom, em, tel);
        minhaAgenda.armazenarContato(c1);
        System.out.println("Insira o segundo contato: ");
        System.out.print("Nome: ");
        nom = ler.nextLine();
        System.out.print("Email: ");
        em = ler.nextLine();
        System.out.print("Telefone: ");
        tel = ler.nextLine();
        Contato c2 = new Contato(nom, em, tel);
        minhaAgenda.armazenarContato(c2);
        Contato c3 = new Contato("Eduarda", "eduarda@teste.com", "12345678910");
        minhaAgenda.armazenarContato(c3);
        minhaAgenda.imprimeAgenda();
        System.out.println("--------------------------------------");
        int achar = minhaAgenda.buscaContato("Eduarda");
        if (achar != -1) {
            System.out.println("Contato encontrado! Posição: " + achar);
            minhaAgenda.imprimeContato(achar);
            System.out.println("--------------------------------------");
        } else {
            System.out.println("Contato não encontrado.");
        }
        System.out.println("Remoção do último contato: ");
        minhaAgenda.removeContato(c3);
        minhaAgenda.imprimeAgenda();
        ler.close();
    }
}