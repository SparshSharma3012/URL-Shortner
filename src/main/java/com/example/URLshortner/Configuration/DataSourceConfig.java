package com.example.URLshortner.Configuration;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class DataSourceConfig {
    @Bean
    public DataSource dataSource()
    {
        return DataSourceBuilder.create()
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .url("jdbc:mysql://localhost:3306/url")
                .username("root")
                .password("Sparsh6195!")
                .build();
    }
}
