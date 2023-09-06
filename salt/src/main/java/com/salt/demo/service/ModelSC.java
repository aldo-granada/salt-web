package com.salt.demo.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.salt.demo.model.Model;

public interface ModelSC extends CrudRepository<Model, Long> {
    List<Model> findByNamaContainingIgnoreCase(String nama);
}