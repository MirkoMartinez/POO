package TP_N2;

public class Internado extends Paciente implements Nutricion, ClinicaMedica {
    private String habitacion;
    private int sistolica;
    private int diastolica;
    private String rh;

    public int getSistolica() {
        return sistolica;
    }

    public int getDiastolica() {
        return diastolica;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public String getRh() {
        return rh;
    }

    public Internado(String dni, String nombre, String obraSocial, String habitacion, int sistolica, int diastolica, String rh) {
        super(dni, nombre, obraSocial);

        if (sistolica < 90 || sistolica > 200) {
            throw new IllegalArgumentException("Valor de presión sistólica fuera de rango (90–200).");
        }
        if (diastolica < 60 || diastolica > 130) {
            throw new IllegalArgumentException("Valor de presión diastólica fuera de rango (60–130).");
        }

        this.habitacion = habitacion;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.rh = rh;
    }

    @Override
    public String getCobertura() {
        return "Cobertura internado para OS " + getObraSocial();
    }

    @Override
    public double getDescuento() {
        return 0.05;
    }

    @Override
    public String getVademecum() {
        return "Vademécum para internados";
    }

    @Override
    public String getDieta() {
        return "Dieta controlada hospitalaria";
    }

    @Override
    public String getEstudioRx() {
        return "Rx completa para internado";
    }

    @Override
    public String getEstudioSangre() {
        return "Panel completo de sangre para internado";
    }
}
