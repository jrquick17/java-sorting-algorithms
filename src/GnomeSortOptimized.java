
public class GnomeSortOptimized {
	public static void sort(int list[]) {
		int i = 1;
		int e = 0;
		
		while (i < list.length){
			if (list[i] >= list[i-1]) {
				if (e != 0) {
					i = e;
					e = 0;
				}
				
				i++;
			} else {
				Compare.swap(list, i, i-1);
				
				if (i > 1) {
					if (e == 0) e = i;
					
					i--;
				} else {
					i++;
				}
			}
		}
	}
}
