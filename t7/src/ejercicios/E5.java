package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E5 {
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, Integer> TV = new HashMap<>();

	public static void main(String[] args) {
		int menu;
		do {
			menu();
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				agregarSerie();
				break;
			case 2:
				buscarSerie();
				break;
			case 3:
				eliminarSerie();
				break;
			}
		} while (menu != 4);

	}

	static void agregarSerie() {
		sc.nextLine();
		String nombre = "";
		int valoracion;
		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();
		System.out.println("Introduzca la valoracion");
		valoracion = sc.nextInt();
		TV.put(nombre, valoracion);
	}

	static void buscarSerie() {
		sc.nextLine();
		String nombre = "";
		System.out.println("Introduzca el nombre");
		nombre = sc.nextLine();
		for (Map.Entry<String, Integer> tele : TV.entrySet()) {
			if (tele.getKey().equals(nombre)) {
				System.out.println("Valoracion=" + tele.getValue());
			}
		}
	}

	static void eliminarSerie() {
		sc.nextLine();
		System.out.println("Introduzca el nombre");
		String nombre = "";
		nombre = sc.nextLine();
		TV.remove(nombre);

	}

	static void menu() {
		System.out.println("1.Agregar serie \n" + "2.Buscar seire \n" + "3.Elimianr serie \n" + "4.Salir");
	}
}
