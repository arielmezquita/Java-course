
package com.jamr.sgnomina2017business.entity;


public class Empleado extends Persona{
    private String departamento;
    private String cargo;
    private double sueldo;
    private double descuentoAFP;
    private double descuentoISS;


    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getDescuentoAFP() {
        return getSueldo() * 0.0272;
    }

    public void setDescuentoAFP(double descuentoAFP) {
        this.descuentoAFP = descuentoAFP;
    }

    public double getDescuentoISS() {
        return getSueldo() * 0.0301;
    }

    public void setDescuentoISS(double descuentoISS) {
        this.descuentoISS = descuentoISS;
    }


        //Metodo para mostrar informaciones generales 
    public void mostrarDatosEmpleado(){
    System.out.println("\n --------------------------------");
    System.out.println(" ID de Empleado : "+getId());
    System.out.println(" Nombre : "+getNombre());
    System.out.println(" Cedula: "+getCedula());
    System.out.println(" Cargo : "+getCargo());
    System.out.println("\n Sueldo Bruto: "+getSueldo());
    }
    
    public Empleado mostrarDatosOperador(){
    mostrarDatosEmpleado();    
    System.out.println("\n Descuento AFP: "+getDescuentoAFP());
    System.out.println(" Descuento ISS: "+getDescuentoISS());
    System.out.println(" Descuento Suelto Neto: "+(getSueldo()-(getDescuentoAFP() + getDescuentoISS())));
    System.out.println(" Total a Pagar: "+((getSueldo() - (getDescuentoAFP() + getDescuentoISS()))));
        return null;
    }  
    
}
