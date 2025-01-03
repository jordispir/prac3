// FET PER :DIEGO MARQUEZ I CLARA PUIG



public class LlistaAssociacions {
    private Associacions[] associacions;
    private int numAssociacions;

    // Constructor
    public LlistaAssociacions(int capacitat) {
        associacions = new Associacions[capacitat];
        numAssociacions = 0;
    }

    // Afegeix una associació a la llista
    public void afegirAssociacio(Associacions associacio) {
        if (numAssociacions < associacions.length) {
            associacions[numAssociacions] = associacio;
            numAssociacions++;
        } else {
            System.out.println("La llista està plena. No es poden afegir més associacions.");
        }
    }

    // Obté una associació d'una posició específica
    public Associacions getAssociacio(int pos) {
        if (pos >= 0 && pos < numAssociacions) {
            return associacions[pos];
        } else {
            return null;
        }
    }

    // Retorna el número d'associacions a la llista
    public int getNumAssociacions() {
        return numAssociacions;
    }

    // Cerca una associació per nom
    public Associacions cercaPerNom(String nom) {
        for (int i = 0; i < numAssociacions; i++) {
            if (associacions[i].getNom().equalsIgnoreCase(nom)) {
                return associacions[i];
            }
        }
        return null;
    }

    // Retorna totes les associacions com a String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Llista d'Associacions: \n");
        for (int i = 0; i < numAssociacions; i++) {
            sb.append((i + 1) + ". " + associacions[i].toString() + "\n");
        }
        return sb.toString();
    }
}

