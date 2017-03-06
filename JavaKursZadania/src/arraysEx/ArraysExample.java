package arraysEx;

import java.util.Arrays;

public class ArraysExample {
	
	
	/*
	 *  Istnieje jeszcze jedna bardzo u�yteczna i wydajna metoda kopiuj�ca elementy z jednej tablicy do drugiej, 
	 *  jednak znajduje si� ona w klasie System.

		Statyczna metoda System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		przyjmuje 4 parametry:
		
		tablic� �r�d�ow� (src)
		indeks od kt�rego chcemy skopiowa� elementy z tablicy �r�d�owej (srcPos)
		tablic�, do kt�rej kopiujemy (dest)
		indeks od kt�rego maj� by� wstawiane skopiowane elementy w tablicy wynikowej (destPos)
		ilo�� element�w do skopiowania (length)
	 */
	
	

	public static void main(String[] args) {

		String[] names = { "Basia", "Kasia", "Wojtek", "Agnieszka", "Kacper" };
		Integer[] numbers = { 4, 7, 2, 1, 14, 23, 10, 5 };

		System.out.println("Names: ");
		printArray(names);

		System.out.println("Nubers: ");
		printArray(numbers);
		System.out.println();

		// sortowanie
		System.out.println("Arrays.sort(numbers): ");
		Arrays.sort(numbers);
		printArray(numbers);

		System.out.println("Arrays.sort(names): ");
		Arrays.sort(names);
		printArray(names);

		// copyOf
		System.out.println("Numbers2, Arrays.copyOf(numbers): ");
		Integer[] numbers2 = Arrays.copyOf(numbers, numbers.length);
		printArray(numbers2);
		System.out.println();

		// equals
		System.out.println("Arrays.equals(numbers, numbers2): ");
		System.out.println(Arrays.equals(numbers, numbers2));
		System.out.println();

		// fill
		System.out.println("Arrays.fill(strings, Wacek)");
		String[] strings = new String[5];
		Arrays.fill(strings, "Wacek");
		printArray(strings);

	}

	public static <T> void printArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t + " ");
		}

		System.out.println();

	}

}
