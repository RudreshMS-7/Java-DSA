package in.datastructuresJava;

public class ResizeofanArray {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public int[] resize(int[] arr, int capacity) {
		int[] temp = new int[capacity];
		for(int i=0; i<arr.length; i++) {
			temp[i] = arr[i];
		}
		arr = temp;
		return temp;
	}
	

	public static void main(String[] args) {
		int[] arr = new int[] {3, 2,0,4,0,8,0 ,7, 10, 6, 5};
		
		ResizeofanArray reSize = new ResizeofanArray();
		reSize.printArray(arr);
		System.out.println("before array - " + arr.length );
		arr = reSize.resize(arr, 15);
		System.out.println("after array resize - " + arr.length);
		
		
	}

}
