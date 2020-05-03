package com.chris.tindercyoaengine.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    @Bean
    DataSource dataSource(){
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/tinder_cyoa?useSSL=false")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .username("root")
                .password("79f806b4-8af7-11ea-bc55-0242ac130003")
                .build();
    }
}
