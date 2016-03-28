
public class CombSort {
	public static void sort(int list[]) {
		double shrink = 1.3; 
		int gap = (int) (list.length/shrink);
		
		for (boolean swapped = true; swapped == true; gap /= 1.3) {
			if (gap < 1) {
				gap = 1;
				swapped = false;
			}

			for (int i = 0; i + gap < list.length; i++) {
				if (list[i] > list[i+gap]) {
					Compare.swap(list, i, i+gap);
					swapped = true;
				}
			}
		}
	}
}
