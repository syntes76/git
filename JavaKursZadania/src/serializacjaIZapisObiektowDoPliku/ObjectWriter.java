package serializacjaIZapisObiektowDoPliku;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {

	public static void main(String[] args) {

		String fileName = "person.obj";
		String filePath = "C://JAVAPR//";
		Person p1 = new Person("Jan", "Kowalski");

		
		

		try (FileOutputStream fs = new FileOutputStream(filePath+fileName);
				ObjectOutputStream os = new ObjectOutputStream(fs);) {
			os.writeObject(p1);

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException f) {
			f.printStackTrace();

		}

		System.out.println("Zapisano obiekt do pliku");
	}

}
