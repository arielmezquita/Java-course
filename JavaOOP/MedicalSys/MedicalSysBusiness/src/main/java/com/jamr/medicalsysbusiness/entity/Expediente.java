
package com.jamr.medicalsysbusiness.entity;


public class Expediente {
    private Paciente paciente;
    private Diagnostico diagnostico;

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    
    
    
}
