package com.chris.tindercyoaengine.config;

import com.chris.tindercyoaengine.model.tinder.Headers;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Configuration
@EnableScheduling
@EnableConfigurationProperties
public class TinderCoyaEngineConfig {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    @ConfigurationProperties("tinder")
    public Headers headers(){
        return new Headers();
    }

    @Bean(name = "tinderHeaders")
    HttpHeaders httpHeaders(){
        HttpHeaders httpHeaders = new HttpHeaders();
        Map<String, String> headersMap = headers().getHeaders();
        headersMap.forEach(httpHeaders::add);
        return httpHeaders;
    }
}
