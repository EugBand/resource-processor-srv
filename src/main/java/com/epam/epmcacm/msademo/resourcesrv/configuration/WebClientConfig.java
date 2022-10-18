package com.epam.epmcacm.msademo.resourcesrv.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${resource-service.url}")
    private String resourceServiceUrl;

    @Value("${song-service.url}")
    private String songServiceUrl;

    @Bean("resource-srv")
    public WebClient resourceApiClient() {
        return WebClient.create(resourceServiceUrl);
    }

    @Bean("song-srv")
    public WebClient songApiClient() {
        return WebClient.create(songServiceUrl);
    }

}
