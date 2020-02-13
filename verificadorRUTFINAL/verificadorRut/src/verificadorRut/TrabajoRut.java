package verificadorRut;

public class TrabajoRut {

//	public  String Modulo11(int rut, int digver) {
	public static void main(String[] args) {
		// sum RUT
		int rut = 1021234;
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
		
		System.out.println(veri_num);
		
//		if (digver == veri_num) {
//			message = "su Rut no es correcto.";
//		}
//		else {
//			message = "su Rut no es correcto.";
//		}
//		
//		return message;
		
	}
}
