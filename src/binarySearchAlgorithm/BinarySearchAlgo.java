package binarySearchAlgorithm;

public class BinarySearchAlgo {
	public static void main(String[] args) {
		int[] arr = { -12, -10, -4, 0, 2, 6, 8, 12, 23, 45, 68 };
		int target = -4;
		System.out.println("The target element " + target + " is : " + performBinarySearch(arr, target));
	}

	static int performBinarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return arr[mid];
			}
		}
		return -1;

	}
}
