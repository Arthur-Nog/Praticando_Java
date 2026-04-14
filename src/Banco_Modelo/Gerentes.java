package Banco_Modelo;

public class Gerentes extends Pessoas{
    double salario;

    public Gerentes(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }
}
