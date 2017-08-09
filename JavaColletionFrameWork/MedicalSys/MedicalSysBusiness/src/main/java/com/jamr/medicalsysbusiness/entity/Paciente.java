
package com.jamr.medicalsysbusiness.entity;

import java.util.Comparator;

public class Paciente extends Persona {
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    @Override
    public String toString() {
        return "" + nombre + " " + apellido + " " + fechanac + "" + cedula + ""+ sexo + "" + telefono + "" + direccion + "" + correo + "" + codigo + "";
    }

    public static Comparator<Paciente> NombresComparator = new Comparator<Paciente>() {

        @Override
        public int compare(Paciente o1, Paciente o2) {
            return o1.getNombre().compareTo(o2.getNombre());

        }
    };

    public static Comparator<Paciente> ApellidosComparator = new Comparator<Paciente>() {
        @Override
        public int compare(Paciente o1, Paciente o2) {
            return o1.getApellido().compareTo(o2.getApellido());

        }

    };

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Paciente) {
            Paciente paciente = (Paciente) obj;

            if (this.nombre.equals(paciente.getNombre())
                    && this.apellido.equals(paciente.getApellido())
                    && this.codigo.equals(paciente.getCodigo())
                    && this.id.intValue()==paciente.getId().intValue()) {
                return true;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        if (this.nombre != null
                && this.apellido != null
                && this.id != null
                && this.codigo != null) {
            return (int) 7 * this.nombre.length() + this.apellido.length()+ this.id.intValue() + this.codigo.length();
        }
        return 45;
    }
    
    
}
