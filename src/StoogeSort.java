
public class StoogeSort {
	private static void stoogesort(int list[], int i, int j) {
		if (list[j] < list[i]) {
			Compare.swap(list, i, j);
		} 
		
		int t = (j-i+1)/3;
		
		if (t >= 1) {
			stoogesort(list, i, j-t);
			stoogesort(list, i+t, j);
			stoogesort(list, i, j-t);
		}
	}
	public static void sort(int list[]) {
		stoogesort(list, 0, list.length-1);
	}
}
