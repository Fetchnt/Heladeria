package co.edu.unbosque.model.persistence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

public class FileHandler {

	public static File archivo;
	public static PrintWriter escritor;
	public static Scanner lector;
	public static FileInputStream fis;
	public static ObjectInputStream ois;
	public static FileOutputStream fos;
	public static ObjectOutputStream oos;
	public static Properties prop;

	public static void escribirEnArchivoTexto(String url, String contenido) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			escritor = new PrintWriter(archivo);
			escritor.println(contenido);
			escritor.close();
		} catch (IOException e) {
			System.err.println("Error al crear y escribir el archivo de texto.");
			System.out.println(e.getMessage());
		}
	}

	public static String leerDesdeArchivoTexto(String url) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}

			lector = new Scanner(archivo);
			String contenido = "";
			while (lector.hasNext()) {
				contenido += lector.nextLine() + "\n";
			}
			lector.close();
			return contenido;

		} catch (IOException e) {
			System.err.println("Error al leer el archivo de texto.");
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static void escribirEnArchivoSerializado(String url, Object contenido) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			fos = new FileOutputStream(archivo);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(contenido);
			oos.close();
			fos.close();

		} catch (IOException e) {
			System.err.println("Error al escribir el archivo serializado.");
			e.printStackTrace();
		}
	}

	public static Object leerDesdeArchivoSerializado(String url) {
		try {
			archivo = new File(url);

			if (!archivo.exists() || archivo.length() == 0) {
				return null;
			}

			fis = new FileInputStream(archivo);
			ois = new ObjectInputStream(fis);
			Object contenido = ois.readObject();

			ois.close();
			fis.close();
			return contenido;

		} catch (IOException e) {
			System.err.println("Error al leer el archivo serializado.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Error al deserializar los datos del usuario.");
			e.printStackTrace();
		}
		return null;
	}

	public static Properties cargarArchivoPropiedades(String url) {
		try {
			archivo = new File(url);
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
			prop = new Properties();
			prop.load(new FileInputStream(archivo));
			return prop;

		} catch (IOException e) {
			System.err.println("Error al cargar el archivo de propiedades.");
			e.printStackTrace();
		}
		return null;
	}
}
