package ejercicioCuatro;

/**
 * 
 * @author Jesús Morgado Fernández
 * @version 1.0
 * @since 03/06/2021
 * 
 */
import java.util.Scanner;

public class GestionVacunas {

	/**
	 * Método main, recoge los datos del paciente y de las vacunas según su tipo, en
	 * este caso, los datos son introducidos por teclado,.
	 * 
	 * @param args
	 * @param nombrePaciente   = nombre del paciente
	 * @param dniPaciente      = dni del paciente
	 * @param tipoVacuna       = el tipo de la vacuna, 1 o 2
	 * @param nombreVacuna1    = nombre de la vacuna 1
	 * @param nombreVacuna2    = nombre de la vacuna 2
	 * @param fechaVacunacion1 = fecha de vacunación para la vacuna 2
	 * @param fechaVacunacion2 = fecha de vacunación para la vacuna 2
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombrePaciente, dniPaciente, tipoVacuna = "", nombreVacuna1 = "", nombreVacuna2 = "",
				fechaVacunacion1 = "", fechaVacunacion2 = "";

		System.out.println("Introduzca el nombre del paciente:");
		nombrePaciente = teclado.next();
		System.out.println("Introduzca el dni del paciente:");
		dniPaciente = teclado.next();
		System.out.println("¿Vacuna 1 o 2?");
		tipoVacuna = teclado.next();

		if (tipoVacuna.equals("1")) {
			System.out.println("Introduzca la vacuna 1: ");
			nombreVacuna1 = teclado.next();
			System.out.println("Introduzca el mes de vacunación de vacuna 1:");
			fechaVacunacion1 = teclado.next();

		} else if (tipoVacuna.equals("2")) {

			System.out.println("Introduzca la vacuna 2: ");
			nombreVacuna2 = teclado.next();
			System.out.println("Introduzca el mes de vacunación de vacuna 2:");
			fechaVacunacion2 = teclado.next();

		} else {
			System.out.println("Error");
		}

		datosVacunacion(nombrePaciente, dniPaciente, nombreVacuna1, nombreVacuna2, fechaVacunacion1, fechaVacunacion2);

		datosVacunados(nombrePaciente, nombreVacuna1, nombreVacuna2);
	}

	/**
	 * Método que muestra los datos de los pacientes vacunados al menos una vez
	 * según el tipo de vacuna.
	 * 
	 * @param nombrePaciente = nombre del paciente
	 * @param nombreVacuna1  = nombre de la vacuna 1
	 * @param nombreVacuna2  = nombre de la vacuna 2
	 */
	private static void datosVacunados(String nombrePaciente, String nombreVacuna1, String nombreVacuna2) {
		if (nombreVacuna2.equals("")) {
			if (nombreVacuna1.equals("Moderna")) {
				System.out.println("El paciente " + nombrePaciente + " debe esperar 5 meses para la vacuna 2 ");
			} else if (nombreVacuna1.equals("Pfizer")) {
				System.out.println("El paciente " + nombrePaciente + "debe esperar 4 meses para la vacuna 2 ");
			} else if (nombreVacuna1.equals("Janssen")) {
				System.out.println("El paciente está ya vacuando");
			} else {
				System.out.println("El paciente " + nombrePaciente + " est� ya vacunado ");
			}
		}
	}

	/**
	 * Método que muestra los datos de la vacunación, según el tipo de vacuna y la
	 * fecha.
	 * 
	 * @param nombrePaciente   = nombre del paciente
	 * @param dniPaciente      = dni del paciente
	 * @param nombreVacuna1    = nombre de la vacuna 1
	 * @param nombreVacuna2    = nombre de la vacuna 2
	 * @param fechaVacunacion1 = fecha de vacunación para la vacuna 2
	 * @param fechaVacunacion2 = fecha de vacunación para la vacuna 2
	 */
	private static void datosVacunacion(String nombrePaciente, String dniPaciente, String nombreVacuna1,
			String nombreVacuna2, String fechaVacunacion1, String fechaVacunacion2) {
		System.out.println("VACUNACIÓN PACIENTE " + nombrePaciente + "-" + dniPaciente + "_________________");
		System.out.println("Vacuna 1 " + nombreVacuna1 + " Fecha:" + fechaVacunacion1);
		System.out.println("Vacuna 2 " + nombreVacuna2 + " Fecha:" + fechaVacunacion2);
	}
}
