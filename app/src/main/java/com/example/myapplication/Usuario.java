package com.example.myapplication;

public class Usuario {

    private String nome;
    private String email;
    private String telefone;
    private String foto;

    public Usuario(String nome, String email, String telefone, String foto) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.foto = foto;
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

    public String getFoto() {
        return foto;
    }
}