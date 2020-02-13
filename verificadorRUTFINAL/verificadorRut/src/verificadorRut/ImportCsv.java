package verificadorRut;
import java.util.*;

//import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.io.*;
public class ImportCsv {
	
	public static void main(String[] args) throws    IOException{
		// TODO Auto-generated method stub
		String nuevas = "D:\\DiccionarioPatentesNuevas.csv";
		String antiguas = "D:\\DiccionarioPatentesAntiguas.csv";		
//		String filename = nuevas;
		String filename = antiguas;
		boolean nueva = true;
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
		for (String name: dic.keySet()){
            String key = name;
            String value = dic.get(name);  
            System.out.println(key + " " + value);      
		}
		
		
		
	}
}
	 
			
	


