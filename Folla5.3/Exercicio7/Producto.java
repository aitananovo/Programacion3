package Exercicio7;

import java.io.Serializable;

public class Producto implements Serializable{
    private String nome;
    private String marca;
    private String tipo;
    private int prezo;

    public Producto(String nome, String marca, String tipo, int prezo) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.prezo = prezo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Producto [nome=" + nome + ", marca=" + marca + ", tipo=" + tipo + ", prezo=" + prezo + "]";
    }

    
    
}