package verificadorRut;

import java.util.Map;

public class StringtoInt {
	
	int int_verificador=0;
	String first;
	String second;
	String ltonumber;
	int numeropatente;
	public int str_int_ver(String str_verificador) {
		
		if (str_verificador.equals("K")) {
			int_verificador= 10;	
		}
		else if (str_verificador.equals("0")) {
			int_verificador= 11;
		}
		else {
			int_verificador=Integer.parseInt(str_verificador);
		}
		return int_verificador;
	}
	
	public int Str_Int_patente(String str_patente, boolean tipo_patente, Map<String, String> dic) {
			if  (tipo_patente) {
		     
	        first = str_patente.substring(0,4);
	        second = str_patente.substring(4,6);
	        for( int k = 0; k <4; k++) {
	        	
	        	String B = first.substring(k, k+1);
	        	String value = dic.get(B);
	        	ltonumber += value;
	        	}
		}
		else {
			
	        first = str_patente.substring(0,2);
	        second = str_patente.substring(2,6);
	        ltonumber = dic.get(first);
		} 
        
         
        numeropatente=Integer.parseInt(ltonumber+second);
        return numeropatente;
	}
	
}
