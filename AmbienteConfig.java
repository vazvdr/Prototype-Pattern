package com.mycompany.prototype;

public abstract class AmbienteConfig implements Cloneable{
    
    private String url;
    private String usuario;
    private String senha;
    private int timeoutSegundos;
    private boolean logDetalhado;

    public AmbienteConfig(String url, String usuario, String senha, int timeoutSegundos, boolean logDetalhado) {
        this.url = url;
        this.usuario = usuario;
        this.senha = senha;
        this.timeoutSegundos = timeoutSegundos;
        this.logDetalhado = logDetalhado;
    }
    
    // Getter e Setter para 'url'
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Getter e Setter para 'usuario'
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Getter e Setter para 'senha'
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Getter e Setter para 'timeoutSegundos'
    public int getTimeoutSegundos() {
        return timeoutSegundos;
    }

    public void setTimeoutSegundos(int timeoutSegundos) {
        this.timeoutSegundos = timeoutSegundos;
    }

    // Getter e Setter para 'logDetalhado'
    public boolean isLogDetalhado() {
        return logDetalhado;
    }

    public void setLogDetalhado(boolean logDetalhado) {
        this.logDetalhado = logDetalhado;
    }
    
    
    
    
    
    
    
    
}
