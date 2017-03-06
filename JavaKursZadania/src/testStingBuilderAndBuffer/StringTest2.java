package testStingBuilderAndBuffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StringTest2 {
	

	public static void main(String[] args) {
        String fileName = "C:/JAVAPR/teksty_do_szkolenia.txt";
        BufferedReader reader = null;
        String [] lines;
        
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String tmp = null;
            
            
            while ((tmp = reader.readLine()) != null) {
            	//splitText(tmp);
            	lines = tmp.split(".");
            	
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        
	}
    /*public static String[] splitText(String str){
    	String [] lines = str.split(".");
		return lines;
    }*/
    
    public static void printLines(String[] strn){
    	
    	for (int i= 0; i<strn.length;i++){
    		System.out.println(strn[i]);
    		
    	}
    }

}
