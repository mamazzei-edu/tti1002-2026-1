/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.sistemaacademico;

/**
 *
 * @author mamaz
 */
public class Usuario {
    private String nome;
    private String senha;
    
    public Usuario(String nome, String senha) {
        this.senha = senha;
        this.nome = nome;
    }
    
    
    public String getNome() {
        return this.nome;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
}
