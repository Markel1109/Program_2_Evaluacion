package principal;

public class ExcursionBuceo extends Excursion{
	private boolean certificado;
	private double profundidad;
	private boolean alquilerEquipo;
	
	private final int AÑADIDO = 75;
	
	public ExcursionBuceo(String codigo, Destino destino, int numeroParticipantes,
            double distanciaRecorrida, double duracion, boolean certificado, double profundidad, boolean alquilerEquipo) {
		
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.certificado = certificado;
		this.profundidad = profundidad;
		this.alquilerEquipo = alquilerEquipo;
	}
	
	
	
	public boolean isCertificado() {
		return certificado;
	}



	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}



	public double getProfundidad() {
		return profundidad;
	}



	public void setProfundidad(double profundidad) {
		this.profundidad = profundidad;
	}



	public boolean isAlquilerEquipo() {
		return alquilerEquipo;
	}



	public void setAlquilerEquipo(boolean alquilerEquipo) {
		this.alquilerEquipo = alquilerEquipo;
	}



	@Override
	public String toString() {
		return super.toString() + "\nExcursionBuceo [certificado=" + certificado + ", profundidad=" + profundidad + ", alquilerEquipo="
				+ alquilerEquipo + "]";
	}
	
	public double calcularPrecio() {
		if (isAlquilerEquipo())
		return super.calcularPrecio() + AÑADIDO;
		return super.calcularPrecio();
	

}
}