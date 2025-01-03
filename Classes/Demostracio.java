package Classes;
// FET PER :CLARA PUIG

public class Demostracio extends Accions {
    private String dataDisseny; // Data en què es va dissenyar
    private boolean esValida; // Si encara és vàlida
    private int comptadorOfertes; // Quantes vegades s'ha ofert
    private double costMaterials; // Cost de crear els materials

    // Constructor
    public Demostracio(String nomAssociacio, String titol, Membre responsable, String dataDisseny, boolean esValida, double costMaterials, int capacitat) {
        super(nomAssociacio, titol, responsable, capacitat);
        this.dataDisseny = dataDisseny;
        this.esValida = esValida;
        this.comptadorOfertes = 0; // Inicialment no s'ha ofert
        this.costMaterials = costMaterials;
    }

    // Getters i Setters
    public String getDataDisseny() {
        return dataDisseny;
    }

    public void setDataDisseny(String dataDisseny) {
        this.dataDisseny = dataDisseny;
    }

    public boolean isEsValida() {
        return esValida;
    }

    public void setEsValida(boolean esValida) {
        this.esValida = esValida;
    }

    public int getComptadorOfertes() {
        return comptadorOfertes;
    }

    public void incrementarComptadorOfertes() {
        this.comptadorOfertes++;
    }

    public double getCostMaterials() {
        return costMaterials;
    }

    public void setCostMaterials(double costMaterials) {
        this.costMaterials = costMaterials;
    }

    @Override
    public String toString() {
        return "Demostracio{" +
                "codi='" + getCodi() + '\'' +
                ", titol='" + getTitol() + '\'' +
                ", responsable='" + getResponsable().getAlies() + '\'' +
                ", dataDisseny='" + dataDisseny + '\'' +
                ", esValida=" + esValida +
                ", comptadorOfertes=" + comptadorOfertes +
                ", costMaterials=" + costMaterials +
                '}';
    }
}
