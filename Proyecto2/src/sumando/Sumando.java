package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num1 = scan.nextInt();
		System.out.print("Introduce otro numero: ");
		int num2 = scan.nextInt();
		System.out.println("Total: " + (num1 + num2));
		scan.close();
	}

}
