package ProyectoFinal;

import java.util.Date;

public abstract class Vehiculo {
	private String matricula;
	private Date horaEntrada;
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Date getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	public void comienzaEstancia() {}
	public void finEstancia(Date horaEntrada, Date horaSalida) {}
}