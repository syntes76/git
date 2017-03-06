package arraysEx;

import java.util.Arrays;

public class ArraysExample {
	
	
	/*
	 *  Istnieje jeszcze jedna bardzo u¿yteczna i wydajna metoda kopiuj¹ca elementy z jednej tablicy do drugiej, 
	 *  jednak znajduje siê ona w klasie System.

		Statyczna metoda System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		przyjmuje 4 parametry:
		
		tablicê Ÿród³ow¹ (src)
		indeks od którego chcemy skopiowaæ elementy z tablicy Ÿród³owej (srcPos)
		tablicê, do której kopiujemy (dest)
		indeks od którego maj¹ byæ wstawiane skopiowane elementy w tablicy wynikowej (destPos)
		iloœæ elementów do skopiowania (length)
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
