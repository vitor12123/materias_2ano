package com.delivery;

public class Cliente {
    private String id;
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone) {

        this.id = java.util.UUID.randomUUID().toString();
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
