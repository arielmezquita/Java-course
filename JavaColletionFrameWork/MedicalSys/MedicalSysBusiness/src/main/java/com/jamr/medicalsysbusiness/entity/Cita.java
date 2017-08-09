
package com.jamr.medicalsysbusiness.entity;

import java.util.Date;


public class Cita {
    protected Long id;
    protected Date fechacita;
    protected int horacita;
    protected Paciente paciente;
    protected Medico Medico;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechacita() {
        return fechacita;
    }

    public void setFechacita(Date fechacita) {
        this.fechacita = fechacita;
    }

    public int getHoracita() {
        return horacita;
    }

    public void setHoracita(int horacita) {
        this.horacita = horacita;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return Medico;
    }

    public void setMedico(Medico Medico) {
        this.Medico = Medico;
    }
    
    
}
