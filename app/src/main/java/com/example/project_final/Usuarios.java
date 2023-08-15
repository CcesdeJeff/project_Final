package com.example.project_final;

public class Usuarios {
    String id,name,correo,direccion;

    public Usuarios() {
    }

    public Usuarios(String id, String name, String correo, String direccion) {
        this.id = id;
        this.name = name;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
