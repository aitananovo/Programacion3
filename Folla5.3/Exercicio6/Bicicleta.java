package Exercicio6;

import java.io.Serializable;

public class Bicicleta implements Serializable{

    private String modelo;
    private String cor;
    
    public Bicicleta(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Bicicleta [modelo=" + modelo + ", cor=" + cor + "]";
    }

    
    
}