package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<>();
		String nombre = "";

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca el nombre");
			nombre = sc.nextLine();
			for (int j = 0; j < lista.size(); j++) {
				while (nombre.equals(lista.get(j))) {
					System.out.println("Nombre repetido");
					System.out.println("Introduzca el nombre");
					nombre = sc.nextLine();

				}
			}

			lista.add(nombre);

		}
		Collections.reverse(lista);
		System.out.println(lista);
		sc.close();
	}
}
