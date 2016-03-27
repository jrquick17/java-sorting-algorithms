import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;


public class Compare {
	public static void swap(int[] list, int a, int b) {
		int oa = list[a];

		list[a] = list[b];
		list[b] = oa;
	}

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("000000");
		Timer timer = new Timer();

		System.out.println("Minimum number of elements: ");
		int begin = scan.nextInt();
		System.out.println("Maximum number of elements: ");
		int end = scan.nextInt();
		System.out.println("Gap between tests: ");
		int gap = scan.nextInt();
		System.out.println("Number of tests: ");
		int tests = scan.nextInt();
		scan.close();
		
		long times[][] = new long[10][tests];

		System.out.println("\tInsert\tSelect\tBubble\tBubOp\tComb\tOddEven\tGnome\tGnomeOp\tStooge"); 
		for (int size = begin; size <= end; size += gap) {
			for (int test = 0; test < tests; test++) {
				int list[] = new int[size];
				for (int i = 0; i < size; i++) {
					list[i] = random.nextInt();
				}
				
				int origlist[] = list.clone();
				
				timer.start();
				InsertionSort.sort(list);
				timer.stop();
				times[0][test] = timer.getNano();
				timer.reset();
				
				timer.start();
				SelectionSort.sort(list);
				timer.stop();
				times[1][test] = timer.getNano();
				timer.reset();
				list = origlist.clone();
				
				timer.start();
				BubbleSort.sort(list);
				timer.stop();
				times[2][test] = timer.getNano();
				timer.reset();
				list = origlist.clone();
				
				timer.start();
				BubbleSortOptimized.sort(list);
				timer.stop();
				times[3][test] = timer.getNano();
				timer.reset();
				list = origlist.clone();
				
				timer.start();
				CombSort.sort(list);
				timer.stop();
				times[4][test] = timer.getNano();
				timer.reset();
				list = origlist.clone();
				
				timer.start();
				OddEvenSort.sort(list);
				timer.stop();
				times[5][test] = timer.getNano();
				timer.reset();
				list = origlist.clone();
				
				timer.start();
				GnomeSort.sort(list);
				timer.stop();
				times[6][test] = timer.getNano();
				timer.reset();
				list = origlist.clone();
				
				timer.start();
				GnomeSortOptimized.sort(list);
				timer.stop();
				times[7][test] = timer.getNano();
				timer.reset();
				list = origlist.clone();
				
				/*timer.start();
				StoogeSort.sort(list);
				timer.stop();
				times[8][test] = timer.getNano();
				timer.reset();*/
			}
			
			System.out.println(size + "\t" + df.format(average(times[0])) + "\t" + df.format(average(times[1])) + "\t" + df.format(average(times[2])) + 
					"\t" + df.format(average(times[3])) + "\t" + df.format(average(times[4])) + "\t" + df.format(average(times[5])) + 
					"\t" + df.format(average(times[6])) + "\t" + df.format(average(times[7])) + "\t" /*+ df.format(average(times[8]))*/);
		}
	}

	private static long average(long[] arr) {
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) 
			total += arr[i];
		
		return total/arr.length;
	}
}
