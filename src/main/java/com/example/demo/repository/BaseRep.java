/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import java.util.List;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;

/**
 *
 * @author elvis
 * @param <T>
 */
public interface BaseRep<T> { //Especifica una interfaz generica

    public boolean save(T categoria);

    public boolean update(T categoria);

    public List<T> findAll(Pageable pageable);

    public T findById(int id);
}
