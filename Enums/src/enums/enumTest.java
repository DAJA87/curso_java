package enums;

public class enumTest {

	public static void main(String[] args) {
		System.out.println(Estaciones.class);
		//System.out.println("La longitud "+Estaciones.values().length);
		//System.out.println(Estaciones.values());
		System.out.println(Estaciones.values().toString());
		System.out.println(Estaciones.valueOf("invierno".toUpperCase()));
		String buscar = "Verano".toUpperCase();
		System.out.println(Estaciones.valueOf(buscar));
		System.out.println(Estaciones.PRIMAVERA.name());
		System.out.println(Estaciones.PRIMAVERA.ordinal());
		System.out.println(Estaciones.OTO�O.ordinal());
		
		String primavera = Estaciones.PRIMAVERA.name();
		System.out.println(primavera.equals("PRIMAVERA"));
		System.out.println(primavera.compareTo("primavera")==0);
		
		System.out.println(Array.toArray(Estaciones.values()));
	}

}
