import java.io.BufferedReader;
import java.io.File; // Import the File class 
import java.io.FileReader;
import java.io.IOException; // Import the IOException class
import java.util.Scanner;



public class Associacions{
	private String name;
	private File file = new File("menu.txt");
	private File acciones = new File("acciones.txt");
	private File membres = new File("membres.txt");
	private Scanner scanner = new Scanner(System.in);
	private int opcionInt;
	private final String[] titulaciones = {"GEB", "GEI", "GESST", "BioGEI", "GEB-GESST", "externETSE"};


	public Associacions(){
		name = "jordi";

	}


	public String giveName(){
		return name;
	}

	public void Menu(){
		try(BufferedReader reader = new BufferedReader(new FileReader(file) ) )  {
			String line;

			while( (line = reader.readLine() ) != null){
				System.err.println(line);
			}
		}

		catch(IOException e){
			e.printStackTrace();

		}


	}

	public void clearConsole() {
		try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				new ProcessBuilder("clear").inheritIO().start().waitFor();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void ejecuta(){
		
		while (opcionInt != 5){
			Menu();

			System.out.print("Selecciona Opció: ");
			String opcion = scanner.nextLine();  // Read user input
			clearConsole();

			int opcionInt = Integer.parseInt(opcion);


			if(opcionInt == 1){
				try(BufferedReader reader = new BufferedReader(new FileReader(acciones) ) )  {
					String line;
		
					while( (line = reader.readLine() ) != null){
						String[] valores = line.split(";");
						System.err.println("Associacion: " + valores[0]);
					}
				}
		
				catch(IOException e){
					e.printStackTrace();
		
				}

				System.out.print("intro para continuar: ");
				String continuar = scanner.nextLine();  // Read user input
				clearConsole();



			}

			else if(opcionInt == 2){
				try(BufferedReader reader = new BufferedReader(new FileReader(membres) ) )  {					

					for (int i = 0; i < titulaciones.length; i++)
						System.out.println(titulaciones[i]);

					System.out.print("selecciona la asociación de la que quieres listar los miembros: ");
					String asociacion = scanner.nextLine();  // Read user input
					clearConsole();

					String line;
                    while ((line = reader.readLine()) != null) {
                        String[] valores = line.split(";");

                        // Comparar el valor de la asociación en el archivo (valores[3]) con la seleccionada
                        if (valores.length > 3 && valores[3].equals(asociacion)) {
                            // Imprimir detalles del miembro
                            System.out.println("Alias: " + valores[0]);
                            System.out.println("Email: " + valores[1]);
                            System.out.println("Tipo: " + valores[2]);
                            System.out.println("Asociación: " + valores[3]);
                            System.out.println("Años/Departamento: " + valores[4]);
                            System.out.println("Fecha de alta: " + valores[5]);
                            System.out.println("Fecha de baja: " + (valores[6].isEmpty() ? "N/A" : valores[6]));
                            System.out.println("Graduado: " + (valores.length > 7 ? valores[7] : "N/A"));
                        }
                    }}
		
		
				catch(IOException e){
					e.printStackTrace();
		
				}

				System.out.print("intro para continuar: ");
				String continuar = scanner.nextLine();  // Read user input
				clearConsole();
				

			}

			else if(opcionInt == 3){

				try(BufferedReader reader = new BufferedReader(new FileReader(membres) ) )  {
					String line;
		
					while( (line = reader.readLine() ) != null){
						String[] valores = line.split(";");
						System.out.println(valores[0] + " " + valores[2]);
						



					}
				}
		
				catch(IOException e){
					e.printStackTrace();
		
				}
				
				System.out.print("intro para continuar: ");
				String continuar = scanner.nextLine();  // Read user input
				clearConsole();

				
			}


			else
			{
				System.out.println("opción no reconocida!");
			}

	

	}
}		
	

	public static void main(String[] args){
		Associacions associacion = new Associacions();
		associacion.ejecuta();
	}

}


