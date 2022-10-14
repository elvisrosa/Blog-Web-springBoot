/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;


public class PostMetadata {

    
    private Integer isPostmetadata;
    private String clave;
    private String valor;
    private String tipo;
    private Integer idPost;

    public PostMetadata() {
    }

    public PostMetadata(Integer isPostmetadata, String clave, String valor, String tipo, Integer idPost) {
        this.isPostmetadata = isPostmetadata;
        this.clave = clave;
        this.valor = valor;
        this.tipo = tipo;
        this.idPost = idPost;
    }

    public Integer getIsPostmetadata() {
        return isPostmetadata;
    }

    public void setIsPostmetadata(Integer isPostmetadata) {
        this.isPostmetadata = isPostmetadata;
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

    public Integer getIdPost() {
        return idPost;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }
    
    

    
}
