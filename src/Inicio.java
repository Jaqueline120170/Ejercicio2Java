import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inicio {
	public static void main(String[] args) {
		List<Integer> listaNumeros = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Introduce otro número entero: ");
			numero = sc.nextInt();
			listaNumeros.add(numero);

		} while (numero != 0);
		System.out.println("Lista de numeros introducidos:");
		for (int num : listaNumeros) {
			System.out.println(num + " ");
		}
		reemplazar(listaNumeros);
	}

	static void reemplazar(List<Integer> listaNumeros) {
		System.out.println("\nLista de numeros: ");
		for (int i = 0; i < listaNumeros.size(); i++) {
			for (int j = i + 1; j < listaNumeros.size(); j++) {
				if (listaNumeros.get(i) == listaNumeros.get(j)) {
					listaNumeros.set(j, 0);
				}
			}
		}
		for (int num : listaNumeros) {
			System.out.println(num + " ");
		}
	}
}