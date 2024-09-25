package in.datastructuresJava;

public class Permutation {

	public static void main(String[] args) {
		int[] nums = new int[] {0,2,1,5,3,4};
		for (int num : permutation(nums)) {
			System.out.print(num + " ");
		}
}
	
	static int[] permutation(int[] arr) {
		int len = arr.length;
		int[] newArr = new int[len];
		for(int i=0; i<len; i++) {
			newArr[i] = arr[arr[i]];
		}
		return newArr;
	}
	
}
