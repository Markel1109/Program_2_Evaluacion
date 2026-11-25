package principal;

public class Excursion {

	private String codigo;
	private Enum_destino destino;
	private int numParticipantes;
	private double distanciaRecorrida;
	private double duracionHoras;
	
	public Excursion(String codigo, Enum_destino destino, int numParticipantes, double distanciaRecorrida,
			double duracionHoras) {
		super();
		this.codigo = codigo;
		this.destino = destino;
		this.numParticipantes = numParticipantes;
		this.distanciaRecorrida = distanciaRecorrida;
		this.duracionHoras = duracionHoras;
		
	}

	public Excursion() {
	
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Enum_destino getDestino() {
		return destino;
	}

	public void setDestino(Enum_destino destino) {
		this.destino = destino;
	}

	public int getNumParticipantes() {
		return numParticipantes;
	}

	public void setNumParticipantes(int numParticipantes) {
		this.numParticipantes = numParticipantes;
	}

	public double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public void setDistanciaRecorrida(double distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}

	public double getDuracionHoras() {
		return duracionHoras;
	}

	public void setDuracionHoras(double duracionHoras) {
		this.duracionHoras = duracionHoras;
	}

	
	public String toString() {
		return "Excursion [codigo=" + codigo + ", destino=" + destino + ", numParticipantes=" + numParticipantes
				+ ", distanciaRecorrida=" + distanciaRecorrida + ", duracionHoras=" + duracionHoras + "]";
	}
	public void Mostrar() {
		System.out.println(this.toString());
	}
	
	public boolean grupoCompleto() {
		if (numParticipantes>=25 ) {
			// grupo lleno
			return true;
		}
		else {
			// quedan espacios
			return false;
		}
		
	}
	public double obtenerVelocidadMedia() {
		return distanciaRecorrida / duracionHoras;
	}
}
