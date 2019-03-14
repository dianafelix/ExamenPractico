package com.uabc.edu.mx.demo;

import lombok.Data;

@Data
public class Cita {
    private String asunto;
    private String fecha;
    private String hora;
    private String doctor;

    public Cita(){

    }


    public Cita(String asunto, String fecha, String hora, String doctor) {
        this.asunto = asunto;
        this.fecha = fecha;
        this.hora = hora;
        this.doctor = doctor;
    }
}
