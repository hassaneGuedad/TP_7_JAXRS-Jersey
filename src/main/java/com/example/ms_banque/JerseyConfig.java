package com.example.ms_banque;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

// @Component   <-- tu peux supprimer Jersey si tu n'utilises pas JAX-RS
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        // Supprime la ligne suivante :
        // register(CompteRestJaxRSAPI.class);
    }
}
