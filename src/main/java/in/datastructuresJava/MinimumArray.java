package in.datastructuresJava;

public class MinimumArray {
	
	public int findMin(int[] arr) {
		if(arr == null || arr.length ==0 ) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		return min;
	}


	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 7, 10, 6, 5};
		MinimumArray minArray = new MinimumArray();
		minArray.findMin(arr);
		System.out.println(minArray.findMin(arr));
		
	}

}
