package verificadorRut;
import java.util.*;
import java.io.*;
public class ImportCsv1 {
	
	public Map<String, String> importPatentes(boolean patente) throws    IOException{

		
		String nuevas = "D:\\DiccionarioPatentesNuevas.csv";
		String antiguas = "D:\\DiccionarioPatentesAntiguas.csv";		
		
		/* indique si la patente es antigua o nueva con boolean patente*/
		String filename;
		if (patente==true) {
			 filename = nuevas;
		}
		else {
			 filename = antiguas;
		}

		/* convierte archivo csv a hashmap*/
		FileInputStream fileInputStream = new FileInputStream(filename);
		
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
		Map<String,String> dic = new HashMap<String,String>();
		try(BufferedReader bufferedReader = new BufferedReader(inputStreamReader) )  {
			String line;
			while((line=bufferedReader.readLine()) !=null) {
				String[] arrOfStr = line.split(";"); 
		        dic.put(arrOfStr[0], arrOfStr[1]);
		        }
			}
		return dic; // retorna diccionario con base de datyos de patentes.
		
	}
	
}
	 
			
	


