package com.github.manojesus.desafioPessoa;

public class Endereco {
    //=== campos ===
    private String estado;
    private String cidade;
    private String rua;
    private int numero;

    //=== Construtores ===
    public Endereco() {}

    public Endereco(String estado, String cidade, String rua, int numero) {
        this.estado = estado;
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    //=== Metodos acessores ===
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  estado +", " + cidade + ", " + rua + ", " + numero + ".";
    }
}
