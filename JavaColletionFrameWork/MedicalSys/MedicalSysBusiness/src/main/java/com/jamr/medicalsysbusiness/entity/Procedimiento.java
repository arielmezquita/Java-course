
package com.jamr.medicalsysbusiness.entity;

public class Procedimiento extends Catalogo {
    private Diagnostico diagnostico;

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }
    
}
