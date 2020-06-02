package Abstractas;

public class AbstractsTest {

	public static void main(String[] args) {
		Oveja oveja = new Oveja("Dory", 4);
		oveja.saludar();
		System.out.println(oveja.nombre);
		System.out.println(oveja.patas);
		oveja.commer();
		oveja.sonido();
	}

}
