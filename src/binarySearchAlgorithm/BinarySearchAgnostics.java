package binarySearchAlgorithm;

public class BinarySearchAgnostics {
	public static void main(String[] args) {
		int[] arr = { 2,16,22,35,56,68,79,100 };
		int target = 22;
		System.out.println(agnostics(arr,target));
	}
	static int agnostics(int[] arr,int target){
		int start=0;
		int end=arr.length-1;

		boolean isAsc=arr[start]<arr[end];
		/*boolean isAsc;
		if(start<end){
			isAsc=true;
		}else {
			isAsc=false;
		}*/

		while(start<=end){
			int mid=start+(end-start)/2;

			if(arr[mid]==target){
				return mid;
			}
			if(isAsc){
				System.out.println("Its ascending");
				if(target<arr[mid]){
					end=mid-1;
				}else{
					start=mid+1;
				}
			}else {
				System.out.println("Its descending");
				if(target>arr[mid]){
					end=mid-1;
				}else{
					start=mid+1;
				}
			}
		}
		return -1;
	}
}
