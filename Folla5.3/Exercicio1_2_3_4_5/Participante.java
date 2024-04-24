/*Crea unha clase Participante con nome, apelidos, e idade, que sexa serializable. Fai un programa que pida 3
participantes, e os grave un a un nun ficheiro binario participantes.dat, empregando serialización. */
package Exercicio1_2_3_4_5;

import java.io.Serializable;

public class Participante implements Serializable {
    private String nome;
    private String apelidos;
    private transient int idade;   //EXERCICIO 3, AÑADIR TRANSIENT
    
    public Participante(String nome, String apelidos, int idade) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

}