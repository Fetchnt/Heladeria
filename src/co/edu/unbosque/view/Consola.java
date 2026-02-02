package co.edu.unbosque.view;

import java.util.Scanner;

public class Consola {

	private Scanner sc;

	public Consola() {
		sc = new Scanner(System.in);
	}

	public int leerNumeroEntero() {
		return sc.nextInt();
	}

	public float leerFlotante() {
		return sc.nextFloat();
	}

	public double leerDoble() {
		return sc.nextDouble();
	}

	public long leerLong() {
		return sc.nextLong();
	}

	public char leerChar() {
		return sc.next().charAt(0);
	}

	public String leerLineaCompleta() {
		return sc.nextLine();
	}

	public String leerPalabra() {
		return sc.next();
	}

	public boolean leerBooleano() {
		String entrada = leerLineaCompleta();
		if (entrada.toLowerCase().contains("si")) {
			return true;
		} else {
			return false;
		}
	}

	public void escribirLineaConSalto(String texto) {
		System.out.println(texto);
	}

	public void escribirLineaSinSalto(String texto) {
		System.out.print(texto);
	}

	public void escribirLineaDeError(String texto) {
		System.err.println(texto);
	}

	public byte numeroDeRegistros() {
		return sc.nextByte();
	}

	public void quemarLinea() {
		sc.nextLine();
	}
}
