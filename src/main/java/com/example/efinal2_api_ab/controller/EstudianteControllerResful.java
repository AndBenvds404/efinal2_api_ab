package com.example.efinal2_api_ab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.efinal2_api_ab.repository.entidad.Estudiante;
import com.example.efinal2_api_ab.service.EstudianteServiceImpl;
import com.example.efinal2_api_ab.service.to.EstudianteTo;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteControllerResful {

    @Autowired
    private EstudianteServiceImpl estudianteServiceImpl;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void ingresarEstudiante(@RequestBody Estudiante estudiante) {
        this.estudianteServiceImpl.insertar(estudiante);

    }

    @GetMapping
    public List<EstudianteTo> devolverTodos() {

        return this.estudianteServiceImpl.consultarTodos();
    }

}
