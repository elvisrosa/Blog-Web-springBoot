/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;



/**
 *
 * @author elvis
 */
public class Contenido  {

    
    private Integer idContenido;
    private String tipo;
    private String contenido;
    private Integer idPost;

    public Contenido() {
    }
    
    

    public Contenido(Integer idContenido, String tipo, String contenido, Integer idPost) {
        this.idContenido = idContenido;
        this.tipo = tipo;
        this.contenido = contenido;
        this.idPost = idPost;
    }

    public Integer getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(Integer idContenido) {
        this.idContenido = idContenido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Integer getIdPost() {
        return idPost;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }
    
    
    
    
}

    
 