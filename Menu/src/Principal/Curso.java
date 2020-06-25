package Principal;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	static List<Alumno> listAlumno = new ArrayList<Alumno>();	
	static boolean existe;

	public void AnadirAlumno(int identificador) {
		Alumno alumno = new Alumno();
		
		if (listAlumno.size() > 2) {
			System.out.println("Excede el tamaño maximo");
			return;
		}else {			
			alumno.Insertar(identificador);
			listAlumno.add(alumno);
		}
	}
	
	public boolean BuscarPorDNI(int dni){		
		for (Alumno alumno : listAlumno) {
			if (alumno.getDni() == dni) {
				alumno.imprimir();
				return true;
			}
		}
		
		return false;
	}
	
	public void ImprimirCurso() {
		for (Alumno alumno : listAlumno) {
			alumno.imprimir();
		}
	}
}
