package TP_N2;


public class Pediatrico extends Paciente implements Nutricion {
    private double peso;
    private String celular;
    private String tutor;

    public double getPeso() {
        return peso;
    }

    public String getTutor() {
        return tutor;
    }

    public String getCelular() {
        return celular;
    }

    public Pediatrico(String dni, String nombre, String obraSocial, double peso, String celular, String tutor) {
        super(dni, nombre, obraSocial);
        this.peso = peso;
        this.celular = celular;
        this.tutor = tutor;
    }

    @Override
    public String getCobertura() {
        return "Cobertura pediátrica para OS " + getObraSocial(); // Acá uso el método definido en Paciente
    }

    @Override
    public double getDescuento() {
        return 0.15; // Acá implemento el método abstracto de Paciente
    }

    @Override
    public String getVademecum() {
        return "Vademécum pediátrico"; // Acá implemento el método abstracto de Paciente
    }

    @Override
    public String getDieta() {
        return "Dieta balanceada infantil"; // y por ultimo Implemento el método de Nutricion
    }
} // cierro la clase