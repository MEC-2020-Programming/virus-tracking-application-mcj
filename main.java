package virustracking;
import java.io.*;  
import java.util.*;

public class main {
	public static void main(String[] args)
	{
//		 try {
			 System.out.println(getValues());
///		 }
//			 int myint;
//			 	FileReader fr=new FileReader("/Users/karimelmokattaf/Desktop/testing.txt"); 
//			 	
//			 	BufferedReader br = new BufferedReader(fr);  
//			 	StringBuffer countries = new StringBuffer(); 
//			 	
//			 	int counter = 0;
//			 	String line;  
//			 	
//			 	while((line=br.readLine())!=null)  
//			 	{  
//			 		if(counter == 0)
//			 		{
//			 			countries.append(line);     
//			 			++counter;
//				 		if(counter == 1)
//				 		{   
//				 			countries.append("\n");   
//				 			counter = 0;
//				 		}
//			 		}
//			 	}  
//			 	fr.close();    
//			 	System.out.println("Contents of File: ");  
//			 	System.out.println(countries.toString());  
//			 }  
//			 catch(IOException e)  
//			 {  
//				 e.printStackTrace();  
//			 } 
			
		 }
	
	public static ArrayList<String> getValues() {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream("/Users/karimelmokattaf/Desktop/testing.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String strLine;
        ArrayList<String> lines = new ArrayList<String>();
        try {
            while ((strLine = reader.readLine()) != null) {
                String lastWord = strLine.substring(strLine.lastIndexOf(" ")+1);
                lines.add(lastWord);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}


