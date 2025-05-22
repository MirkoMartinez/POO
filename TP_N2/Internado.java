package TP_N2;

public class Internado extends Paciente implements Nutricion, ClinicaMedica {
    private String habitacion;
    private String presionArterial;

    public String getPresionArterial() {
        return presionArterial;
    }

    public String getHabitacion() {
        return habitacion;
    }
    private String rh;

    public String getRh() {
        return rh;
    }

    public Internado(String dni, String nombre, String obraSocial, String habitacion, String presionArterial, String rh) {
        super(dni, nombre, obraSocial);
        this.habitacion = habitacion;
        this.presionArterial = presionArterial;
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