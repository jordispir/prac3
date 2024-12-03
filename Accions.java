public class Accions {
    private String nom;
    private String codi;
    private int num;
    private String titol;
    //lista asociaciones;
    private Membre responsable;

    public Accions(String codi, int num, String titol) {
        this.codi = codi;
        this.num = num;
        this.titol = titol;
    }

    public void construirCodi() {
        for (int i = 0; i < nom.length(); i++){
        codi.charArt(i) = nom.charAt(i);
        }    
    }
    
}