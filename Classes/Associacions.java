package Classes;

public class Associacions {
    private String nom;
    private String correu; 
    private String[] titulacions; 

    private LlistaMembres membres; 

    private Membre president;
    private Membre secretari;
    private Membre tresorer;

    // Constructor
    public Associacions(String nom, String correu, String[] titulacions, int capacitat) {
        this.nom = nom;
        this.correu = correu;
        this.titulacions = titulacions;
        this.membres = new LlistaMembres(capacitat); // Crear una nueva lista de miembros 
    }

    public void assignarPresident(Membre membre) {
        if (membre.esActiu()) {
            this.president = membre;
            System.out.println("President assignat: " + membre.getAlies());
        } else {
            System.out.println("Només un alumne pot ser president.");
        }
    }

    public void assignarSecretari(Membre membre) {
        if (membre.esActiu()) {
            this.secretari = membre;
            System.out.println("Secretari assignat: " + membre.getAlies());
        } else {
            System.out.println("Només un alumne pot ser secretari.");
        }
    }

    public void assignarTresorer(Membre membre) {
        if (membre.esActiu()) {
            this.tresorer = membre;
            System.out.println("Tresorer assignat: " + membre.getAlies());
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
           "President: " + president.getAlies() + "\n" +
           "Secretari: " + secretari.getAlies() + "\n" +
           "Tresorer: " + tresorer.getAlies() + "\n";
}

}


