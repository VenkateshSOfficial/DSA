package binarySearchAlgorithm;

public class BinarySearchBoilerPlate {
	public static void main(String[] args) {
		int[] arr={12,34,56,91,105,124};
		int target=91;
		System.out.println(binarySearch(arr,target));
	}
	static int binarySearch(int[] arr,int target){
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			int mid=start+(end-start)/2;
			if(target==arr[mid]){
				return mid;
			} else if (target<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
}
