package cn.bonjour.algorithm;

public class FastSorting {
	public static int partition(int[] arr, int low, int high) {
		// select a pivot element
		int temp = arr[low];
		while (low < high) {
			while (low < high && temp <= arr[high]) {
				high--;
			}
			arr[low] = arr[high];
			arr[high] = temp;
			while (low < high && temp >= arr[low]) {
				low++;
			}
			arr[high] = arr[low];
			arr[low] = temp;
		}
		return low;
	}

	/*
	 * public void doSort(int[] arr) { if (arr.length>0) { sort(arr, 0,
	 * arr.length-1); } }
	 */

	public static void doFastSorting(int[] arr, int low, int high) {
		int middle = 0;
		if (high > low) {
			middle = partition(arr, low, high);
			if (middle > low) {
				doFastSorting(arr, low, middle - 1);
			}
			if (high > middle) {
				doFastSorting(arr, middle + 1, high);
			}
		} 
	}
}
