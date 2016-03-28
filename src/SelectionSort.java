
public class SelectionSort {
	public static void sort(int list[]) {
		for (int i = 0; i < list.length; i++) {
			int min = i;
			
			for (int j = i; j < list.length; j++) {
				if (list[j] <= list[min]) {
					min = j;
				}
			}
					
			Compare.swap(list, i, min);
		}
	}
}
