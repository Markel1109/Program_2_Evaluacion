package principal;

public class MainExcursion {

	public static void main(String[] args) {
		
		ExcursionCultural excurCultural = new ExcursionCultural ("1", Destino.CIUDAD, 2,
            10, 5, true);
			System.out.println(excurCultural.toString());
			System.out.println(excurCultural.calcularPrecio());
		
		
		ExcursionBuceo excurBuceoSinCertificadoConEquipo = new ExcursionBuceo ("2", Destino.PLAYA, 10, 100, 1, false, 6, true);
			System.out.println(excurBuceoSinCertificadoConEquipo.toString());
		
			System.out.println(excurBuceoSinCertificadoConEquipo.calcularPrecio());
		
		Dificultad dificultadExcursionExtrema = new Dificultad ("3", Destino.PLAYA, 10, 200, 3, ExcursionAventura.EXTREMO);
			System.out.println(dificultadExcursionExtrema.toString());
		
			System.out.println(dificultadExcursionExtrema.calcularPrecio());
	}

}
