package Programas;

public class Suscripcion {
	private int precio;
	private int periodo;
	
	public Suscripcion(int precio, int periodo) {
		this.precio = precio;
		this.periodo = periodo;
	}
	
	public double precioPorMes() {
		double resultado;
		
		if (periodo <= 0 || precio <= 0) {
			resultado = 0;
		}else {		
			double r = (double) precio / (double) periodo;
			double resto = r % 1;
			
			if (resto > 0) 
				resultado = r+1;
			else
				resultado = r;
		}
		
		return resultado;
	}
	
	public void cancel() {
		periodo = 0;
	}
}
