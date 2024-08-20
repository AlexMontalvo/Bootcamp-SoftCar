package com.sofca.Historia.Clinica.dto;

import java.time.LocalDate;

public class HistorialClinicoDto {
    private int id_historial;
    private int cedula_paciente ;
    private String nombre_Paciente;
    private String apellido_Paciente ;
    private String direccion_Paciente ;
    private String correo_Paciente;
    private String genero_Paciente;
    private LocalDate fecha_Nacimiento;
    private LocalDate fecha_Afiliacion;
    private String tratamientos;
    private String diagnosticos;
    private int telefono_paciente;
    private String medico;
    private String procedimientos;
    private String medicamentos;
    private String observaciones;
    private String tipo_Usuario;
    private String especialidad;
    private LocalDate fecha_Registro;
    private EpsDto codigoEps;

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public int getCedula_paciente() {
        return cedula_paciente;
    }

    public void setCedula_paciente(int cedula_paciente) {
        this.cedula_paciente = cedula_paciente;
    }

    public String getNombre_Paciente() {
        return nombre_Paciente;
    }

    public void setNombre_Paciente(String nombre_Paciente) {
        this.nombre_Paciente = nombre_Paciente;
    }

    public String getApellido_Paciente() {
        return apellido_Paciente;
    }

    public void setApellido_Paciente(String apellido_Paciente) {
        this.apellido_Paciente = apellido_Paciente;
    }

    public String getDireccion_Paciente() {
        return direccion_Paciente;
    }

    public void setDireccion_Paciente(String direccion_Paciente) {
        this.direccion_Paciente = direccion_Paciente;
    }

    public String getCorreo_Paciente() {
        return correo_Paciente;
    }

    public void setCorreo_Paciente(String correo_Paciente) {
        this.correo_Paciente = correo_Paciente;
    }

    public String getGenero_Paciente() {
        return genero_Paciente;
    }

    public void setGenero_Paciente(String genero_Paciente) {
        this.genero_Paciente = genero_Paciente;
    }

    public LocalDate getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public LocalDate getFecha_Afiliacion() {
        return fecha_Afiliacion;
    }

    public void setFecha_Afiliacion(LocalDate fecha_Afiliacion) {
        this.fecha_Afiliacion = fecha_Afiliacion;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public String getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(String diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public int getTelefono_paciente() {
        return telefono_paciente;
    }

    public void setTelefono_paciente(int telefono_paciente) {
        this.telefono_paciente = telefono_paciente;
    }

    public String getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(String procedimientos) {
        this.procedimientos = procedimientos;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(String tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }

    public LocalDate getFecha_Registro() {
        return fecha_Registro;
    }

    public void setFecha_Registro(LocalDate fecha_Registro) {
        this.fecha_Registro = fecha_Registro;
    }

    public EpsDto getEpsDto() {
        return codigoEps;
    }

    public void setEpsDto(EpsDto codigoEps) {
        this.codigoEps = codigoEps;
    }
}
