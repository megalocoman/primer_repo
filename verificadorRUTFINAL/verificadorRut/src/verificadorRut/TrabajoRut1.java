package verificadorRut;

public class TrabajoRut1 {

	public  String Modulo11(int rut, int digver) {
		
		// sum RUT
		int acum =0;
		int multiplicador=2;
		String message;
		while (rut > 0) {
			int rest_rut = rut %10;
			rut = rut/10;			
			acum = acum +rest_rut*multiplicador;
			++multiplicador;
			if (multiplicador>7) {
				multiplicador= 2;
			}
		}

		int veri_num= 11-(acum - (( acum / 11)*11)) ;
		
		if (digver == veri_num) {
			message = " es correcto.";
		}
		else {
			message = " no es correcto.";
		}
		
		return message;
		
	}
}
