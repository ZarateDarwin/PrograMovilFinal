package com.example.zaratedarwinmauricio2doparcial;

public class Cita {
    private String nombre,celular,fecha,hora;
    public Cita() {

    }

    public Cita(String nombre, String celular, String fecha, String hora) {
        this.nombre = nombre;
        this.celular = celular;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
