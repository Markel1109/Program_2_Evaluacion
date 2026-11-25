package principal;

import java.util.Scanner;

public class Main_Excursion {

	public static void main(String[] args) {
		
		Scanner cs = new Scanner (System.in);
		
		Excursion [] excursiones = new Excursion [30];
		
		
		
		
		int numParticipantes=0;
		double duracionHoras=0;
		double distanciaRecorrida=0;
		String codigo="";
		Enum_destino destino= Enum_destino.CIUDAD;		
		
		int opcion=0;
		int cantidadExcursiones=0;
		
		do {
		System.out.println("MENU DE EXCURSIONES");
		System.out.println("1.- Introducir excursiones");
		System.out.println("2.- Mostrar las excursiones que superen una velocidad media dada");
		System.out.println("3.- Inscribir participantes en una excursión");
		System.out.println("4.- Eliminar una excursión");
		System.out.println("5.- Mostrar todas las excursiones");
		System.out.println("6.- Salir");
		System.out.print("¿Qué quieres hacer? ");
		
		opcion = cs.nextInt();
		cs.nextLine();
		
		switch(opcion) {
		
			case 1: 
				cantidadExcursiones = añadirExcursiones(cs, cantidadExcursiones, excursiones, duracionHoras, distanciaRecorrida, numParticipantes, codigo, destino);
				break;
				
			case 2: 
				mostrarVelocidadMediaDada(cs, excursiones);
				break;
				
			case 3: 
				numParticipantes = inscribirParticipantes(cs, numParticipantes, codigo,  excursiones);
				break;
				
			case 4: 
				cantidadExcursiones = eliminarExcursion(cs, cantidadExcursiones, excursiones);
				break;
				
			case 5: 
				mostrarExcursiones(cs, excursiones);
				break;
				
			case 6:
				break;
				
			default: 
				System.out.println("Opción no válida.");;
				break;
		}
		
	} while(opcion!=6); {
		
		System.out.println("Saliendo...");
		
		cs.close();	}

	}
	
	public static int añadirExcursiones(Scanner cs, int cantidadExcursiones, Excursion [] excursiones, double duracionHoras, double distanciaRecorrida, int numParticipantes, String codigo, Enum_destino destino) {
		
		if (cantidadExcursiones >= excursiones.length) {
			System.out.println("Lo siento no hay espacio para mas excursiones");
		}
		
		else {
			
			
			
			while(true) {
				System.out.println("Introduce el codigo de tu excursion:");
				codigo = cs.nextLine();
			if (codigoUnicoValido(codigo, excursiones)) {
				System.out.println("Código añadido correctamente.");
				break; 
			} else {
				System.out.println("Codigo utilizado. Prueba de nuevo.");
			}
					}
			
			System.out.println("Elige el destino de tu excursion (MONTAÑA/PLAYA/CIUDAD):");
			String texto = cs.nextLine();
			destino = Enum_destino.valueOf(texto.toUpperCase());
			
			while (true) {
				System.out.println("Introduce el número de participantes:");
				numParticipantes = Integer.parseInt(cs.nextLine());
				
				if (numParticipantes<0 || numParticipantes>=25) {
					System.out.println("Numeros negativos no validos. Prueba de nuevo.");
				}
				else {
					break;
				}
					}
			
			while (true) {
			System.out.println("Introduce la distancia recorrida en kilometros:");
			distanciaRecorrida = cs.nextDouble();
			
			if (distanciaRecorrida<0) {
				System.out.println("Numeros negativos no validos. Prueba de nuevo.");
			}
			else {
				break;
			}
					}
			
			while (true) {
			System.out.println("Introduce la duración de la excursión en horas:");
			duracionHoras = cs.nextDouble();
			
			if (duracionHoras<0) {
				System.out.println("Numeros negativos no validos. Prueba de nuevo.");
			}
			else {
				break;
			}
					}
			cantidadExcursiones++;
			System.out.println("Excursión introducida correctamente.");
			excursiones [cantidadExcursiones] = new Excursion(codigo, destino, numParticipantes, distanciaRecorrida,
			 duracionHoras);
			
			
		}
		
		return cantidadExcursiones;
	}
	
