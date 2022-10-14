/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;

import java.util.Date;


/**
 *
 * @author elvis
 */
public class Categoria {

    private static final long serialVersionUID = 1L;
   
    private Integer idCategoria;   
    private String nombre;  
    private String descripcion;  
    private Date fecha;
    private Integer categoriaSuperior;

    public Categoria() {
    }

    public Categoria(Integer idCategoria, String nombre, String descripcion, Date fecha, Integer categoriaSuperior) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.categoriaSuperior = categoriaSuperior;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getCategoriaSuperior() {
        return categoriaSuperior;
    }

    public void setCategoriaSuperior(Integer categoriaSuperior) {
        this.categoriaSuperior = categoriaSuperior;
    }
    
    
    
    
}

    