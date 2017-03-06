package arraysEx;

import java.util.Arrays;


public class PersonDatabase<T> {

	// represents simple database , dedicated to collect informations about
	// person from class Person

	// methods add(Person p), remove(Person p), getPerson(int index) and findPerson(String mypersonName)
	
	
	private Person[] persons;
	int count = 0;

	public Person[] getPersons() {
		return persons;
	}

	public void setPersons(Person[] persons) {
		this.persons = persons;
	}

	public void addPerson(Person p) {

		if (count == 0) {
			persons = new Person[1];
			persons[count] = p;
			count++;

		}

		else {

			persons = Arrays.copyOf(persons, count + 1);
			persons[count] = p;
			count++;

		}

	}

	public void findPerson(String myperson) {

		for (int i = 0; i < persons.length; i++) {

			if (myperson.equals(persons[i].getLastName()) || myperson.equals(persons[i].getFirstName()))
				
			{
				System.out.println("Pozycja w tablicy: " + i + " nazwisko osoby: " +persons[i].getLastName());
				break;
			} else {
			continue;
			}
		}

	}

	public void printPersons() {

		for (int i = 0; i < persons.length; i++) {
			int id = i + 1;
			System.out.println("Id Person " + id + " " + persons[i]);
		

		}

	}
	
	public void removePerson(Person p) {

	// need to add code here

	}


}
