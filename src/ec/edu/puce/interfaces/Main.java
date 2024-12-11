package ec.edu.puce.interfaces;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hoy la PUCE");

		Rectangulo rectangulo1 = new Rectangulo();
		rectangulo1.setAltura(25);
		rectangulo1.setBase(10);
		System.out.println("Área del rectágulo es: " + rectangulo1.calcularArea());
	}

}
