package com.mycompany.prototype;

public class Prototype {

    public static void main(String[] args) {
        AmbienteConfig devClone = AmbientePrototypeRegistry.getPrototipo("DEV");
        devClone.exibirInfo();
        
        devClone.setUrl("http://dev.blablabla");
        devClone.setUsuario("devFeatureUser");
        devClone.setTimeoutSegundos(45);
        devClone.exibirInfo();
        
        AmbienteConfig prodClone = AmbientePrototypeRegistry.getPrototipo("PROD");
        prodClone.exibirInfo();
        
        prodClone.setUrl("http://dev.blablabla");
        prodClone.setSenha("Senha123");
        prodClone.exibirInfo();
        
        
        
    }
}
