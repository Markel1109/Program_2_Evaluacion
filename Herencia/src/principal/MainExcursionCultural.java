package principal;

public class MainExcursionCultural {

	public static void main(String[] args) {
		
		ExcursionCultural excurCultural = new ExcursionCultural ("1", Destino.CIUDAD, 1,
            10, 5, true);
		System.out.println(excurCultural.toString());
		System.out.println(excurCultural.calcularPrecio());
		
		ExcursionBuceo excurBuceoSinCertificadoSinEquipo = new ExcursionBuceo ("2", Destino.PLAYA, 10, 100, 1, false, 6, true);
		System.out.println(excurBuceoSinCertificadoSinEquipo.toString());
		
	}

}
