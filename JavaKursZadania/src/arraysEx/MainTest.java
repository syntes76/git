package arraysEx;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PersonDatabase<Person> persons = new PersonDatabase<>();
		Person p1 = new Person("Jan", "Kowalski", "125");
		Person p2 = new Person("Janusz", "Testowy", "625526");
		persons.addPerson(p1);
		System.out.println("Persons list in an array");
		persons.printPersons();

		System.out.println("Add next person: ");

		persons.addPerson(p2);

		System.out.println("Persons list in an array after update");
		persons.printPersons();

		System.out.println("Persons list in an array after update");
		System.out.println("Sorting array ");

		persons.printPersons();

		System.out.println("Writre first name or last name of person you are looking for : ");
		String lookForName = sc.nextLine();

		persons.findPerson(lookForName);
		sc.close();

	}

}
