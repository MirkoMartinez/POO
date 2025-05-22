package TP_N2;

public class Adulto extends Paciente implements ClinicaMedica {
    private String presionArterial;
    private double altura;

    public String getPresionArterial() {
        return presionArterial;
    }

    public double getAltura() {
        return altura;
    }
    private double peso;

    public double getPeso() {
        return peso;
    }

    public Adulto(String dni, String nombre, String obraSocial, String presionArterial, double altura, double peso) {
        super(dni, nombre, obraSocial);
        this.presionArterial = presionArterial;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String getCobertura() {
        return "Cobertura adulta para OS " + getObraSocial();
    }

    @Override
    public double getDescuento() {
        return 0.10;
    }

    @Override
    public String getVademecum() {
        return "Vademécum adulto";
    }

    @Override
    public String getEstudioRx() {
        return "Rx de tórax para adulto";
    }

    @Override
    public String getEstudioSangre() {
        return "Análisis de sangre estándar para adulto";
    }
}