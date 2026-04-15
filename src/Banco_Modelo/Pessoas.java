package Banco_Modelo;

import java.util.ArrayList;

public abstract class Pessoas {
    String nome;
    int idade;

    public Pessoas(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    ArrayList<Pessoas> clientesBanco = new ArrayList<>();
    ArrayList<Pessoas> gerentesBanco = new ArrayList<>();

}
