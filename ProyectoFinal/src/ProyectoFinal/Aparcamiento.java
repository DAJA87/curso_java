package ProyectoFinal;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Aparcamiento {
	private List<VehiculoNoResidente> aparcados;
	private List<VehiculoOficial> oficiales;
	private List<VehiculoResidente> residentes;
	private VehiculoOficial vehiculoOficial;
	private VehiculoResidente vehiculoResidente;	
	private VehiculoNoResidente vehiculoNoResidente;	
	private Date horaEntrada, horaSalida;
	private boolean existe = false;
	
	public Aparcamiento() {
		aparcados = new ArrayList<>();
		oficiales = new ArrayList<>();
		residentes = new ArrayList<>();
	}
	
	/**
	 * Registra la entrada de un vehículo oficial.
	 * @param matricula
	 */
	public void registraOficial(String matricula) {
		horaEntrada = new Date();	
		vehiculoOficial = new VehiculoOficial();
		vehiculoOficial.setMatricula(matricula);
		vehiculoOficial.setHoraEntrada(horaEntrada);
		oficiales.add(vehiculoOficial);
	}
	
	public void registraResidente(String matricula) {
		horaEntrada = new Date();	
		vehiculoResidente = new VehiculoResidente();
		vehiculoResidente.setMatricula(matricula);
		vehiculoResidente.setHoraEntrada(horaEntrada);
		residentes.add(vehiculoResidente);
	}
	
	// Registra entrada.
	public void entra(String matricula) {
		horaEntrada = new Date();		
		
		// Validar existencia vehículo oficial.
		for (VehiculoOficial vehiculoOficial : oficiales) {
			if (vehiculoOficial.getMatricula().equals(matricula)) {
				vehiculoOficial.setHoraEntrada(horaEntrada);
				existe = true;
				break;
			}
		}
		
		// Validar existencia vehículo Residente.
		if (!existe) {			
			for (VehiculoResidente vehiculoResidente : residentes) {
				if (vehiculoResidente.getMatricula().equals(matricula)) {
					vehiculoResidente.setHoraEntrada(horaEntrada);
					existe = true;
					break;
				}
			}
		}
		
		// Cuando no es residente.
		if (!existe) {
			vehiculoNoResidente = new VehiculoNoResidente();
			vehiculoNoResidente.setMatricula(matricula);
			vehiculoNoResidente.setHoraEntrada(horaEntrada);
			aparcados.add(vehiculoNoResidente);
		}
		
		existe = false;
	}
	
	// Registra salida.
	public void sale(String matricula) {
		// Validar existencia vehículo oficial.
		for (VehiculoOficial vehiculoOficial : oficiales) {
			if (vehiculoOficial.getMatricula().equals(matricula)) {
				horaSalida = new Date();
				vehiculoOficial.estancia.setHoraEntrada(vehiculoOficial.getHoraEntrada());
				vehiculoOficial.estancia.setHoraSalida(horaSalida);
				vehiculoOficial.estancia.Estancias(vehiculoOficial.getHoraEntrada(), horaSalida);
				existe = true;
				break;
			}
		}
		
		// Validar existencia vehículo Residente.
		if (!existe) {			
			for (VehiculoResidente vehiculoResidente : residentes) {
				if (vehiculoResidente.getMatricula().equals(matricula)) {
					horaSalida = new Date();
					vehiculoResidente.finEstancia(vehiculoResidente.getHoraEntrada(), horaSalida);
					existe = true;
					break;
				}
			}
		}
		
		// Cuando no es residente.
		if (!existe) {
			for (VehiculoNoResidente vehiculoNoResidente : aparcados) {
				if (vehiculoNoResidente.getMatricula().equals(matricula)) {
					horaSalida = new Date();
					vehiculoNoResidente.finEstancia(vehiculoNoResidente.getHoraEntrada(), horaSalida);
					vehiculoNoResidente.pagoEstancia();
				}
			}
		}
		
		existe = false;
		
	}
	
	public void comienzaMes() {
		oficiales.clear();
		for (VehiculoResidente vehiculoResidente : residentes) vehiculoResidente.setHoraEntrada(null);
	}
	
	public void generaInformePagosResidentes(String nombreArchivo) {
		String ruta;
		ruta = "D:\\" + nombreArchivo + ".txt";
		File file = new File(ruta);

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter(ruta);
			pw = new PrintWriter(fichero);
			pw.println("Matricula	Tiempo estacionado (min)	Cantidad a pagar");

			for (VehiculoResidente vehiculoResidente : residentes) {
				long valorPagar = vehiculoResidente.getTiempoAcumulado() * 25;
				pw.println(vehiculoResidente.getMatricula()+"	"+vehiculoResidente.getTiempoAcumulado()+"	"+valorPagar);
			}


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != fichero)
					fichero.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	
	}
}
