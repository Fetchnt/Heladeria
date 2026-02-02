package co.edu.unbosque.util.exception;

public class LanzadorDeException {

	public static void verificarNumNegativo(int n) throws NumeroNegativoException { // Funcion de verificacion para
		// lanzar la exception
		if (n <= -1) {
			throw new NumeroNegativoException();
		}
	}

	public static void verificarSimbolo(String s) throws SimbolosException {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// Si no es letra, ni dígito, ni espacio, es un símbolo o caracter no imprimible
			if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
				throw new SimbolosException();
			}
		}
	}

	public static void verificarVacio(String s) throws LineaVaciaException {
		if (s.isEmpty() || s.isBlank()) {
			throw new LineaVaciaException();
		}
	}

	public static void verificarCaracterInvalido(char c) throws CaracterInvalidoException {
		c = Character.toUpperCase(c);
		if (c != 'M' && c != 'F') {
			throw new CaracterInvalidoException();
		}
	}
	public static void verificarCaracterInvalidoHermafrodita(char c) throws CaracterInvalidoHermafroditaException {
		c = Character.toUpperCase(c);
		if (c != 'M' && c != 'F' && c != 'H') {
			throw new CaracterInvalidoHermafroditaException();
		}
	}

	public static void verificarStringInvalido(String s) throws StringInvalidoException{
		if (!s.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
	        throw new StringInvalidoException();
	    }
	}
}
