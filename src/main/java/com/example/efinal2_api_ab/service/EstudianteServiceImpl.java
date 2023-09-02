package com.example.efinal2_api_ab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.efinal2_api_ab.repository.EstudianteRespositoryImpl;
import com.example.efinal2_api_ab.repository.entidad.Estudiante;
import com.example.efinal2_api_ab.service.to.EstudianteTo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    @Autowired
    private EstudianteRespositoryImpl estudianteRespository;

    @Override
    public List<EstudianteTo> consultarTodos() {
        var listEst = this.estudianteRespository.consultarTodos();
        List<EstudianteTo> lsestuTo = new ArrayList<>();
        for (Estudiante estudiante : listEst) {
            lsestuTo.add(convertir(estudiante));
        }

        return lsestuTo;
    }

    @Override
    public void insertar(Estudiante estudiante) {

        this.estudianteRespository.insertar(estudiante);

    }

    public EstudianteTo convertir(Estudiante estu) {

        EstudianteTo estuTo = new EstudianteTo();

        estuTo.setApellido(estu.getApellido());
        estuTo.setCedula(estu.getCedula());
        estuTo.setId(estu.getId());
        estuTo.setNombre(estu.getNombre());

        return estuTo;
    }

}
