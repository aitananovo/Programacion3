package Exercicio6;

import java.io.Serializable;

public class Ciclista implements Serializable{
    private String nome;
    private Bicicleta bicicleta;
    
    public Ciclista(String nome, Bicicleta bicicleta) {
        this.nome = nome;
        this.bicicleta = bicicleta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    @Override
    public String toString() {
        return "Ciclista [nome=" + nome + ", bicicleta=" + bicicleta + "]";
    }
    
    
}