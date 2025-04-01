package com.mycompany.prototype;

import java.util.HashMap;
import java.util.Map;

public class AmbientePrototypeRegistry {
    private static Map<String, AmbienteConfig> prototipos = new HashMap<>();
    
    static{
        DesenvolvimentoConfig devConfig = new DesenvolvimentoConfig(
                "http://dev.local", "devUser", "devPass", 30, true);
        prototipos.put("DEV", devConfig);
        ProducaoConfig prodConfig = new ProducaoConfig(
                "https://prod.suaempresa.com", "prodUser", "prodPass", 120, false);
        prototipos.put("PROD", prodConfig);
    }
    
    public static AmbienteConfig getPrototipo(String tipo){
        AmbienteConfig config = prototipos.get(tipo);
        if(config != null){
            return config.clone();
        }
        throw new IllegalArgumentException("Prototipo não encontrado: " + tipo);
    }
}
