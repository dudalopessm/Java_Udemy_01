public class Televisao {
    public int canal, volume;
    public String estado;
    //métodos sets
    public void setEstado(String est) {
        if (est.equalsIgnoreCase("on") || est.equalsIgnoreCase("off") ) {
            this.estado = est;
        }
    }
    public void setCanal(int can) {
        if (can > 1 && can <= 50) {
            this.canal = can;
        } else { //caso usuário escrever numero fora do escopo, retorna -1, fazer verificação na main
            can = -1;
        }
    }
    public void setVolume(int vol) {
        if (vol > 0 && vol <= 100) {
            this.volume = vol;
        } else { //caso usuário escrever numero fora do escopo, retorna -1, fazer verificação na main
            vol = -1;
        }
    }
    public Televisao(String est, int can, int vol) {
        setEstado(est);
        setCanal(can);
        setVolume(vol);
    }
    //método gets
    public String getEstado() {
        return this.estado;
    }
    public int getCanal() {
        return this.canal;
    }
    public int getVolume() {
        return this.volume;
    }
    //método para impressão
    void imprimeEstado() {
        if (getEstado().equalsIgnoreCase("on")) {
            System.out.println("A TV está ligada.");
        } else if (getEstado().equalsIgnoreCase("off")) {
            System.out.println("A TV está desligada.");
        } else {
            System.out.println("Erro ao determinar estado da TV.");
        }
    }
    void imprimeCanal() {
        System.out.println("A TV está no canal: " + getCanal());
        System.out.println("~~");
    }
    void imprimeVolume() {
        System.out.println("A TV está no volume: " + getVolume());
        System.out.println("~~");
    }
    void imprimeTV() {
        System.out.println("~~");
        imprimeEstado();
        System.out.println("A TV está no canal: " + getCanal());
        System.out.println("A TV está no volume: " + getVolume());
        System.out.println("~~");
    }
}