public class Xerrades extends Accions {
    private String dataXerrada;
    private LlistaMembres membresImpartidors; // Màxim 3 membres
    private int assistents;
    private int valoracions; // Valoracions de l'assistent (escala [0-10])

    private static int numImpartidors = 0;

    // Constructor
    public Xerrades(String nomAssociacio, String titol, Membre responsable, String dataXerrada) {
        super(nomAssociacio, titol, responsable); // Cridem al constructor de la classe pare
        this.dataXerrada = dataXerrada;
        this.membresImpartidors = new LlistaMembres();
        this.assistents = 0;
        this.valoracions = 0;
    }

    // Afegeix un membre com a impartidor (només fins a 3 membres)
    public void afegirImpartidor(Membre impartidor) {
        if (membresImpartidors.length < 3) {
            membresImpartidors[numImpartidors] = impartidor;
            numImpartidors++;
            System.out.println("Impartidor afegit: " + impartidor.getAlies());
        } else {
            System.out.println("No es poden afegir més impartidors. Màxim 3.");
        }
    }

    // Afegeix assistents a la xerrada
    public void afegirAssistents(int numAssistents) {
        this.assistents += numAssistents;
        System.out.println("Assistents afegits: " + numAssistents + ". Total assistents: " + this.assistents);
    }

    // Afegeix una valoració de l'assistent
    public void afegirValoracio(int valoracio) {
        if (valoracio >= 0 && valoracio <= 10) {
            valoracions += valoracio;
            System.out.println("Valoració afegida: " + valoracio);
        } else {
            System.out.println("Valoració no vàlida. Ha de ser un nombre entre 0 i 10.");
        }
    }

    // Getters
    public String getDataXerrada() {
        return dataXerrada;
    }

    public LlistaMembres getMembresImpartidors() {
        return membresImpartidors;
    }

    public int getAssistents() {
        return assistents;
    }

    public int getValoracions() {
        return valoracions;
    }
    
    // ToString
    public String toString() {
        return "Xerrada: " + this.getTitol() + "\nData: " + dataXerrada + "\nImpartidors: " + membresImpartidors.toString() + " assistents: " + assistents;
    }
}

