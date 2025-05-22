package TP_N2;

public class Adulto extends Paciente implements ClinicaMedica {
    private int sistolica;
    private int diastolica;
    private double altura;
    private double peso;

    public int getSistolica() {
        return sistolica;
    }

    public int getDiastolica() {
        return diastolica;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public Adulto(String dni, String nombre, String obraSocial, int sistolica, int diastolica, double altura, double peso) {
        super(dni, nombre, obraSocial);

        if (sistolica < 90 || sistolica > 200) {
            throw new IllegalArgumentException("Valor de presión sistólica fuera de rango (90–200).");
        }
        if (diastolica < 60 || diastolica > 130) {
            throw new IllegalArgumentException("Valor de presión diastólica fuera de rango (60–130).");
        }

        this.sistolica = sistolica;
        this.diastolica = diastolica;
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