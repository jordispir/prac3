package Classes;
public abstract class Accions {
    private String codi;
    private String titol;
    private Membre responsable;
    private LlistaAssociacions associacions;

    private static int contadorAccions = 0;

    // Constructor
    public Accions(String nomAssociacio, String titol, Membre responsable, int capacitat) {
        this.codi = CrearCodi(nomAssociacio);
        this.titol = titol;
        this.responsable = responsable;
        this.associacions = new LlistaAssociacions(capacitat);
    }

   public static String CrearCodi(String nomAssociacio) {
        // Obtener las primeras 3 letras del nombre de la asociación
        String prefix = nomAssociacio.substring(0, Math.min(3, nomAssociacio.length())).toUpperCase();
        
        // Generar el número de la acción con 3 dígitos
        String numAccio = String.format("%03d", contadorAccions); 
        
        // Incrementar el contador para la siguiente acción
        contadorAccions++;
        
        // Devolver el código de la acción
        return prefix + numAccio;
    }


    // Getters
    public String getCodi() {
        return codi;
    }

    public String getTitol() {
        return titol;
    }

    public Membre getResponsable() {
        return responsable;
    }

    public LlistaAssociacions getAssociacions() {
        return associacions;
    }

    // ToString
    public String toString() {
        return "Acció: " + titol + " [codi: " + codi + ", responsable: " + responsable.getAlies() + "]";
    }
}
