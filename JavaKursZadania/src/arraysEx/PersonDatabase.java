package arraysEx;

public class PersonDatabase {
	
	public static void main(String[] args) {
		
	
	Person[] persons = new Person[1];
	
	Person person1=new Person("Jan","Kowalski","760326852");
	
	persons[0] = person1;
	
	printArray(persons);
	
	
	}
	
	public static <T> void printArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t + " ");
		}

		System.out.println();

	}

}
