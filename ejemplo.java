public class ejemplo {
    private String nom = "jordi";

    public void printNomLetterByLetter() {
        for (int i = 0; i < nom.length(); i++) {
            System.out.println(nom.charAt(i));
        }
    }

    public static void main(String[] args) {
        ejemplo associacio = new ejemplo();
        associacio.printNomLetterByLetter();
    }
}
