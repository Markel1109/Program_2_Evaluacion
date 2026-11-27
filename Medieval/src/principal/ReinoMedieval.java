package principal;

public class ReinoMedieval {

	public static void main(String[] args) {
		
		Mago mago = new Mago ("Pedro", 7, 5, 3, EnumAtaque.FUEGO);
		System.out.println(mago.toString());
		mago.meditar(7);
		mago.play();
		
	}

}
