package com.example.efinal2_api_ab.service.to;

import java.io.Serializable;

import org.springframework.hateoas.RepresentationModel;

public class EstudianteTo extends RepresentationModel implements Serializable {

    private final static long serialisableUI = 1l;
    
    private Integer id;

    private String nombre;

    private String apellido;

    private String cedula;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    

}
