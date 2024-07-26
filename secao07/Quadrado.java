package br.com.geekuniversity.secao07;
/*
1. Escreva um código Java que tenha a classe Quadrado, com atributos lado, área e perímetro e
os métodos calcularArea, calcularPerimetro e imprimir. Adicione um método construtor que
permita a definição de todos os atributos no momento da instanciação do objeto. Crie um
programa para testar a classe. Para encontrar a área usamos a fórmula (lado * lado) e o
perímetro (4 * lado).
 */
public class Quadrado {
    private int lado;
    private float area, perimetro;
    public void setLado(int l) {
        this.lado = l;
    }
    public void setArea(int l) {
        float a = (l*l);
        this.area = a;
    }
    public void setPerimetro(int l) {
        float p;
        p = (4*l);
        this.perimetro = p;
    }
    public Quadrado(int lado, int ladoarea, int ladoperimetro) {
        setLado(lado);
        setArea(ladoarea);
        setPerimetro(ladoperimetro);
    }
    public int getLado(){
        return this.lado;
    }
    public float getArea() {
        return this.area;
    }
    public float getPerimetro() {
        return this.perimetro;
    }
    //método para cálculo área
    public float calcularArea(int l) {
        return getArea();
    }
    //método para cálculo perímetro
    public float calcularPerimetro(int l) {
        return getPerimetro();
    }
    //método para impressão das informações do quadrado
    public String toString() {
        System.out.println("\nInformações do quadrado: ");
        return "Lado: " + getLado() + " / Àrea: " + getArea() + " / Perímetro: " + getPerimetro();
    }
}