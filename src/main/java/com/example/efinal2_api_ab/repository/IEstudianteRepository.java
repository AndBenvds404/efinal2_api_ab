package com.example.efinal2_api_ab.repository;

import java.util.List;

import com.example.efinal2_api_ab.repository.entidad.Estudiante;

public interface IEstudianteRepository {

    public void insertar(Estudiante estudiante);

    public List<Estudiante> consultarTodos();
}
