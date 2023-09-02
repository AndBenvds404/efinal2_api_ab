package com.example.efinal2_api_ab.service;

import java.util.List;

import com.example.efinal2_api_ab.repository.entidad.Estudiante;
import com.example.efinal2_api_ab.service.to.EstudianteTo;

public interface IEstudianteService {

    public void insertar(Estudiante estudiante);

    public List<EstudianteTo> consultarTodos();
}
