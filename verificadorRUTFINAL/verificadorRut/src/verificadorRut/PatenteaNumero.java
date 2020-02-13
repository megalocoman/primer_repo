package verificadorRut;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
// actializacion para ver si funciona  y se en en github
public class PatenteaNumero {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* variables a usar*/
		String patente =""; //string patente
		boolean tipo_patente = false; //Boolean que indica si es tipo patente nueva o antigua.
		int digito_verificador_auto; 
		int digito_verificador_rut;
		int numeropatente; // int patente, desde string patente

        int rut = 0;
		String ver_rut = null;
		String ver_patente="";
		Scanner keyboard = new Scanner(System.in);
		boolean salir_verificador_rut = false;
		String nuevaantigua =""; // indica N si es nueva o A si es antigua
		
		System.out.println("***********************************************************");
		System.out.println("PROGRAMA VERIFICACION DE PATENTES Y RUT");	
		System.out.println("***********************************************************");
		System.out.println("");
		/*ingreso rut sin digito verificador*/
		System.out.println("***********************************************************");
		System.out.println("");
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
				
		/* ingreso para verificador rut*/
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("ingrese digito verificador RUT.");
		Prueba llamado5 = new Prueba();
		ver_rut = llamado5.VeriPatente();
		StringtoInt llamado7 = new StringtoInt();
		digito_verificador_rut = llamado7.str_int_ver(ver_rut);
		
		/* ingreso tipo patente: nueva o antiguas*/
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("ingrese tipo de  patente, A por antiguo o N por nuevo.");
		while(!keyboard.hasNext("[AN]")) {
			System.out.println("ingrese solo A por antiguo o N por nuevo.");
			keyboard.nextLine();
		}
		nuevaantigua =keyboard.nextLine();
		
		/*convertir tipo patente a boolean para funciones*/
		if(nuevaantigua.equals("N")) {
			tipo_patente= true;
		}
		else {
			tipo_patente= false;
		}
		
		/*convertir patente  desde string a int.*/

		Prueba llamado3 = new Prueba();
		patente = llamado3.Patente(tipo_patente);
			
		/* ingreso verificador patente*/
		System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("ingrese digito verificador patente.");
		Prueba llamado4 = new Prueba();
		ver_patente = llamado4.VeriPatente();
		digito_verificador_auto = llamado7.str_int_ver(ver_patente);
							
		/* llamar a los diccionarios cn los 
		 * valores en numeros de las letras de la patente*/
		
        ImportCsv1 llamado1 = new ImportCsv1();
        Map<String, String> dic = llamado1.importPatentes(tipo_patente);
            	
		/*string to int patente */	
       
        StringtoInt llamado8 = new StringtoInt();
        numeropatente = llamado8.Str_Int_patente(patente, tipo_patente, dic);
    
        /*Respuesta para rut*/
        System.out.println("***********************************************************");
		System.out.println("");
		System.out.println("RESULTADOS:");
		System.out.println("");
		System.out.println("***********************************************************");
        TrabajoRut1 llamado2 = new TrabajoRut1();
        String respuestarut = llamado2.Modulo11(rut, digito_verificador_rut );
        
        System.out.println("Su RUT es "+rut+"-"+ver_rut+" "+respuestarut);
        
        /*Respuesta para patente*/
        System.out.println("***********************************************************");
		System.out.println("");
        String respuestapatente = llamado2.Modulo11(numeropatente, digito_verificador_auto );
        
        System.out.println("Su patente "+ patente+" "+respuestapatente);
        
	}

}
