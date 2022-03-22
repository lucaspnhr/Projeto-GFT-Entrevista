package com.github.manojesus.desafioPessoa;

public class Pessoa {
    private String nome;
    private Endereco endereco;
    private String telefone;

    public Pessoa() {}

    public Pessoa(String nome, Endereco endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Descrição da pessoa: \n" +
                "Nome:" + nome + '\n' +
                "Endereço: " + endereco + '\n' +
                "Telefone:" + telefone + '\n' ;
    }
}
