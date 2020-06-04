package Cola;

public class Cola {
	
	private Nodo raiz,fondo;
	
	/**
	 * Constructor de la clase.
	 */
	Cola(){
		raiz = null;
		fondo = null;
	}
	
	/**
	 * Validar si la lista esta vacia.
	 * @return
	 */
	boolean vacia() {
		if (raiz == null)
			return true;
		else
			return false;
	}
	
	
	void insertar (int info) {
		Nodo nuevo;
		nuevo = new Nodo();
		nuevo.info = info;
		nuevo.sig = null;
		
		if (vacia()) {
			raiz = nuevo;
			fondo = nuevo;
		}else {
			fondo.sig = nuevo;
			fondo = nuevo;
		}
	}
	
	/*
	int extraer() {
		if (!vacia()) {
			inf informacion = raiz.info;
			
			if (raiz == fondo) {
				raiz = null;
				fondo = null;
			}
		}
	}
	*/
	
	public void imprimir() {
		//Nodo = reco.raiz;
		System.out.println("Listado de todos los elementos de la cola");
	}

	public static void main(String[] args) {
		Cola cola1 = new Cola();
		cola1.insertar(5);
		cola1.imprimir();
		cola1.insertar(2);
		cola1.imprimir();
		cola1.insertar(3);
		cola1.imprimir();
	}

}
