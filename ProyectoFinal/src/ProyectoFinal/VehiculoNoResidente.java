package ProyectoFinal;

import java.util.Date;

public class VehiculoNoResidente extends Vehiculo{
	private Date horasalida;
	private long totalHorasEstancias = 0;
	
	@Override
	public void finEstancia(Date horaEntrada, Date horaSalida) {	
		horasalida = new Date();
		totalHorasEstancias = (int)(((horaSalida.getTime() - horaEntrada.getTime())/60000));
	}	
	
	public void pagoEstancia() {
		System.out.println("El valor a pagar es:" + (totalHorasEstancias * 50));
	}

}
