package mostrandodatos;

import java.util.Scanner;

public class MonstrandoDatos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Introduce tu nombre: ");
		String nombre = scan.nextLine();
		System.out.print("Introduce tu apellido: ");
		String apellido = scan.nextLine();
		System.out.print("Tus datos: " + nombre + " " + apellido);

		scan.close();

	}

}
