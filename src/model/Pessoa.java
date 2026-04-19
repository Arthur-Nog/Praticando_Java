package model;

public abstract class Pessoa {
    public String nome;
    public int idade;

    public Pessoa(){}

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }
}
