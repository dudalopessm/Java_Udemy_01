public class Contato {
    //atributos
    private String nome, email, telefone;

    //métodos sets
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Contato(String nome, String email, String telefone) {
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
    }

    //método gets
    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.email;
    }
    public String getTelefone() {
        return this.telefone;
    }

    //método para impressão
    void imprime_contatos() {
        System.out.println("----------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
    }
}