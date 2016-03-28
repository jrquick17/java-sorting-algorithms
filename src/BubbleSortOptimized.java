
public class BubbleSortOptimized {
	public static void sort(int list[]) {
		int n = list.length;
		for (boolean swapped = true; swapped == true;) {
			swapped = false;

			for (int i = 0; i < n-1; i++) {
				if (list[i] > list[i+1]) {
					Compare.swap(list, i, i+1);
					swapped = true;
				}
			}
			
			n--;
		}
	}
}
