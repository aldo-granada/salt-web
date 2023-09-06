package com.salt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.salt.demo.model.Model;
import com.salt.demo.service.ModelSC;

@RestController
@RequestMapping("/api/model")
public class ModelController {
    @Autowired
    private ModelController modelController;
    private ModelSC modelSC;

    @GetMapping
    public List<Model> listModel() {
        return (List<Model>) modelSC.findAll();
    }

    @GetMapping("/search")
    public List<Model> searchModel(@RequestParam("nama") String nama) {
        return modelSC.findByNamaContainingIgnoreCase(nama);
    }

}	