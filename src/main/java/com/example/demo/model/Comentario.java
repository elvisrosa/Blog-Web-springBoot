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
public class Comentario {
    
    private Integer idComentario;  
    private String comentario;  
    private Date fecha;   
    private String respuesta;    
    private Integer idPost;   
    private Integer idUsuario;

    public Comentario() {
 
    
    
    }

    public Comentario(Integer idComentario, String comentario, Date fecha, String respuesta, Integer idPost, Integer idUsuario) {
        this.idComentario = idComentario;
        this.comentario = comentario;
        this.fecha = fecha;
        this.respuesta = respuesta;
        this.idPost = idPost;
        this.idUsuario = idUsuario;
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Integer getIdPost() {
        return idPost;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}