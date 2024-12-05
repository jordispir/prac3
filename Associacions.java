import java.io.BufferedReader;
import java.io.File; // Import the File class 
import java.io.FileReader;
import java.io.IOException; // Import the IOException class
import java.util.Scanner;

public class Associacions {
    private String nom;
    private String correu; 
    private String[] titulacions; 

    private LlistaMembres membres; 

    private Membre president;
    private Membre secretari;
    private Membre tresorer;

    // Constructor
    public Associacions(String nom, String correu, String[] titulacions) {
        this.nom = nom;
        this.correu = correu;
        this.titulacions = titulacions;
        this.membres = new LlistaMembres(); // Crear una nueva lista de miembros
    }

    public void assignarPresident(Membre membre) {
        if (membre.esAlumne()) {
            this.president = membre;
            System.out.println("President assignat: " + membre.getAlias());
        } else {
            System.out.println("Només un alumne pot ser president.");
        }
    }

    public void assignarSecretari(Membre membre) {
        if (membre.esAlumne()) {
            this.secretari = membre;
            System.out.println("Secretari assignat: " + membre.getAlias());
        } else {
            System.out.println("Només un alumne pot ser secretari.");
        }
    }

    public void assignarTresorer(Membre membre) {
        if (membre.esAlumne()) {
            this.tresorer = membre;
            System.out.println("Tresorer assignat: " + membre.getAlias());
        } else {
            System.out.println("Només un alumne pot ser tresorer.");
        }
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getCorreu() {
        return correu;
    }

    public String[] getTitulacions() {
        return titulacions;
    }

    public LlistaMembres getMembres() {
        return membres;
    }

    public Membre getPresident() {
        return president;
    }

    public Membre getSecretari() {
        return secretari;
    }

    public Membre getTresorer() {
        return tresorer;
    }

    // ToString
    public String toString() {
    return "Associació: " + nom + "\n" +
           "Correu: " + correu + "\n" +
           "President: " + president.getAlias() + "\n" +
           "Secretari: " + secretari.getAlias() + "\n" +
           "Tresorer: " + tresorer.getAlias() + "\n";
}

}


