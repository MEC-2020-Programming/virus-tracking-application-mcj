package virustracking;
import java.io.*;

public class main {
	public static void main(String[] args) 
	{
	try {
		 StringBuilder sb = new StringBuilder();
		 FileReader fr=new FileReader("/Users/karimelmokattaf/Desktop/testing.txt"); 
		 BufferedReader br = new BufferedReader(fr);  
		 StringBuffer countries = new StringBuffer();   
		 FileWriter csvout = new FileWriter("trial8.csv");
		 String line = "Country,Total Cases, New Cases, Total Deaths, Total Recovered, Active Cases";  
		 	countries.append(line);
		 	countries.append("\n");
		 while((line=br.readLine())!=null)  
		 {  
			 
			line = line.replace(",", "");
		 	line = line.replace("(", "");
		 	line = line.replace(")", "");
		 	line = line.replace("[", "");
		 	line = line.replace("]", ",");
		 	line = line.replace("{", "");
		 	line = line.replace("}", "");
		 	line = line.replace("\"", "");
		 	
		 	countries.append(line.substring(0,(line.length())-1));
		 	countries.append("\n");
		 }  
		 csvout.append(countries);
		 csvout.flush();
		 csvout.close();
		 fr.close();    
		 System.out.println("Contents of File: ");  
		 System.out.println(countries.toString());  
		}  
	catch(IOException e)  
		{  
			e.printStackTrace();  
		} 
		
	 }
	
}
