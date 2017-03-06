package bubbleSort;

public class BubbleSort {

	public static void sortArr(int[] myArr) {

		int n = myArr.length - 1;

		while (n > 0) {
			int temp;
			for (int i = 0; i <= n; i++) {

				if (myArr[i] > myArr[i + 1]) {

					temp = myArr[i];
					myArr[i] = myArr[i + 1];
					myArr[i + 1] = temp;
					n--;

				}

			}

		}

	}

	public static void main(String[] args) {

		int[] arr = { 4, 2, 5, 1, 7 };

		sortArr(arr);

		for (int t : arr) {
			System.out.print(t + " ");
		}
	}
}
