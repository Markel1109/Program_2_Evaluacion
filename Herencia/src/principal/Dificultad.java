package principal;

public class Dificultad extends Excursion {
	private ExcursionAventura aventura;
	
	private final int MEDIO = 150;
	private final int EXTREMO = 300;

	public Dificultad(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, ExcursionAventura aventura) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.aventura = aventura;
	}

	public ExcursionAventura getAventura() {
		return aventura;
	}

	public void setAventura(ExcursionAventura aventura) {
		this.aventura = aventura;
	}

	@Override
	public String toString() {
		return super.toString() + "\nExcursionAventura  [Nivel de la aventura=" + aventura + "]";
	}
	public double calcularPrecio() {
		if (aventura == ExcursionAventura.MEDIO) {
			return super.calcularPrecio() +  (super.calcularPrecio() + MEDIO) ; }
		
		else if (aventura == ExcursionAventura.EXTREMO) {
			return super.calcularPrecio() +  (super.calcularPrecio() + EXTREMO) ; }
		
		else {
			return super.calcularPrecio();
		}
	}
	
}
