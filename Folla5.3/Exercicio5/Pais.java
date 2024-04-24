package Exercicio5;

import java.io.Serializable;

public class Pais implements Serializable{
    private String nome;
    private int num_habitantes;
    private static final long serialVersionUID = 2L;
    
    public Pais(String nome, int num_habitantes) {
        this.nome = nome;
        this.num_habitantes = num_habitantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum_habitantes() {
        return num_habitantes;
    }

    public void setNum_habitantes(int num_habitantes) {
        this.num_habitantes = num_habitantes;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Pais [nome=" + nome + ", num_habitantes=" + num_habitantes + "]";
    }

    


    
}