package in.ashokit;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][];
		arr[0] = new int[] {1,2};
		arr[1] = new int[] {4,5,7};
		arr[2]= new int[] {7,8,9};
		
		System.out.println(arr[1][2]);
	}

}
