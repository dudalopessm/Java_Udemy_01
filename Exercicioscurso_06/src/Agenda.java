import java.util.ArrayList;
public class Agenda {
    //declaração do array
    private ArrayList<Contato> contatos;
    //criação do array
    public Agenda() {
        contatos = new ArrayList<>();
    }
    //adicionar contato na agenda
    public void armazenarContato(Contato contato) {
        contatos.add(contato);
    }
    //remover contato na agenda
    public void removeContato(Contato contato) {
        contatos.remove(contato);
    }
    //buscar contato pelo nome e retornar o índice desse contato na agenda
    public int buscaContato(String nome) {
        int i;
        for (i = 0; i < contatos.size(); i++) {
            if(contatos.get(i).getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return -1;
    }
    //imprime toda a agenda em ordem crescente de registro
    void imprimeAgenda() {
        for (Contato contato : contatos) {
            contato.imprime_contatos();
        }
    }
    //imprime o contato na agenda de acordo com seu índice nesta
    public void imprimeContato(int index) {
        if (index >= 0 && index < contatos.size()) {
            contatos.get(index).imprime_contatos();
        } else {
            System.out.println("Índice inválido.");
        }
    }
}