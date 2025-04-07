package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A");
        Pessoa original = new Pessoa("Vanderson", endereco);
        
        Pessoa cloneShallow = original.cloneShallow();
        pessoa cloneDeep = original.cloneDeep();
        System.out.println("Antes de modificar:");
        System.out.println("Original: " + original);
        System.out.println("Clone Shallow: " + cloneShallow);
        System.out.println("Clone Deep: " + cloneDeep);
        
        cloneShallow.getEndereco().setRua("Rua B");
        
        cloneDeep.setNome("Joaozinho");
        System.out.println("\nDepois de modificar o cloneShallow: ");
        System.out.println("Original: " + original);
        System.out.println("Clone Shallow: " + cloneShallow);
        System.out.println("Clone Deep: " + cloneDeep);
        
    }
}
