package verificadorRut;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


class ImportCsv1 {
	
//	public static void main(String[] args) throws    IOException{
	static void   Map<String, String> ImportCsv(boolean neworold ) throws    IOException{
		// TODO Auto-generated method stub
		String nuevas = "D:\\DiccionarioPatentesNuevas.csv";
		String antiguas = "D:\\DiccionarioPatentesAntiguas.csv";		
//		boolean neworold = false;
		String filename;
		if (neworold==true) {
			 filename = nuevas;
		}
		else {
			 filename = antiguas;
		}
			
		
		
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
		return dic;
//		for (String name: dic.keySet()){
//            String key = name;
//            String value = dic.get(name);  
//            System.out.println(key + " " + value);
//	
//		}  
	}

	 




class PatenteaNumero1 {

	public  void main(String[] args){
		// TODO Auto-generated method stub
		String patentenueva ="";
		String patenteantigua ="";
		String first;
		String second;
		String secondtoletter;
		String finalnumber;
    
//		System.out.println("antigua");
//		patenteantigua = "CB1234";
//        first = patenteantigua.substring(0,2);
//        second = patenteantigua.substring(2,6);
//        System.out.println("letras");
//        System.out.println(first);
//        System.out.println("numeros");
//        System.out.println(second);
//        
        System.out.println("nueva");
        patentenueva = "BBBB10";
        first = patentenueva.substring(0,4);
        second = patentenueva.substring(4,6);
//        System.out.println("letras");
//        System.out.println(first);
//        System.out.println("numeros");
//        System.out.println(second);

//        //patentes nuevas
        	
        for(int i =0; i<4; i++) {
        	
//        	System.out.println(first.charAt(i));
        }
        
        
        
        secondtoletter = "009";
        
        finalnumber= secondtoletter+second;
//        System.out.println(finalnumber);
        boolean nuevaoantigua = true;
//        ImportCsv1 a = new ImportCsv1();
//        Map<String,String> dic = ImportCsv(nuevaoantigua);
        
        
        
	
        		
		
		for (String name: dic.keySet()){
	      String key = name;
	      String value = dic.get(name);  
	      System.out.println(key + " " + value);       
		}

	}}}
