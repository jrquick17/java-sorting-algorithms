
public class InsertionSort {
	public static void sort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			for (int c = i; c > 0 && list[c] < list[c-1]; c--) {
				Compare.swap(list, c, c-1);
			}
		}
	}
}
