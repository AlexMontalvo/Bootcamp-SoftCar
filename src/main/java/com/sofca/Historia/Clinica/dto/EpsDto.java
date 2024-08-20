package com.sofca.Historia.Clinica.dto;

import java.time.LocalDate;

public class EpsDto {
    private String codigoEps;
    private String nombre;
    private String direccion;
    private String correo;
    private String fechaRegistro;
    private String telefono;
    private int historialClinico;

    public String getCodigoEps() {
        return codigoEps;
    }

    public void setCodigoEps(String codigoEps) {
        this.codigoEps = codigoEps;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(int historialClinico) {
        this.historialClinico = historialClinico;
    }
}
