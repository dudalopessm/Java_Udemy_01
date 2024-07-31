package br.com.geekuniversity.secao08;
public class Moto {
    private String marca, modelo, cor;
    private int marcha;
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String mod) {
        this.modelo = mod;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public void setMarcha(int m) {
        if (m >= 0 && m <= 5) {
            this.marcha = m;
        } else {
            System.out.println("Marcha inválida.");
        }
    }
    public String getMarca() {
        return this.marca;
    }
    public String getModelo() {
        return this.modelo;
    }
    public String getCor() {
        return this.cor;
    }
    public int getMarcha() {
        return this.marcha;
    }
    public Moto (String marca, String modelo, String cor, int marcha) {
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setMarcha(marcha);
    }
    //método para impressão das informações
    public void imprimir() {
        System.out.println("^^ Informações da moto ^^");
        System.out.println("Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nCor: " + getCor() + "\nMarcha atual: " + getMarcha());
        System.out.println("~~");
        System.out.println("Sumário das marchas:" + "\n0. Neutro" + "\n1. Primeira" + "\n2. Segunda" + "\n3. Terceira" + "\n4.Quarta" + "\n5.Ré");
        System.out.println("~~");
    }
    //método para trocar marcha
    public void trocarMarcha(String userop, int valor){
        if (userop.equalsIgnoreCase("aumentar")) {
            setMarcha((getMarcha()) + valor);
            System.out.println("Marcha aumentada com sucesso. Agora você está na marcha: " + getMarcha() + ".");
        } else if (userop.equalsIgnoreCase("diminuir")) {
            setMarcha((getMarcha()) - valor);
            System.out.println("Marcha diminuída com sucesso. Agora você está na marcha: " + getMarcha() + ".");
        } else {
            System.out.println("Comando inválido. Tente novamente.");
        }
    }
}