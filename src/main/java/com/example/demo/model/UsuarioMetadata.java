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

public class UsuarioMetadata {

   
    private Integer idUsuariometadata;
   
    private String clave;
    private String valor;
    private String tipo;
    private Integer idUsuario;

    public UsuarioMetadata() {
    }

    public UsuarioMetadata(Integer idUsuariometadata, String clave, String valor, String tipo, Integer idUsuario) {
        this.idUsuariometadata = idUsuariometadata;
        this.clave = clave;
        this.valor = valor;
        this.tipo = tipo;
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuariometadata() {
        return idUsuariometadata;
    }

    public void setIdUsuariometadata(Integer idUsuariometadata) {
        this.idUsuariometadata = idUsuariometadata;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
    
    

}