package views;
import controllers.EmpleadoController;


public class EmpleadoView {
	public static void main(String[] args) {
				//Create
				//String empleado = new EmpleadoController().createEmpleado("Solorzano", "Melissa", 30, "F", 3000);
				String empleado = new EmpleadoController().createEmpleado("Ortiz de Orue", "Jeffer", 32, "M", 6000);
				System.out.println(empleado);
				//String empleado = new EmpleadoController().createEmpleado("Zavaleta", "Pancho", 3, "M", 1000);
				
				//Read
				//Empleado empleado1 = new EmpleadoController().readerEmpleado(2);
				//System.out.println(empleado1);
				
				//Delete
				//String empleado = new EmpleadoController().deleteEmpleado(2);
				
				
				//Update
				//String empleado = new EmpleadoController().updateEmpleado(1,"Ortiz Zavaleta", "Beto", 4, "M", 800);
	}

}
