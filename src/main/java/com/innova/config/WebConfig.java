package com.innova.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.innova.config.template.JdbcTemplateConfig;
import com.innova.config.template.MysqlConfig;
import com.innova.config.template.TestDBConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Configuration
@Import({JdbcTemplateConfig.class})

/*
* Spring detecta y utiliza automáticamente los convertidores
* de mensajes en aplicaciones configuradas con:
* */
@EnableWebMvc
@ComponentScan(basePackages = "com.innova.controller")
public class WebConfig implements WebMvcConfigurer, WebApplicationInitializer {


    /*
    * dar formato a las fechas jsonformat page 363
    * jsonignore para ignorar campos a serializar
    * */
    /*
    * este es un bean convertidos y se tenia que declarar explicitamente en versiones
    * anteriores
    * */
    /*@Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
        MappingJackson2HttpMessageConverter converter=new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(objectMapper());
        return converter;
    }
    @Bean
    public ObjectMapper objectMapper(){
        ObjectMapper objectMapper=new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }*/

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext dispatcherContext=new AnnotationConfigWebApplicationContext();
        dispatcherContext.register(WebConfig.class);

        ServletRegistration.Dynamic dispatcher=
                servletContext.addServlet("dispatcher",new DispatcherServlet(dispatcherContext));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/");
    }
}
