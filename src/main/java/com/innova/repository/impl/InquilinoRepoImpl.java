package com.innova.repository.impl;

import com.innova.domain.Inquilino;
import com.innova.repository.InquilinoRepo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Repository
public class InquilinoRepoImpl extends AbstractRepoImpl<Inquilino> implements InquilinoRepo {

    private RowMapper<Inquilino> rowMapper=new InquilinoRowMapper();

    public InquilinoRepoImpl(JdbcTemplate jdbcTemplate){
        super(jdbcTemplate);
    }

    @Override
    public Optional<Inquilino> findByName(String name) {
        String query="SELECT id,apellido, nombre, telefono FROM inquilino where nombre = ?";

        return Optional.of(jdbcTemplate.queryForObject(query,rowMapper,name));
    }


    private class InquilinoRowMapper implements RowMapper<Inquilino>{

        @Override
        public Inquilino mapRow(ResultSet resultSet, int i) throws SQLException {
            long id=resultSet.getLong("ID");
            String nombre=resultSet.getString("NOMBRE");
            String apellido=resultSet.getString("APELLIDO");
            int telefono=resultSet.getInt("TELEFONO");

            Inquilino inquilino=new Inquilino();
            inquilino.setId(id);
            inquilino.setNombreInquilino(nombre);
            inquilino.setApellidoInquilino(apellido);
            inquilino.setTelefonoInquilino(telefono);
            return  inquilino;
        }
    }
}
