package Classes;
// FET PER :DIEGO MARQUEZ I CLARA PUIG

public class LlistaMembres {
    private Membre[] membres;
    private int numMembres;

    // Constructor
    public LlistaMembres(int capacitat) {
        membres = new Membre[capacitat];
        numMembres = 0;
    }

    // Afegeix un membre a la llista
    public void afegirMembre(Membre membre) {
        if (numMembres < membres.length) {
            membres[numMembres] = membre;
            numMembres++;
        } else {
            System.out.println("La llista està plena. No es poden afegir més membres.");
        }
    }

    // Obté un membre d'una posició específica
    public Membre getMembre(int pos) {
        if (pos >= 0 && pos < numMembres) {
            return membres[pos];
        } else {
            return null;
        }
    }

    // Retorna el número de membres a la llista
    public int getNumMembres() {
        return numMembres;
    }

    // Cerca un membre per àlies
    public Membre cercaPerAlies(String alies) {
        for (int i = 0; i < numMembres; i++) {
            if (membres[i].getAlies().equalsIgnoreCase(alies)) {
                return membres[i];
            }
        }
        return null;
    }

    // Retorna tots els membres com a String
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Llista de Membres: \n");
        for (int i = 0; i < numMembres; i++) {
            sb.append((i + 1) + ". " + membres[i].toString() + "\n");
        }
        return sb.toString();
    }
}
