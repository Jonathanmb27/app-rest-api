package com.innova;

import static org.junit.Assert.assertNotNull;


import com.innova.config.template.JdbcTemplateConfig;
import com.innova.config.template.TestDBConfig;
import com.innova.repository.InquilinoRepo;
import com.innova.repository.TrabajoRepo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = JdbcTemplateConfig.class)
@ActiveProfiles("jdbc")
public class AppTest {

    @Autowired
    InquilinoRepo inquilinoRepo;

    @Autowired
    TrabajoRepo trabajoRepo;

    @Before
    public void setUp(){
        assertNotNull(trabajoRepo);

    }
    @Test
    public void verificarNotNull(){
        System.out.println(trabajoRepo.findByPhone("531009").get().getDireccionTrabajo());
    }

}
