package com.innova.repository.impl;


import com.innova.domain.Trabajo;

import com.innova.repository.TrabajoRepo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public class TrabajoRepoImpl  extends AbstractRepoImpl<Trabajo> implements TrabajoRepo {


    private RowMapper<Trabajo> rowMapper=new TrabajoRowMapper();
    public TrabajoRepoImpl(JdbcTemplate jdbcTemplate){
        super(jdbcTemplate);
    }
    @Override
    public Optional<Trabajo> findByPhone(String phone) {

        String sql="select id, direccion, rubro,telefono from trabajo where telefono=?";

        return Optional.of(jdbcTemplate.queryForObject(sql,rowMapper,phone));
    }

    @Override
    public List<Trabajo> findAll() {
        String sql="select id, direccion, rubro,telefono from trabajo";
        return jdbcTemplate.query(sql,rowMapper);
    }

    @Override
    public Optional<Trabajo> findById(long id) {
        String sql="select id, direccion, rubro,telefono from trabajo where id=?";
        return Optional.of(jdbcTemplate.queryForObject(sql,rowMapper,id));
    }

    private class TrabajoRowMapper implements RowMapper<Trabajo> {

        @Override
        public Trabajo mapRow(ResultSet resultSet, int i) throws SQLException {

            long id=resultSet.getLong("ID");
            String direccion=resultSet.getString("DIRECCION");
            String rubro=resultSet.getString("RUBRO");
            String phone=resultSet.getString("TELEFONO");

            Trabajo trabajo=new Trabajo();
            trabajo.setId(id);
            trabajo.setDireccionTrabajo(direccion);
            trabajo.setRubroTrabajo(rubro);
            trabajo.setTelefonoTrabajo(phone);

            return trabajo;
        }
    }
}
