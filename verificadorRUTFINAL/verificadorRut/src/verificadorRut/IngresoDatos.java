package verificadorRut;

import java.util.Scanner;

public class IngresoDatos {

	public static void main(String[] args) {
		
		int rut = 0;
		String ver_rut = null;
		String patente = "";
		String ver_patente="";
		Scanner keyboard = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		boolean salir_verificador_rut = false;
				
		/*verificacion para rut*/
		System.out.println("ingrese su numero de rut, sin digito verificador");
		do {
						
			if(keyboard.hasNextInt()) {
				rut = keyboard.nextInt();
				salir_verificador_rut = true;
				if(rut>99999999) {
					salir_verificador_rut = false;
					System.out.println("ingrese cifre menor a 99999999.");
				}	
			}
			else {
				keyboard.nextLine();
				System.out.println("ingrese solo numeros.");
			}
			
		}while(!salir_verificador_rut);
				
		/* verificacion para verificador rut*/
		
		System.out.println(" ingrese digito verificador RUT.");
		while(!input.hasNext("[0-9]|[K]")) {
			System.out.println("ingrese solo un numero entre 0 y 9 o K.");
			input.nextLine();
			
		}	
		ver_rut= input.nextLine();

		
		Prueba llamado3 = new Prueba();
		patente = llamado3.Patente();
	
		Prueba llamado4 = new Prueba();
		ver_patente = llamado4.VeriPatente();
		
				
		System.out.println("numero patente");
		System.out.println(patente);
		System.out.println("verificador patente ");
		System.out.println(ver_patente);
		System.out.println("numero rut");
		System.out.println(rut);
		System.out.println("verificador rut ");
		System.out.println(ver_rut);
		
	}
	
	
}
