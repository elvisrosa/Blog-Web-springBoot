/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.mapper.CategoriaMapper;
import com.example.demo.model.Categoria;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author elvis
 */
@Repository
public class CategoriaRepository implements CategoriaRep {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean save(Categoria categoria) {
        try {
            String sql = String.format("insert into Categoria (Nombre, Descripcion, CategoriaSuperior) values ('%s','%s','%d')",
                    categoria.getNombre(), categoria.getDescripcion(), categoria.getCategoriaSuperior());
            jdbcTemplate.execute(sql);
        } catch (DataAccessException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Categoria categoria) {
        if (categoria.getIdCategoria() != null) {
            String sql = String.format("update Categoria set Nombre = '%s', Descripcion = '%s', CategoriaSuperior='%d'"
                    + "where idCategoria='%d'",
                    categoria.getNombre(), categoria.getDescripcion(), categoria.getCategoriaSuperior(),
                    categoria.getIdCategoria());
            jdbcTemplate.execute(sql);
            return true;

        }
        return false;
    }

    @Override
    public List<Categoria> findAll(SpringDataWebProperties.Pageable pageable) {

        return jdbcTemplate.query("select * from Categoria", new CategoriaMapper());
    }

    @Override
    public Categoria findById(int id) {
        Object[] params = new Object[] {id};
           return jdbcTemplate.queryForObject("select * from Categoria where idCategoria = ?", params, new CategoriaMapper() );
    }
}
