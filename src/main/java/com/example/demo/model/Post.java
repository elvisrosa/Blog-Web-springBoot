/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.model;


public class Post   {

    
    private Integer idPost;    
    private String titulo;   
    private String slug;   
    private String extracto;
    private String imagenDestacada;
    private String tipo;   
    private Integer categoria;
    private Integer idusuario;

    public Post() {
    }

    public Post(Integer idPost, String titulo, String slug, String extracto, String imagenDestacada, String tipo, Integer categoria, Integer idusuario) {
        this.idPost = idPost;
        this.titulo = titulo;
        this.slug = slug;
        this.extracto = extracto;
        this.imagenDestacada = imagenDestacada;
        this.tipo = tipo;
        this.categoria = categoria;
        this.idusuario = idusuario;
    }

    public Integer getIdPost() {
        return idPost;
    }

    public void setIdPost(Integer idPost) {
        this.idPost = idPost;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getExtracto() {
        return extracto;
    }

    public void setExtracto(String extracto) {
        this.extracto = extracto;
    }

    public String getImagenDestacada() {
        return imagenDestacada;
    }

    public void setImagenDestacada(String imagenDestacada) {
        this.imagenDestacada = imagenDestacada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    
    
    

}