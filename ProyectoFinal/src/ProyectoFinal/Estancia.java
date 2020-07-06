package ProyectoFinal;

import java.util.Date;

public class Estancia {
	private Date horaEntrada;
	private Date horaSalida;	

	public Date getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public long Estancias(Date horaEntrada, Date horaSalida) {
		long totalHorasEstancias = 0;
		
		totalHorasEstancias = (horaSalida.getTime() - horaEntrada.getTime())/60000;	
		return totalHorasEstancias;
	}	
}