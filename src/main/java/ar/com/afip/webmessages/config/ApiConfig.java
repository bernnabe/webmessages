package ar.com.afip.webmessages.config;

import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig extends CachingConfigurerSupport {
    /*
        TODO: implementar un cachemanager multiple y gestionar
                las expireations por separado de cada cache.
     */
}

