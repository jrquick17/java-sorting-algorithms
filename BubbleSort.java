
public class BubbleSort {
	public static void sort(int list[]) {
		for (boolean swapped = true; swapped == true;) {
			swapped = false;

			for (int i = 0; i < list.length-1; i++) {
				if (list[i] > list[i+1]) {
					Compare.swap(list, i, i+1);
					swapped = true;
				}
			}
		}
	}
}
