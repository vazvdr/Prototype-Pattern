package com.mycompany.mavenproject1.cloneWars;

public class Pessoa {
    private String nome;
    private Endereco endereco;
    private String rua;

    private Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;        
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setRua(String rua){
        Endereco endereco = this.endereco;
    }
    
    public String getRua(){
        return rua;
    }
    
    
    public Pessoa cloneShallow(){
        return new Pessoa(nome, endereco);
    }
    
    public Pessoa cloneDeep(){
        return new Pessoa(nome, new Endereco(endereco.getRua()));
    }
    
    public String toString(){
        return "Pessoa{nome='" + nome + "', endereco" + endereco + "}";
    }
}
