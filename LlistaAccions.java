public class LlistaAccions {
    private Accions[] accions;
    private int numAccions;

    public LlistaAccions(int capacitat) {
        accions = new Accions[capacitat];
        numAccions = 0;
    }

    public void afegirAccio(Accions accio) {
        if (numAccions < accions.length) {
            accions[numAccions] = accio;
            numAccions++;
        }
    }

    public Accions getAccio(int pos) {
        if (pos >= 0 && pos < numAccions) {
            return accions[pos];
        } else {
            return null;
        }
    }

    public int getNumAccions() {
        return numAccions;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Llista d'Accions: \n");
        for (int i = 0; i < numAccions; i++) {
            sb.append((i + 1) + ". " + accions[i].toString() + "\n");
        }
        return sb.toString();
    }
}
