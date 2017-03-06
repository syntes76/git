package arraysEx;

public class ArraysCopyExample {
	
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
		// TODO Auto-generated method stub
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int[] numbers2 = new int[numbers1.length];
         
        System.arraycopy(numbers1, 4, numbers2, 0, numbers1.length-4);
         
        for(int num: numbers2) {
        	
        	System.out.println(num + " ");
        }
          
	}

}
