package principal;

public class Mago extends Personaje {
	private int hechizo;
	private EnumAtaque ataque;
	
	
	
	public Mago(String nombre, int nivel, int puntosVida, int hechizo, EnumAtaque ataque) {
		super(nombre, nivel, puntosVida);
		this.hechizo = hechizo;
		this.ataque = ataque;
	}

	public int getHechizo() {
		return hechizo;
	}

	public void setHechizo(int hechizo) {
		this.hechizo = hechizo;
	}

	public EnumAtaque getAtaque() {
		return ataque;
	}

	public void setAtaque(EnumAtaque ataque) {
		this.ataque = ataque;
	}

	
	public String toString() {
		return super.toString() + "\nMago [hechizo=" + hechizo + ", ataque=" + ataque + "]";
	}
	
	public void meditar(int cantidad ) {
		
		
		System.out.println("Meditando...");
		System.out.println("Hechizos aumentados + " + cantidad);
		hechizo+=cantidad;
		System.out.println("Número de hechizos dispobiles: " + hechizo);
	}
	public void play() { 
		
		if (hechizo>=10) {
			System.out.println(getNombre() + " ha utilizado un ataque mágico de tipo " + (getAtaque()));
			 

		        for (int i = 0; i <= 5; i++) {
		            
		            String espacio = " ".repeat(i);

		            // Dibujo de la bola de fuego frame por frame
		            System.out.println(espacio + "            ");
		            System.out.println(espacio + "               ");
		            System.out.println(espacio + "    🔥      ");
		            System.out.println(espacio + "               ");
		            System.out.println(espacio + "            ");

		            try {
						Thread.sleep(80);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }

		       
		        System.out.println(" ".repeat(5) + "   💥 ¡BOOM! 💥");
		        System.out.println();
			
			hechizo--;
			System.out.println("Número de hechizos dispobiles: " + hechizo); }
			else { 
				System.out.println("El mago no dispone del número de hechizos requerido. Necesita meditar.");
				
			}
			
		}
		
}
	
	

