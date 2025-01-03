package Classes;
// FET PER :DIEGO MARQUEZ 

public class LlistaAccions {
    private Accions[] accions;
    private int numAccions;

    // Constructor
    public LlistaAccions(int capacitat) {
        accions = new Accions[capacitat];
        numAccions = 0;
    }

    // Afegeix una acció a la llista
    public void afegirAccio(Accions accio) {
        if (numAccions < accions.length) {
            accions[numAccions] = accio;
            numAccions++;
        } else {
            System.out.println("La llista està plena. No es poden afegir més accions.");
        }
    }

    // Obté una acció d'una posició específica
    public Accions getAccio(int pos) {
        if (pos >= 0 && pos < numAccions) {
            return accions[pos];
        } else {
            return null;
        }
    }

    // Retorna el número d'accions a la llista
    public int getNumAccions() {
        return numAccions;
    }

    // Cerca una acció per títol
    public Accions cercaPerTitol(String titol) {
        for (int i = 0; i < numAccions; i++) {
            if (accions[i].getTitol().equalsIgnoreCase(titol)) {
                return accions[i];
            }
        }
        return null;
    }

    // Retorna totes les accions com a String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Llista d'Accions: \n");
        for (int i = 0; i < numAccions; i++) {
            sb.append((i + 1) + ". " + accions[i].toString() + "\n");
        }
        return sb.toString();
    }
}
