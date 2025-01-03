package Classes;
public class Alumnes extends Membre {
    private String ensenyament; 
    private int anysETSE;
    private boolean esGraduat;

    // Constructor
    public Alumnes(String alies, String emailInstitucional, String dataAlta, String ensenyament, int anysETSE, boolean esGraduat) {
        super(alies, emailInstitucional, dataAlta);
        this.ensenyament = ensenyament;
        this.anysETSE = anysETSE;
        this.esGraduat = esGraduat;
    }

    // Getters i Setters
    public String getEnsenyament() {
        return ensenyament;
    }

    public void setEnsenyament(String ensenyament) {
        this.ensenyament = ensenyament;
    }

    public int getAnysETSE() {
        return anysETSE;
    }

    public void setAnysETSE(int anysETSE) {
        this.anysETSE = anysETSE;
    }

    public boolean isEsGraduat() {
        return esGraduat;
    }

    public void setEsGraduat(boolean esGraduat) {
        this.esGraduat = esGraduat;
    }

    // Sobreescriptura del mètode toString()
    @Override
    public String toString() {
        return "Alumne{" +
                "alies='" + getAlies() + '\'' +
                ", emailInstitucional='" + getEmailInstitucional() + '\'' +
                ", dataAlta=" + getDataAlta() +
                ", dataBaixa=" + getDataBaixa() +
                ", ensenyament='" + ensenyament + '\'' +
                ", anysETSE=" + anysETSE +
                ", esGraduat=" + esGraduat +
                '}';
    }
}
