package in.datastructuresJava;

public class ReverseanArray {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void reverse(int[] arr,int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			 arr[end] = temp;
			 start++;
			 end--;
		}
		
	}
	

	public static void main(String[] args) {
		int[] arr = {3, 2, 4, 7, 10, 6, 5};
		ReverseanArray revrsArray = new ReverseanArray();
		revrsArray.printArray(arr);
		revrsArray.reverse(arr, 0, arr.length-1);
		revrsArray.printArray(arr);
		

	}

}
