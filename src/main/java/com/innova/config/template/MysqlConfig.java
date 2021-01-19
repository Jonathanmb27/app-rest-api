package com.innova.config.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
//@Profile("jdbc")
@PropertySource("classpath:db/dbmysql.properties")
public class MysqlConfig {

    @Autowired
    Environment environment;


    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dm=new DriverManagerDataSource();
        dm.setDriverClassName(environment.getProperty("db.driverClassName"));
        dm.setUrl(environment.getProperty("db.url"));
        dm.setUsername(environment.getProperty("db.username"));
        dm.setPassword(environment.getProperty("db.password"));
        return dm;
    }
}
