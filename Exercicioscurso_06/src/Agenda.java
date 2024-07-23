/*
Crie uma classe Agenda que pode armazenar contatos, podendo realizar as seguintes
operações:
- void armazenarContato(Contato contato);
- void removeContato(Contato contato);
- int buscaContato(String nome); // Informa em que posição da agenda está o contato.
- void imprimeAgenda(); // Imprime os dados de todos os contatos da agenda.
- void imprimeContato(int index); // Imprime os dados do contato que está no índice informado.
 */
import java.util.ArrayList;
public class Agenda {
    private ArrayList<Contato> contatos;
    public Agenda() {
        contatos = new ArrayList<>();
    }
    public void armazenarContato(Contato contato) {
        contatos.add(contato);
    }
    public void removeContato(Contato contato) {
        contatos.remove(contato);
    }
    public int buscaContato(String nome) {
        int i;
        for (i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
    void imprimeAgenda() {
        for (Contato contato : contatos) {
            contato.imprime_contatos();
        }
    }
    public void imprimeContato(int index) {
        if (index >= 0 && index < contatos.size()) {
            contatos.get(index).imprime_contatos();
        } else {
            System.out.println("Índice inválido.");
        }
    }
}