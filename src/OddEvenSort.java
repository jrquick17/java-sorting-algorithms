
public class OddEvenSort {
	public static void sort(int list[]) {
		if (list.length > 3) {
			boolean swapped = true;

			while(swapped) {
				swapped = false;

				for (int i = 1; i < list.length-1; i+=1) {
					if (list[i] > list[i+1]) {
						Compare.swap(list, i, i+1);
						swapped = true;
					}
				}

				for(int i = 0; i < list.length-1; i+=1) {
					if (list[i] > list[i+1]) {
						Compare.swap(list, i, i+1);
						swapped = true;
					}
				}
			}
		}
	}
}
