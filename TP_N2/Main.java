package TP_N2;

public class Main {
    public static void main(String[] args) {
        Pediatrico p = new Pediatrico("123", "Juan", "OSDE", 30.5, "1122334455", "Madre");
        Adulto a = new Adulto("456", "Ana", "Swiss Medical", 120, 80, 1.75, 70);
        Internado i = new Internado("789", "Carlos", "Galeno", "101A", 130, 90, "O+");

        System.out.println(p.getCobertura());
        System.out.println(p.getDieta());

        System.out.println(a.getCobertura());
        System.out.println(a.getEstudioRx());

        System.out.println(i.getCobertura());
        System.out.println(i.getEstudioSangre());
    }
}