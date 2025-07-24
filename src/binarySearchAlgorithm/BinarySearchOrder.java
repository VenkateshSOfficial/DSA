package binarySearchAlgorithm;

public class BinarySearchOrder {
	public static void main(String[] args) {
		int[] arr={-12,-8,-4,1,3,5,7,8,9};
		System.out.println(checkSortedOrder(arr));
		System.out.println(performBinarySearch(arr,-100));
	}
	static boolean checkSortedOrder(int[] arr){
		boolean ascOrder=arr[0]<arr.length-1;
		if(ascOrder){
			System.out.println("The array sorted in ascending order");
		} else if (!ascOrder) {
			System.out.println("The array sorted in descending order");
		}else {
			System.out.println("Jumble sorted");
		}
		return ascOrder;
	}

	static int performBinarySearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int midValue = start + (end - start) / 2;
			if (target < arr[midValue]) {
				end = midValue - 1;
			} else if (target > arr[midValue]) {
				start = midValue + 1;
			} else {
				return arr[midValue];
			}

		}
		return -1;
	}
}
