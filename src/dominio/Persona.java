package dominio;

public class Persona {
	private String nombre;
	
	public Persona() {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void siONo() {
		int numero = (int) Math.round((Math.random()*2));
		if(numero == 1) {
			System.out.println("Si");
		} else if(numero == 2) {
			System.out.println("No");
		} else {
			System.out.println("Volve a girar");
		}
	}
}