	public static void mostrarVelocidadMediaDada(Scanner cs, Excursion [] excursiones) {
	 int contadorExcursiones=0;
	 
		System.out.println("Introduce una velocidad media:");
		int velocidadMedia = Integer.parseInt(cs.nextLine());
		
		
		while (velocidadMedia<0) {
			System.out.println("Escribe un numero positivo");
			 velocidadMedia = Integer.parseInt(cs.nextLine());
		}
		
		for (int i=0 ; i<excursiones.length ; i++) {
			if (excursiones [i] != null && excursiones[i].obtenerVelocidadMedia() > velocidadMedia) {
				excursiones[i].Mostrar();
				contadorExcursiones++;
			}
		}
		if (contadorExcursiones<=0) {
			System.out.println("No hay excursiones que cumplan la condición.");
		}
		}
	
	public static int inscribirParticipantes(Scanner cs, int numParticipantes, String codigo, Excursion [] excursiones) {
		int contadorExcursiones=0;
		
		System.out.println("Introduce el codigo de excursión al que quieres inscsribir:");
		String escrito = cs.nextLine();
		
		for (int i=0 ; i<excursiones.length ; i++) {
			if (excursiones[i] != null && excursiones[i].getCodigo().equalsIgnoreCase(escrito)) {
				contadorExcursiones++;
				System.out.println("Cuantos participantes desea inscribir?");
				int cantidad = Integer.parseInt(cs.nextLine());
				if (excursiones[i].grupoCompleto() == true) {
					System.out.println("Lo siento no hay hueco para " + cantidad + " participantes.");
				}
				else  if (cantidad >0 && excursiones[i].grupoCompleto() == false){
					numParticipantes+=cantidad;
					System.out.println("Inscripción realizada.");
				}
			}
		}
		if (contadorExcursiones<=0) {
			System.out.println("No hay excursiones que cumplan la condición.");
		}
		
		return numParticipantes;
	}
	
	public static int eliminarExcursion(Scanner cs, int cantidadExcursiones, Excursion [] excursiones) {
		

		int i=0;
		int contador=0;
		String respuesta="";
		
		if (cantidadExcursiones==0) {
			System.out.println("No hay excuriones para eliminar.");
		}
		else {
			System.out.println("¿Cuál es el destino de la excursión que quieres eliminar?");
			String escrito=cs.nextLine();
			
			while(i<excursiones.length) {
				if (excursiones[i].getDestino().equals(escrito)) {
	
					for(int posicion=i ; posicion < cantidadExcursiones - 1 ; posicion++) {
						excursiones [posicion] = excursiones[posicion + 1] ;
							
																					}
					cantidadExcursiones--;	
					
					
					System.out.println("Excursión eliminada correctamente");
					contador++;
					break; 	
					
				
				}
				else {
					i++;
				}
									}
		if (contador==0) {
			System.out.println("La excursión no existe");
		}
		
			
		}
		
		return cantidadExcursiones;
	}
	
	public static void mostrarExcursiones(Scanner cs, Excursion [] excursiones) {
		int contadorExcursiones=0;
		
		for (int i=0 ; i<excursiones.length ; i++) {
			if (excursiones [i] != null) {
				excursiones[i].Mostrar();
				contadorExcursiones++;
			}
		}
		if (contadorExcursiones<=0) {
			System.out.println("No hay excursiones.");
		}
	}
	
	public static boolean codigoUnicoValido(String codigo, Excursion [] excursiones) {
		
		int existe=0;
		
		
		for (int i =0; i<excursiones.length ; i++) {
			if (excursiones[i].getCodigo().equalsIgnoreCase(codigo)) {
				existe++;
			}
			
			
		}
		if (existe>0) {
			return false;
		}
		
		else {
			return true;
		}
		
		
		}
	
}
