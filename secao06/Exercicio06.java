package br.com.geekuniversity.secao06;
/*
    1. Crie uma classe para representar um contato, com os atributos privados de nome, email e
    telefone. Crie os métodos públicos necessários para sets e gets e também um método para
    imprimir os dados de uma pessoa. Crie também um programa, instancie um objeto desta classe e imprima os dados do objeto.
    2. Crie uma classe Agenda que pode armazenar contatos, podendo realizar as seguintes operações:
        - void armazenarContato(Contato contato);
        - void removeContato(Contato contato);
        - int buscaContato(String nome); // Informa em que posição da agenda está o contato.
        - void imprimeAgenda(); // Imprime os dados de todos os contatos da agenda.
        - void imprimeContato(int index); // Imprime os dados do contato que está no índice informado.
    3. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar a televisão, como
    ligar e desligar, trocar canais e aumentar e diminuir o volume.
        - O controle de volume permite aumentar ou diminuir a potência do volume de som em uma unidade de cada vez.
        - O controle de canal permite aumentar ou diminuir o número do canal em uma unidade, porém
        também possibilita trocar para um canal indicado.
 */
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[]args) {
        Scanner ler = new Scanner(System.in);
        //main reaproveitada dos exercícios 1 e 2, comandos comentados para otimização do teste.
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
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("----- TV -----");
        int vol, canal, aux = 0, canalaux;
        String user;
        vol = 0 + (int)(Math.random() * (100 - 0));
        canal = 1 + (int)(Math.random() * (50 - 1));
        Televisao minhaTV = new Televisao("off", canal, vol);
        ControleRemoto meuControle = new ControleRemoto(minhaTV);
        minhaTV.imprimeTV();
        System.out.println("--------------------------------------");
        do {
            System.out.print("Deseja ligar a TV? ");
            user = ler.nextLine();
            aux = 0;
            if (user.equalsIgnoreCase("nao")) {
                System.out.println("A TV continua desligada.");
                aux = 1;
            } else if (user.equalsIgnoreCase("sim")) {
                meuControle.ligaDesliga(user);
            } else {
                System.out.println("Opção inválida.");
                aux = 1;
            }
        } while (aux == 1);
        System.out.println("--------------------------------------");
        minhaTV.imprimeTV();
        System.out.println("--------------------------------------");
        do {
            System.out.print("Deseja alterar o volume? ");
            user = ler.nextLine();
            aux = 0;
            if (user.equalsIgnoreCase("nao")) {
                System.out.println("Volume não alterado.");
                aux = 0;
            } else if (user.equalsIgnoreCase("sim")) {
                System.out.print("Aumentar ou diminuir? ");
                user = ler.nextLine();
                meuControle.volumeTV(user);
                aux = 0;
            } else {
                System.out.println("Opção inválida.");
                aux = 1;
            }
        } while (aux == 1);
        System.out.println("--------------------------------------");
        do {
            System.out.print("Deseja alterar o canal? ");
            user = ler.nextLine();
            aux = 0;
            if (user.equalsIgnoreCase("nao")) {
                System.out.println("Canal mantido.");
                aux = 0;
            } else if (user.equalsIgnoreCase("sim")) {
                System.out.println("Aumentar, diminuir ou outro? ");
                user = ler.nextLine();
                if (user.equalsIgnoreCase("aumentar") || user.equalsIgnoreCase("diminuir")) {
                    meuControle.canalTV(user, canal);
                    aux = 0;
                } else if (user.equalsIgnoreCase("outro")) {
                    System.out.print("Digite o número do canal que deseja assistir, de 1 até 50: ");
                    canalaux = Integer.parseInt(ler.nextLine());
                    meuControle.canalTV(user, canalaux);
                    aux = 0;
                } else {
                    System.out.print("Opção de canal inválida.");
                    aux = 1;
                }
            } else {
                System.out.println("Opção inválida.");
                aux = 1;
            }
        } while (aux == 1);
        System.out.println("--------------------------------------");
        System.out.println("Time's up. A TV será desligada.");
        meuControle.ligaDesliga("nao");
        System.out.println("--------------------------------------");
        System.out.println("Ùltimo estado da TV: ");
        minhaTV.imprimeTV();
        System.out.println("--------------------------------------");
        ler.close();
    }
}