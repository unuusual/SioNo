package interfaz;

import java.util.Scanner;

import dominio.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Persona pregunta = new Persona();
		
		System.out.println("Escriba su pregunta");
		String scanner = entrada.next();
		
		pregunta.siONo();

	}

}
