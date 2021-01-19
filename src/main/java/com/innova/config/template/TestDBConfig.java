package com.innova.config.template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;
@Description("page 132 spring 5")
@Configuration
//@Profile("test")
public class TestDBConfig {


    @Bean
    DataSource dataSource(){
        EmbeddedDatabaseBuilder builder=new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db=builder
                .setType(EmbeddedDatabaseType.H2)
                .generateUniqueName(true)
                .addScript("db/schema.sql")
                .addScript("db/test-data.sql")
                .build();
        return db;
    }

}
