package verificadorRut;

import java.util.Scanner;

public class Prueba {

	String patente = "";
	String ver_patente="";
	Scanner keyboard = new Scanner(System.in);
	Scanner keyboard1 = new Scanner(System.in);
	String tipo_patente;
	public String Patente(Boolean tipo_patente) {
	/* determina si se ingresara patente*/
		if (tipo_patente) {
			System.out.println("ingrese patente nueva.");
			while(!keyboard1.hasNext("[[A-Z]&&[^AEIOU]]{4}[0-9]{2}")) {
				System.out.println("ingrese formato patente nuevo correcto.");
				keyboard1.nextLine();
			}
			patente =keyboard1.nextLine();	
		}
		
		else {
			System.out.println("ingrese patente  antigua.");
			while(!keyboard1.hasNext("[A-Z]{2}[0-9]{4}")) {
				System.out.println("ingrese formato patente antigua correcto.");
				keyboard1.nextLine();
				}	
			
			patente =keyboard1.nextLine();
			 
		}
		return patente;
			
	}
	
	public String VeriPatente() {
		while(!keyboard.hasNext("[0-9]|[K]")) {
			System.out.println("ingrese solo un numero entre 0 y 9 o K.");
			keyboard.nextLine();
			}
			ver_patente=keyboard.nextLine();
	
	return ver_patente;
	
	}		
}



