/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.mapper;

import com.example.demo.model.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author elvis
 */
public class CategoriaMapper implements RowMapper<Categoria>{

    
    @Override
    public Categoria mapRow(ResultSet rs, int rowNum) throws SQLException {
        Categoria categoria = new Categoria();
        categoria.setCategoriaSuperior(rs.getInt("CategoriaSuperior"));
        categoria.setDescripcion(rs.getString("Descripcion"));
        categoria.setFecha(rs.getDate("fecha"));
        categoria.setNombre(rs.getString("Nombre"));
        categoria.setIdCategoria(rs.getInt("idCategoria"));
        return categoria;
    }
    
}
