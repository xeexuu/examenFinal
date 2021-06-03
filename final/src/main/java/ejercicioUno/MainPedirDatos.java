package ejercicioUno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainPedirDatos {

	public static final Logger LOG = LogManager.getLogger(MainPedirDatos.class);

	public static void main(String[] args) {

		List lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);

		int valor;
		do {
			System.out.println("Introduzca un valor: (0 para salir)");
			valor = teclado.nextInt();
			Nodo nodo = new Nodo(valor);
			if (valor % 2 == 0) {
				LOG.debug("SE HA INTRODUCIDO UN VALOR PAR");
			} else {
				LOG.info("SE HA INTRODUCIDO UN VALOR IMPAR");
			}
			if (valor != 0) {
				lista.add(nodo);
			}
		} while (valor != 0);
	}
}
