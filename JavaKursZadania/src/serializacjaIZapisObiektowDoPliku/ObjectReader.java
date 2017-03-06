package serializacjaIZapisObiektowDoPliku;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {

	public static void main(String[] args) {
		
		String fileName = "person.obj";
		String filePath = "C://JAVAPR//";
		Person p1 = null;

		
		
		try ( 
				FileInputStream fis = new FileInputStream(filePath+fileName);
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				) {
			
			p1= (Person) ois.readObject();
	
			
			
		} catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
		
        if(p1 != null) {
            System.out.println("Wczytano dane o: ");
            System.out.println(p1.getFirstName() + " " + p1.getLastName());
           
        }
        
		
	}

}
