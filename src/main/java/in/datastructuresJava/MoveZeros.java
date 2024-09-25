package in.datastructuresJava;

public class MoveZeros {
	
	public void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void moveZeros(int[] arr, int n) {
		int j =0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0 && arr[j]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			if(arr[j]!=0) {
				j++;
			}
		}
	}
	

	public static void main(String[] args) {
		int[] arr = {3, 2,0,4,0,8,0 ,7, 10, 6, 5};
		MoveZeros movezeros = new MoveZeros();
		movezeros.printArray(arr);
		movezeros.moveZeros(arr, arr.length);
		movezeros.printArray(arr);

	}

}
