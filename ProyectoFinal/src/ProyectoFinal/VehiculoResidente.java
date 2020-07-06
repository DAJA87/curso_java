package ProyectoFinal;

import java.util.Date;

public class VehiculoResidente extends Vehiculo{
	private long tiempoAcumulado;
	public Estancia estancia = new Estancia();

	public long getTiempoAcumulado() {
		return tiempoAcumulado;
	}

	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	
	// Tiempo acumulado en minutos.
	public double pagoMes(){
		return tiempoAcumulado*25;
	}
	
	@Override
	public void finEstancia(Date horaEntrada, Date horaSalida) {
		horaEntrada = this.getHoraEntrada();
		estancia.setHoraSalida(horaSalida);
		tiempoAcumulado = (estancia.Estancias(this.getHoraEntrada(), horaSalida));
	}
}
