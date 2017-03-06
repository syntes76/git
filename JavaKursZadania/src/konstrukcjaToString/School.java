package konstrukcjaToString;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] students = new Student[3];
		students[0] = new Student("Jan", "Kowalski");
		students[1] = new Student("Maria", "Zawi³a");
		students[2] = new Student("Koral", "Gol");

		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}

	}

}
