package br.com.geekuniversity.secao05;
/*
Faça um programa que receba a data atual (dia, mês e ano) e exiba na tela no formato textual.
Exemplo: Data 01/01/2024, Imprimir: 1 de janeiro de 2024.
 */
import java.util.Scanner;
public class Exercicio0502 {
    static Scanner ler = new Scanner(System.in);
    static String data;
    static String dataextenso(String data) {
        String partes[] = data.split("/");
        String auxmes = "";
        int dia, mes, ano;
        dia = Integer.parseInt(partes[0]);
        mes = Integer.parseInt(partes[1]);
        ano = Integer.parseInt(partes[2]);
        switch (mes) {
            case 1:
                auxmes = "janeiro";
                break;
            case 2:
                auxmes = "fevereiro";
                break;
            case 3:
                auxmes = "março";
                break;
            case 4:
                auxmes = "abril";
                break;
            case 5:
                auxmes = "maio";
                break;
            case 6:
                auxmes = "junho";
                break;
            case 7:
                auxmes = "julho";
                break;
            case 8:
                auxmes = "agosto";
                break;
            case 9:
                auxmes = "setembro";
                break;
            case 10:
                auxmes = "outubro";
                break;
            case 11:
                auxmes = "novembro";
                break;
            case 12:
                auxmes = "dezembro";
                break;
            default:
                System.out.println("mês não existente.");
                break;
        }
        return dia + " de " + auxmes + " de " + ano + ".";
    }
    public static void main(String[]args) {
        System.out.println("----- Data em extenso -----");
        System.out.print("Digite a data: ");
        data = ler.nextLine();
        System.out.println("\n");
        System.out.println(dataextenso(data));
        ler.close();
    }
}