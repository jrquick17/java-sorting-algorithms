
public class GnomeSort {
	public static void sort(int list[]) {
		int i = 1;

		while (i < list.length) {
			if (list[i] >= list[i-1]) {
				i++;
			} else {
				Compare.swap(list, i, i-1);

				if (i > 1) {
					i--;
				}
			}
		}
	}
}
