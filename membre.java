public abstract class Membre {
    private String alies;
    private String emailInstitucional;
    private String dataAlta;
    private String dataBaixa;
    
    // Constructor
    public Membre(String alies, String emailInstitucional, String dataAlta) {
        this.alies = alies;
        this.emailInstitucional = emailInstitucional;
        this.dataAlta = dataAlta;
    }
    
    // Getters i Setters
    public String getAlies() {
        return alies;
    }

    public void setAlies(String alies) {
        this.alies = alies;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(String dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

    public boolean esActiu() {
        return dataBaixa == null;
    }
    
    @Override
    public String toString() {
        return "Membre{" +
                "alies='" + alies + '\'' +
                ", emailInstitucional='" + emailInstitucional + '\'' +
                ", dataAlta=" + dataAlta +
                ", dataBaixa=" + dataBaixa +
                '}';
    }
}
