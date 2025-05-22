package TP_N2;

public abstract class Paciente {
    protected String dni;
    protected String nombre;
    protected String obraSocial;

    public Paciente(String dni, String nombre, String obraSocial) {
        this.dni = dni;
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public abstract String getCobertura();
    public abstract double getDescuento();
    public abstract String getVademecum();
}