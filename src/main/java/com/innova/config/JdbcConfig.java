package com.innova.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@Profile("jdbc")
public class JdbcConfig {



    @Bean
    public DataSource dataSource(){
        return null;
    }

}
