
public class Associacio {
    private String nom;
    private String correu;
    private String titulacions;
    //lista de miembros
    //private membre president;
    //private membre secretari;
   // private membre tresorer;

    // Constructor
    public Associacio(String nom, String correu, String titulacions, String membres, String president, String secretari, String tresorer) {
        this.nom = nom;
        this.correu = correu;
        this.titulacions = titulacions; 
        //this.membres = membres;
        //this.president = president;
       // this.secretari = secretari;
       // this.tresorer = tresorer;
    }

    public void afegirValores(String nom, String correu, String titulacions){
    
        // Solicitar datos al usuario
        this.nom = nom;
        this.correu = correu;
        this.titulacions = titulacions;
       // this.president = president;
       // this.secretari = secretari;
      //  this.tresorer = tresorer;



    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getCorreu() {
        return correu;
    }

    public String getTitulacio() {
        return titulacions;
    }
/*


    
    public String getPresident() {
        return president;
    }

    public String getSecretari() {
        return secretari;
    }

    public String getTresorer() {
        return tresorer;
    }
*/


}