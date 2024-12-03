import java.io.BufferedReader;
import java.io.File; // Import the File class 
import java.io.FileReader;
import java.io.IOException; // Import the IOException class

public class usa {
    private static File membres = new File("membres.txt");

    public static void main(String[] args) {

        // Crear una instancia de la clase Associacio
        Associacio associacio = new Associacio("", "", "", "", "", "", "");

        //System.out.println("President: " + associacio.getPresident());
        //System.out.println("Secretari: " + associacio.getSecretari());
        //System.out.println("Tresorer: " + associacio.getTresorer());

        // Leer datos del archivo "membres.txt"
        try (BufferedReader reader = new BufferedReader(new FileReader(membres))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                associacio.afegirValores(parts[0], parts[1], parts[2]);

                System.out.println("correo: " + associacio.getCorreu() + "nom: " + associacio.getNom()          
                + "titulacio: " + associacio.getTitulacio());


            }

            
        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
