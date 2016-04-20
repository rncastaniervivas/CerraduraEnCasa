package ar.edu.unlam.tallerweb.Cerradura2;

public class Cerradura2 {

	private Integer claveApertura;
	private Integer intentosFallidos = 0;
	private Integer intentosOk = 0;
	private Integer bloqueo;
	private Boolean estado;
	private Boolean estaAbierta;
	
	public Cerradura2(Integer clave, Integer fallosBloquean) {// con este metodo creo la cerradura
		// a claveapertura se le asigna la clave que ingresa en el test
		// a bloqueo se le asigna intentos que ingresa en el test
		claveApertura = clave;
		bloqueo = fallosBloquean;
	}

	public Boolean abrirCerradura(Integer clave) {
		if ((bloqueo <= 3) && (clave.equals(claveApertura))) {
			intentosOk = intentosOk + 1;
			return true;
		} else {
			intentosFallidos = intentosFallidos + 1;
			return false;
		}
	}
	
	public Boolean cerrarCerradura(){
		estado= false;
		return estado;
		
	}
	
	public Boolean estaCerraduraEstaAbierta(){
		estaAbierta= true;
		return estaAbierta;
	}
	
	public Boolean estaCerraduraEstaCerrada(){
		estaAbierta= false;
		return estaAbierta;
	}
	
	public Boolean bloqueada(){
		if (bloqueo == intentosFallidos){
			return true;
		}else{
			return false;
		}
	}
	
	public Integer contarAperturaExitosa(){
		return intentosOk;
	}
	
	public Integer contarAperturaFallida(){
		return intentosFallidos;
	}
}
