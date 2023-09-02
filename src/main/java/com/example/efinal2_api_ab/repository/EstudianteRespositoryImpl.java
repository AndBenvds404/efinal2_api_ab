package com.example.efinal2_api_ab.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.efinal2_api_ab.repository.entidad.Estudiante;

@Repository
@Transactional
public class EstudianteRespositoryImpl implements IEstudianteRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Estudiante estudiante) {

        this.entityManager.persist(estudiante);
    }

    @Override
    public List<Estudiante> consultarTodos() {

        return this.entityManager.createQuery("SELECT e FROM Estudiante e", Estudiante.class).getResultList();

    }

}
