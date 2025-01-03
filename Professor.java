// FET PER :DIEGO MARQUEZ I CLARA PUIG


public class Professor extends Membre {
    private String departament; // DEIM o DEEEA
    private int numeroDespatx;

    // Constructor
    public Professor(String alies, String emailInstitucional, String dataAlta, String departament, int numeroDespatx) {
        super(alies, emailInstitucional, dataAlta);
        if (!departament.equals("DEIM") && !departament.equals("DEEEA")) {
            throw new IllegalArgumentException("El departament ha de ser DEIM o DEEEA");
        }
        this.departament = departament;
        this.numeroDespatx = numeroDespatx;
    }

    // Getters i Setters
    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        if (!departament.equals("DEIM") && !departament.equals("DEEEA")) {
            throw new IllegalArgumentException("El departament ha de ser DEIM o DEEEA");
        }
        this.departament = departament;
    }

    public int getNumeroDespatx() {
        return numeroDespatx;
    }

    public void setNumeroDespatx(int numeroDespatx) {
        this.numeroDespatx = numeroDespatx;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "alies='" + getAlies() + '\'' +
                ", emailInstitucional='" + getEmailInstitucional() + '\'' +
                ", dataAlta='" + getDataAlta() + '\'' +
                ", dataBaixa='" + getDataBaixa() + '\'' +
                ", departament='" + departament + '\'' +
                ", numeroDespatx=" + numeroDespatx +
                '}';
    }
}
